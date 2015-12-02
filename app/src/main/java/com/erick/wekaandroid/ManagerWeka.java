package com.erick.wekaandroid;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

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
    public static boolean DEBUG = false;
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

        double[] sensores = new double[dados.length];
        for(int i=0;i < dados.length; i++){
            sensores[i] = Double.valueOf(dados[i]);
        }
        Instance instance = inserirInstaciaWeka(sensores);

        if(DEBUG) {
            Log.d("INSTANCIA", instance.toString());
        }
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
            pred = classifier.classifyInstance(instance) ;
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
        List<Attribute> atributos = new ArrayList<>();

        atributos.add(new Attribute("Accel_modulo"));
        atributos.add(new Attribute("Accel_media"));
        atributos.add(new Attribute("Accel_desvio_padrao"));

        atributos.add(new Attribute("linear_modulo"));
        atributos.add(new Attribute("liner_media"));
        atributos.add(new Attribute("linear_desvio_padrao"));

        atributos.add(new Attribute("Gyro_modulo"));
        atributos.add(new Attribute("Gyro_media"));
        atributos.add(new Attribute("Gyro_desvio_padrao"));

        atributos.add(new Attribute("Azimuth"));
        atributos.add(new Attribute("Pitch"));
        atributos.add(new Attribute("Rotation_modulo"));

        atributos.add(new Attribute("Rotation_media"));
        atributos.add(new Attribute("Rotation_desvio_padrao"));
        //atributos.add(new Attribute("Proximity"));

        // Declara os rótulos dispóniveis para uma instacia a ser classificada.
        FastVector fvClassVal = new FastVector(2);
        fvClassVal.addElement("andando");
        fvClassVal.addElement("parado");
        fvClassVal.addElement("sentado");
        //fvClassVal.addElement("Desmaio");
        //fvClassVal.addElement("Crise Epileptica");

        atributos.add(new Attribute("Label", fvClassVal));

        // Define o formato, unindo os atributos e rotulos.
        FastVector fvWekaAttributes = new FastVector(atributos.size()+1);

        for (Attribute attribute: atributos) {
            fvWekaAttributes.addElement(attribute);
        }

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
        dataSet.setClassIndex(instanceAttributes.size() - 1); //Pega o indice que estão os rótulos

        Instance single_window = new SparseInstance(dataSet.numAttributes());

        for (int i=0; i < dados.length; i++) {
            single_window.setValue((Attribute) instanceAttributes.elementAt(i),dados[i]);
        }

        dataSet.add(single_window);
        single_window.setDataset(dataSet);

        return single_window;
    }


}
