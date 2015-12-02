package com.erick.wekaandroid;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

public class Servico extends Service implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private Sensor mGyroscope;
    private Sensor mMagField;
    private Sensor mOrientation;
    private Sensor mProximity;
    private Sensor mGravity;
    private Sensor mLinearAccel;
    private Sensor mRotation;
    private Sensor mStepCounter;
    private Sensor mTemperature;

    private String Orientation = "0.5" + "," + "0.5";



    private ManagerWeka managerWeka;

    private SensorUtilizado acelerometro;
    private SensorUtilizado aceleracaoLinear;
    private SensorUtilizado giroscopio;
    private SensorUtilizado rotacao;
    private float Proximity;

    @Override
    public void onStart(Intent intent, int startId) {
        this.acelerometro = new SensorUtilizado();
        this.aceleracaoLinear = new SensorUtilizado();
        this.giroscopio = new SensorUtilizado();
        this.rotacao = new SensorUtilizado();

        PowerManager mgr = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wakeLock = mgr.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyWakeLock");
        wakeLock.acquire();

        File f = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Sensors_log");
        Log.d("PATH", f.getAbsolutePath());

        if (!f.exists()) {
            Log.d("MAKE DIR", f.mkdirs() + "");
        }

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mGravity = mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
        mGyroscope = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        mRotation = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        mLinearAccel = mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        mProximity = mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        mStepCounter = mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        mTemperature = mSensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        mOrientation = mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        mMagField = mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        registerListener();
        this.managerWeka = new ManagerWeka();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        int typeSensor = event.sensor.getType();
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        synchronized (this){
            switch (typeSensor){
                case Sensor.TYPE_ACCELEROMETER:
                    this.acelerometro.atualizarEixos(x, y, z);

                    String completo =   this.acelerometro.getMeMoDes() + ","
                                  + this.aceleracaoLinear.getMeMoDes() + ","
                                  + this.giroscopio.getMeMoDes()       + ","
                                  + Orientation                        + ","
                                  + this.rotacao.getMeMoDes()          +"\n";

                    Log.d("Valores", completo);

                    String array[] = completo.split(",");
                    Log.d("Valores", ""+array.length);
                    this.managerWeka.classificar(array);

                    break;

                case Sensor.TYPE_LINEAR_ACCELERATION:
                    this.aceleracaoLinear.atualizarEixos(x, y, z);
                    break;

                case Sensor.TYPE_GYROSCOPE:
                    this.giroscopio.atualizarEixos(x, y,z);
                    break;

                case Sensor.TYPE_MAGNETIC_FIELD:
                    break;

                case Sensor.TYPE_ORIENTATION:
                    Orientation = x + ", " + y;
                    break;

                case Sensor.TYPE_PROXIMITY:
                    Proximity = x;
                    break;

                case Sensor.TYPE_GRAVITY:
                    break;


                case Sensor.TYPE_ROTATION_VECTOR:
                    this.rotacao.atualizarEixos(x, y, z);
                    break;

                case Sensor.TYPE_STEP_COUNTER:
                    break;
                case Sensor.TYPE_AMBIENT_TEMPERATURE:
                    break;
                default:
                    break;
            }
        }
    }

    public void registerListener() {

        Log.d("Acorda", "registerListener acordou!");
        PowerManager mgr = (PowerManager) getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wakeLock = mgr.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyWakeLock");
        wakeLock.acquire();

        mSensorManager.registerListener(this, mAccelerometer, 200000);
        mSensorManager.registerListener(this, mGyroscope, 200000);
        mSensorManager.registerListener(this, mMagField, 200000);
        mSensorManager.registerListener(this, mOrientation, 200000);
        mSensorManager.registerListener(this, mProximity, 200000);
        mSensorManager.registerListener(this, mGravity, 200000);
        mSensorManager.registerListener(this, mLinearAccel, 200000);
        mSensorManager.registerListener(this, mRotation, 200000);
        //mSensorManager.registerListener(this, mSignMotion, 200000);
        mSensorManager.registerListener(this, mStepCounter, SensorManager.SENSOR_DELAY_NORMAL);
        mSensorManager.registerListener(this, mTemperature, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Log.d("Precisao", "PRECISAO: " + accuracy + " SENSOR: " + sensor.getName());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy(){
        mSensorManager.unregisterListener(this);
        Toast.makeText(this, "Experimento realizado com SUCESSO!", Toast.LENGTH_LONG).show();

    }


}
