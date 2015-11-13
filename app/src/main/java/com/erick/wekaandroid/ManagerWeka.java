package com.erick.wekaandroid;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import weka.classifiers.Classifier;
import weka.classifiers.misc.SerializedClassifier;
import weka.core.Attribute;
//import weka.core.DenseInstance;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

public class ManagerWeka {
    private Context context;
    private File tempFile;
    private Classifier classifier;
    private WekaWrapper wrapper;

    public ManagerWeka(Context context){

        Globals globals = Globals.getInstance();
        classifier = globals.getActiveModel();
    }

    public ManagerWeka(){
        wrapper = new WekaWrapper();
    }

    private Instances dataSet;

    private void executarClassificador(Instance instanceTest){
		System.out.println("Inicio");

        double pred = 0;
        try {
            pred = classifier.classifyInstance(instanceTest);
            //pred = this.wrapper.classifyInstance(instanceTest);
            //System.out.print(instanceTest.toString(instanceTest.classIndex()) + " - ");
            System.out.print(instanceTest.classAttribute().value((int) pred) + " - ");

            System.out.println("Fim");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    public void classificar(String[] dados){

        double[] sensores = new double[15];
        for(int i=0;i < dados.length; i++){
            sensores[i] = Double.valueOf(dados[i]);
        }
        Instance instance = inserirInstaciaWeka(sensores);
        //Log.d("Instance", instance.toString());
        executarClassificador(instance);
    }

    private FastVector getAccInstanceAttributes() {
        // Declare the numeric attributes
        Attribute accelx = new Attribute("Accel_x");
        Attribute accely = new Attribute("Accel_y");
        Attribute accelz = new Attribute("Accel_z");

        Attribute linearAccelx = new Attribute("linearAccelx");
        Attribute linearAccely = new Attribute("linearAccely");
        Attribute linearAccelz = new Attribute("linearAccelz");

        Attribute Gyro_x = new Attribute("Gyro_x");
        Attribute Gyro_y = new Attribute("Gyro_y");
        Attribute Gyro_z = new Attribute("Gyro_z");

        Attribute Azimuth = new Attribute("Azimuth");
        Attribute Pitch = new Attribute("Pitch");
        Attribute Roll = new Attribute("Roll");

        Attribute Rotation_x = new Attribute("Rotation_x");
        Attribute Rotation_y = new Attribute("Rotation_y");
        Attribute Rotation_z = new Attribute("Rotation_z");

        // Declare the class attribute along with its values
        FastVector fvClassVal = new FastVector(2);
        fvClassVal.addElement("andando");
        fvClassVal.addElement("parado");
        fvClassVal.addElement("sentado");
        fvClassVal.addElement("Desmaio");
        fvClassVal.addElement("Crise Epileptica");
        Attribute classAttribute = new Attribute("Label", fvClassVal);

        // Declare the feature vector
        FastVector fvWekaAttributes = new FastVector(16);

        fvWekaAttributes.addElement(accelx);
        fvWekaAttributes.addElement(accely);
        fvWekaAttributes.addElement(accelz);

        fvWekaAttributes.addElement(linearAccelx);
        fvWekaAttributes.addElement(linearAccely);
        fvWekaAttributes.addElement(linearAccelz);

        fvWekaAttributes.addElement(Gyro_x);
        fvWekaAttributes.addElement(Gyro_y);
        fvWekaAttributes.addElement(Gyro_z);

        fvWekaAttributes.addElement(Azimuth);
        fvWekaAttributes.addElement(Pitch);
        fvWekaAttributes.addElement(Roll);

        fvWekaAttributes.addElement(Rotation_x);
        fvWekaAttributes.addElement(Rotation_y);
        fvWekaAttributes.addElement(Rotation_z);

        fvWekaAttributes.addElement(classAttribute);

        return fvWekaAttributes;
    }


    private Instance inserirInstaciaWeka(double[] dados){

        FastVector instanceAttributes = getAccInstanceAttributes();
        dataSet = new Instances("AccWindowInstance", instanceAttributes, 0);
        dataSet.setClassIndex(15);

        Instance single_window = new SparseInstance(dataSet.numAttributes());

        for (int i=0; i < dados.length; i++) {
            single_window.setValue((Attribute) instanceAttributes.elementAt(i),dados[i]);
        }

        dataSet.add(single_window);
        single_window.setDataset(dataSet);

        return single_window;
    }


}
