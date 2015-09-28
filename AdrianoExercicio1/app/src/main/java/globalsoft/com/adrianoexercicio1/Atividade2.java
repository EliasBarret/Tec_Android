package globalsoft.com.adrianoexercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Atividade2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade2);

        Intent intencao = getIntent();
        if (intencao != null) {
            Bundle params = intencao.getExtras();
            if (intencao != null) {

                String nome = params.getString("nome");
                String Fra = params.getString("Ano");

                EditText ai = (EditText) findViewById(R.id.etMostrarNome);
                EditText ax = (EditText) findViewById(R.id.etDmaior);
                ai.setText(nome);
                ax.setText(Fra);
            }
        }
    }
}