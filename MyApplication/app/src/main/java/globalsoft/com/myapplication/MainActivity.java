package globalsoft.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    /*
    *
    * Developement For Elias Barreto By GlobalSoft
    *
    */
    public void Tela2(View View){

        EditText nome = (EditText)findViewById(R.id.etNome);
        EditText Ano = (EditText) findViewById(R.id.edtAno);
        double num1 = Double.parseDouble(Ano.getText().toString());


        Bundle params = new Bundle();



        if (num1<=1996){
            params.putString("nome", nome.getText().toString());
            params.putString("Ano"," Você é Maior de Idade ");


        }else{
            params.putString("nome", nome.getText().toString());
            params.putString("Ano"," Você é Menor de Idade ");
        }


        Intent i = new Intent(this,tela2.class);
        i.putExtras(params);
        startActivity(i);
    }
}

/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/
