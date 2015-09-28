package estacio_aulas.exercicio1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
/**
 * Created by Elias Jobs on 17/09/2015.
 */
public class Ciclo extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
       @Override
       public void onStart() {
           super.onStart();
       }

        @Override
        public void onRestart(){
            super.onRestart();

        }
        @Override
        public void onPause(){
            super.onPause();
        }


        @Override
        public void onDestroy(){
            super.onDestroy();
        }

        @Override
        public void onResume(){
            super.onResume();
         }

        public void onStop(){
            super.onStop();
        }

}
