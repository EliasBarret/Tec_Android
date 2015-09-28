package globalsoft.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/
public class tela2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tela2);


        Intent i = getIntent();

        if (i != null) {
            Bundle params = i.getExtras();
            if (i != null) {

                String nome = params.getString("nome");
                String Fra = params.getString("Ano");


                EditText ai = (EditText) findViewById(R.id.result);
                EditText ax = (EditText) findViewById(R.id.edtDmaior);
                ai.setText(nome);
                ax.setText(Fra);
            }
        }
    }
/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/
}


