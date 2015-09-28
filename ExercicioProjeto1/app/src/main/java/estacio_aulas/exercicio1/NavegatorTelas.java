package estacio_aulas.exercicio1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Elias Jobs on 17/09/2015.
 */
public class NavegatorTelas extends Activity {

    Ponte objreg;
    EditText etNome, etAno, etNomeConsult, etMaiorDidade;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Menu();
    }
    public void Menu(){

        setContentView(R.layout.activity_main__menu);
        Button btnCadastro = (Button) findViewById(R.id.btnCadastroMN);
        Button btnConsulta = (Button) findViewById(R.id.btnConsultaMN);

        btnCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Cadastro();
            }
        });

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Consulta();
            }
        });
    }

    public void Consulta(){

        setContentView(R.layout.activity_consulta);
        Button btnVolta2 = (Button) findViewById(R.id.btnVoltarConsult);

        etNomeConsult = (EditText) findViewById(R.id.etNomeConsult);
        etMaiorDidade = (EditText) findViewById(R.id.etMaiorDidade);

        etNomeConsult.setText(objreg.nome);

        if(objreg.ano<=1997){
            etMaiorDidade.setText("Você é Maior de Idade.: ");
        }else {
            etMaiorDidade.setText("Você é Menor de Idade");
        }

        btnVolta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu2();
            }
        });
    }

    public void Cadastro(){

        setContentView(R.layout.activity_cadastro);
        Button btnVolta = (Button) findViewById(R.id.btnVoltCadas);
        Button btnSalvar = (Button) findViewById(R.id.btnSalvar);

      //  onRestart();

        btnVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Menu();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                objreg = new Ponte();
                etNome = (EditText) findViewById(R.id.etNome);
                etAno = (EditText) findViewById(R.id.etAno);

                //gravando

                objreg.nome = etNome.getText().toString();
                objreg.ano = Integer.parseInt(etAno.getText().toString());

                Consulta();

            }
        });

    }

    public void Menu2(){


        setContentView(R.layout.activity_main__menu);


        Button btnCadastro = (Button) findViewById(R.id.btnCadastroMN);
        Button btnConsulta = (Button) findViewById(R.id.btnConsultaMN);

        TextView tv = new TextView(this);
        tv.setText("Bem vindo! Entrei aki ");
        setContentView(tv);



        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cadastro();
            }
        });

        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Consulta();
            }
        });
    }

    @Override
    public void onRestart(){
        super.onRestart();

        Menu2();
        //Log.d("Menu2","Entrou");
    }

}
