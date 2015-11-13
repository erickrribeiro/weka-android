package com.erick.wekaandroid;

import android.util.Log;

import weka.classifiers.Classifier;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

/**
 * Created by Erick Ribeiro 13/11/2015
 *
 * Essa classe tem como objetivo servir como um mecanismo de conversão dos dados dos sensores vindos
 * do dispositivo, para o formato de Instacias do Weka.
 */

public class ManagerWeka {
    /**
     * Classficar generico que recebe os dados vindo do .model.
     */
    private Classifier classifier;

    /**
     * Tag para debug
     */
    private static final String TAG = "MANAGER WEKA";

    public ManagerWeka(){
        Globals globals = Globals.getInstance();
        classifier = globals.getActiveModel();
    }

    /**
     * Método responsável por classificar uma instancia no formato de um array de Strings.
     * @param dados
     */
    public void classificar(String[] dados){

        double[] sensores = new double[15];
        for(int i=0;i < dados.length; i++){
            sensores[i] = Double.valueOf(dados[i]);
        }
        Instance instance = inserirInstaciaWeka(sensores);
        executarClassificador(instance);
    }

    /**
     * Método responsável por executar o classicador, dado uma instancia formata.
     * @param instance
     */
    private void executarClassificador(Instance instance){
        //Log.d(TAG, "Início da classificação da instancia");
        double pred;

        try {
            pred = classifier.classifyInstance(instance);
            Log.d(TAG,"Rotulo: "+instance.classAttribute().value((int) pred));
            //Log.d(TAG, "Encerramento da classificação da instancia.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    /**
     * Método responsável por criar definir o formato padrao de um instancia, definindo a quantidade
     * de atribução e o rotulo disponíveis.
     *
     * @return
     */
    private FastVector getFormatDefaultInstanceAttribute() {
        // Declara os atributos da instancia
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

        // Declara os rótulos dispóniveis para uma instacia a ser classificada.
        FastVector fvClassVal = new FastVector(2);
        fvClassVal.addElement("andando");
        fvClassVal.addElement("parado");
        fvClassVal.addElement("sentado");
        fvClassVal.addElement("Desmaio");
        fvClassVal.addElement("Crise Epileptica");
        Attribute classAttribute = new Attribute("Label", fvClassVal);

        // Define o formato, unindo os atributos e rotulos.
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

    /**
     * Método responsável por converter um array de dados, contendo os valores dos sensores lidos,
     * e converte-los para uma instancia, no formato que foi definido no getFormatDefaultInstanceAttribute.
     * @param dados
     * @return
     */
    private Instance inserirInstaciaWeka(double[] dados){

        FastVector instanceAttributes = getFormatDefaultInstanceAttribute();
        Instances dataSet = new Instances("AccWindowInstance", instanceAttributes, 0);
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
