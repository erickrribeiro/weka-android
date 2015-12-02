package com.erick.wekaandroid;

import android.hardware.Sensor;

/**
 * Classe criada como o obejtivo de gerenciar os funcionalidade atuais e futuras aplicadas aos sensores que estamos utilizando.
 * Como o cálculo de módulo, da média e desvio padrão, assim como filtros e novas características derivadas dos eixos x, y e z.
 * Created by Erick on 02/12/2015.
 */
public class SensorUtilizado {
    private Sensor mSensor;
    private double x;
    private double y;
    private double z;
    private float modulo;
    private float media;
    private float desvio;
    private float janela[];

    public SensorUtilizado(){
        this.janela = new float[10];
    }
    public void atualizarEixos(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.modulo = (float) Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));

        janela[9] = janela[8];
        janela[8] = janela[7];
        janela[7] = janela[6];
        janela[6] = janela[5];
        janela[5] = janela[4];
        janela[4] = janela[3];
        janela[3] = janela[2];
        janela[2] = janela[1];
        janela[1] = janela[0];
        janela[0] = this.modulo;
        this.media = (janela[0] + janela[1] + janela[2] + janela[3] + janela[4]+ janela[5] + janela[6] + janela[7] + janela[8] + janela[9]) / 10;
        this.desvio = (float) ( Math.sqrt( (
                Math.pow((janela[0] - modulo), 2) + Math.pow((janela[1] - modulo), 2) +
                        Math.pow((janela[2] - modulo), 2) + Math.pow((janela[3] - modulo), 2) +
                        Math.pow((janela[3] - modulo), 2) + Math.pow((janela[4] - modulo), 2) +
                        Math.pow((janela[5] - modulo), 2) + Math.pow((janela[6] - modulo), 2) +
                        Math.pow((janela[7] - modulo), 2) + Math.pow((janela[8] - modulo), 2) +
                        Math.pow((janela[9] - modulo), 2)) /10 ));
    }

    public String getXYZ(){
        return this.x + ", " + this.y + ", " + this.z;
    }

    public String getXYZMeMoDes(){
        return x + ", " + y + ", " + z+ ", " + modulo+ ", " +media+ ", " +desvio;
    }

    public String getMeMoDes(){
        return modulo+ ", " +media+ ", " +desvio;
    }

}
