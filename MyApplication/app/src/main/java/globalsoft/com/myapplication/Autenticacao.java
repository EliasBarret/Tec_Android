package globalsoft.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Autenticacao extends Activity {

    Button ok;
    EditText logon,senha;

    String num1 = "a";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacao);

        logon = (EditText) findViewById(R.id.etLog);
        senha = (EditText) findViewById(R.id.etKey);
        ok = (Button) findViewById(R.id.btOk);

        //nome = logon.getText().toString();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // verificar();
                String loginC = "elias";
                String senhaC = "123";
                String nome = logon.getText().toString();
                String senh = senha.getText().toString();

                if (nome.equals(loginC) && senh.equals(senhaC)){
                    Toast.makeText(Autenticacao.this,"entrou",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Autenticacao.this,"erro",Toast.LENGTH_LONG).show();

                }

            }
        });


    }

    private void verificar() {


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_autenticacao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
