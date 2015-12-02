package com.erick.wekaandroid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

import weka.classifiers.Classifier;
import wekatools.WekaHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, WekaHelper.WekaHelperListerner{

    private static final String TAG = "MainActivity:";
    private ImageView buttonIniciaServico;
    private ImageView buttonParaServico;

    private static final String WEKA_DIRECTORY = "GripNavigation_Weka";
    private static String modelName = "";
    private WekaHelper wekaHelper = null;
    private EditText editTextAlgoritmo;
    Globals globalInstance = Globals.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextAlgoritmo = (EditText) findViewById(R.id.editText);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        this.buttonIniciaServico = (ImageView) findViewById(R.id.play);

        this.buttonParaServico = (ImageView) findViewById(R.id.stopService);

        this.buttonIniciaServico.setOnClickListener(this);
        this.buttonParaServico.setOnClickListener(this);

        this.buttonParaServico.setEnabled(false);

        Log.d(TAG, "onCreate completo");

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(preferences.getBoolean("prefAtivo", false)) {
            updateUI(true);
        }else{
            updateUI(false);
        }

    }

    public void updateUI(boolean opcao){
        if(opcao){
            this.buttonIniciaServico.setEnabled(false);
            this.buttonIniciaServico.setVisibility(View.GONE);

            this.buttonParaServico.setEnabled(true);
            this.buttonParaServico.setVisibility(View.VISIBLE);
        }else{
            this.buttonParaServico.setEnabled(false);
            this.buttonParaServico.setVisibility(View.GONE);

            this.buttonIniciaServico.setEnabled(true);
            this.buttonIniciaServico.setVisibility(View.VISIBLE);
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.play:
                Intent intent = new Intent(this, Servico.class);

                Toast.makeText(getApplicationContext(), "SERVIÇO INICIADO", Toast.LENGTH_LONG).show();

                updateUI(true);

                PowerManager mgr = (PowerManager) getSystemService(Context.POWER_SERVICE);
                PowerManager.WakeLock wakeLock = mgr.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyWakeLock");
                wakeLock.acquire();
                startService(intent);
                Log.d(TAG, "Serviço Iniciado.");

                break;
            case R.id.stopService:
                stopService(new Intent(this, Servico.class));
                Log.d(TAG, "Serviço finalizado.");

                updateUI(false);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_load_model) {
            File outPath = getWekaDirectory(MainActivity.WEKA_DIRECTORY);
            MainActivity.modelName = editTextAlgoritmo.getText().toString();
            File dataFile = new File(outPath, MainActivity.modelName);
            Log.d(TAG, "weka model to load: " + dataFile.getAbsolutePath());
            if (wekaHelper == null) {
                wekaHelper = new WekaHelper(this);
            }
            if (dataFile.exists()) {
                wekaHelper.loadModel(dataFile.getAbsolutePath());
            } else
                Toast.makeText(this, "Model doesn't exist. ABORT!", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    private File getWekaDirectory(String dirName) {
        // Get the directory for the public documents directory.
        File file = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOCUMENTS), dirName);

        if (!file.mkdirs()) {
            Log.e(TAG, "O diretorio Directory already exists - not created");
        }
        return file;
    }

    @Override
    public void onWekaModelLoaded(Classifier model) {
        if (model == null) {
            Log.d(TAG, "ruhroh");
            Toast.makeText(this, "Erro enquanto tentava carregar o modelo. ", Toast.LENGTH_SHORT).show();
        } else {
            globalInstance.setActiveModel(model);
            Log.d(TAG, "retreived model: " + model.toString());
            Toast.makeText(this, "Model loaded", Toast.LENGTH_SHORT).show();
        }
    }
}
