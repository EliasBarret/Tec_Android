package globalsoft.com.adrianoexercicio1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaSegundaActivity(View View){

        EditText nome = (EditText)findViewById(R.id.nomeCampo);
        EditText Ano = (EditText) findViewById(R.id.editTextNascimento);
        double num1 = Double.parseDouble(Ano.getText().toString());

        Bundle params = new Bundle();

        if (num1<=1996){
            params.putString("nome", nome.getText().toString());
            params.putString("Ano"," Você é Maior de Idade ");


        }else{
            params.putString("nome", nome.getText().toString());
            params.putString("Ano"," Você é Menor de Idade ");
        }

        Intent intencao = new Intent(this,Atividade2.class);

        intencao.putExtras(params);
        startActivity(intencao);


    }

}
