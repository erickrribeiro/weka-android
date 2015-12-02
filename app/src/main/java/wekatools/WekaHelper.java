package wekatools;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import weka.classifiers.Classifier;

/**
 * Created by ahmadul.hassan on 2015-03-26.
 * Alterado por Erick Ribeiro 13/11/2015
 *
 * Essa classe tem como objetivo, facilitar o carregamento de um .model, exportado do Weka.
 */
public class WekaHelper {
    private static final String TAG = "WekaHelper";

    public interface WekaHelperListerner {
        void onWekaModelLoaded(Classifier model);
    }

    private WekaHelperListerner mListener = null;

    private Context mContext;

    private Classifier modelCls = null;

    /**
     * Esse contrutor deve receber como paramentro o contexto da aplicação.
     * .model no disposito.
     * @param context
     */
    public WekaHelper(Context context) {
        mContext = context;
        mListener = (WekaHelperListerner) mContext;
    }

    /**
     * Método responsável por carregar o arquivo .model do dispositivo.
     * @param filePath
     */
    public void loadModel(String filePath) {
        Log.d(TAG, "Iniciando a execução do LoadModel");
        File dataFile = new File(filePath);
        if (dataFile.exists()) {
            WekaLoadModel weka = new WekaLoadModel();
            weka.execute(filePath);
        } else {
            Toast.makeText(mContext, "Model não Existe. Operação ABORTA!", Toast.LENGTH_SHORT).show();
        }
    }

    private class WekaLoadModel extends AsyncTask <String, Integer, Classifier> {
        private static final String TAG = "WekaLoadModel";
        private File mLoadPath;

        @Override
        protected Classifier doInBackground(String... filePaths) {
            String dataSetPath = filePaths[0];
            Log.d(TAG, "Carregando .model do arquivo file @ " + dataSetPath);
            mLoadPath = new File(dataSetPath);
            try {
                modelCls = loadModel(mLoadPath);
            } catch (Exception e) {
                Log.d(TAG, e.getMessage());
            }
            return modelCls;
        }

        private Classifier loadModel(File targetPath) throws Exception {
            Classifier classifier;

            FileInputStream fis = new FileInputStream(targetPath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            classifier = (Classifier) ois.readObject();
            ois.close();

            return classifier;
        }

        @Override
        protected void onPostExecute(Classifier result) {
            mListener.onWekaModelLoaded(result);
        }
    }
}
