package com.erick.wekaandroid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MotionEvent;
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
    public static final String TAG = null;
    public static final int SCREEN_OFF_RECEIVER_DELAY = 200;
    private AlarmManager am;
    private PendingIntent mAlarmSender;

    private String Accel = "0.0" + "," + "0.0" + "," + "0.0";
    private String linearAccel = "0.0" + "," + "0.0" + "," + "0.0";
    private String Gyro = "0.0" + "," + "0.0" + "," + "0.0";
    private String Orientation = "0.0" + "," + "0.0" + "," + "0.0";
    private String Rotation = "0.0" + "," + "0.0" + "," + "0.0";
    private String Proximity = "8.0" ;

    private Ringtone ringtone;
    private ManagerWeka managerWeka;


    @Override
    public void onStart(Intent intent, int startId) {

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
        double x = event.values[0];
        double y = event.values[1];
        double z = event.values[2];

        synchronized (this){
            switch (typeSensor){
                case Sensor.TYPE_ACCELEROMETER:
                    Accel = x + ", " + y + ", " + z ;  // Accel
                    //  escrevendo o arquivo completo com todos os sensores
                    // "Accel_x, Accel_y, Accel_z, linearAccel_x, linearAccel_y, linearAccel_z, Gyro_x, Gyro_y, Gyro_z, Azimuth, Pitch, Roll, Rotation_x, Rotation_y, Rotation_z, Proximity, timeStamp, Label
                    String completo = Accel + "," + linearAccel + "," + Gyro + "," + Orientation + "," + Rotation+ "\n";

                    //Log.d("Valores", completo);

                    String array[] = completo.split(",");
                    Log.d("Valores", ""+array.length);
                    this.managerWeka.classificar(array);

                    break;

                case Sensor.TYPE_GYROSCOPE:
                    Gyro = x + ", " + y + ", " + z;
                break;

                case Sensor.TYPE_MAGNETIC_FIELD:
                    break;

                case Sensor.TYPE_ORIENTATION:
                    Orientation = x + ", " + y + ", " + z;
                    break;

                case Sensor.TYPE_PROXIMITY:
                    Proximity = x+"";
                    break;

                case Sensor.TYPE_GRAVITY:
                    break;

                case Sensor.TYPE_LINEAR_ACCELERATION:
                    linearAccel = x + ", " + y + ", " + z;
                    break;

                case Sensor.TYPE_ROTATION_VECTOR:
                    Rotation = x + ", " + y + ", " + z;
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

    public BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG, "onReceive("+intent+")");



            if (!intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
                return;
            }

            Runnable runnable = new Runnable() {
                public void run() {
                    Intent intent1 = new Intent(getApplicationContext(),Servico.class);
                    mAlarmSender = PendingIntent.getService(getApplicationContext(), 0, intent1, 0);
                    am = (AlarmManager)getSystemService(ALARM_SERVICE);
                    am.setRepeating(AlarmManager.RTC, 0, 200, mAlarmSender);
                    Log.i(TAG, "Runnable executing.");
                  //  unregisterListener();
                    registerListener();
                }
            };

            new Handler().postDelayed(runnable, SCREEN_OFF_RECEIVER_DELAY);
        }
    };

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
