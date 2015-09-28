package globalsoft.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class ExeCalcA extends AppCompatActivity {
        Button Soma, subtra,div, mult;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_letra_acalc);



            Soma = (Button) findViewById(R.id.btnSomaCalcA);
            subtra = (Button) findViewById(R.id.btnSubCalcA);
            div = (Button) findViewById(R.id.btnDivCalcA);
            mult = (Button) findViewById(R.id.btnMultCalcA);

            Operacaos();

        }

        public void Operacaos() {
            Soma.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Soma();

                }
            });

            subtra.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Sub();

                }
            });

            div.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Div();

                }
            });

            mult.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Mult();

                }
            });
        }



        public void Soma(){
           // setContentView(R.layout.activity_letra_acalc);

            EditText a = (EditText) findViewById(R.id.tfDadoA1);
            EditText b = (EditText) findViewById(R.id.tfDadoA2);
            EditText result = (EditText) findViewById(R.id.tfResulCalcA);

            int a1 = Integer.parseInt(a.getText().toString());
            int b1 = Integer.parseInt(b.getText().toString());

            int res = a1+b1;
            Integer z = res;
            result.setText(z.toString());

        }

        public void Sub(){
            EditText a = (EditText) findViewById(R.id.tfDadoA1);
            EditText b = (EditText) findViewById(R.id.tfDadoA2);
            EditText result = (EditText) findViewById(R.id.tfResulCalcA);

            int a1 = Integer.parseInt(a.getText().toString());
            int b1 = Integer.parseInt(b.getText().toString());

            int res = a1-b1;
            Integer z = res;
            result.setText(z.toString());
        }

        public void Div(){

            EditText a = (EditText) findViewById(R.id.tfDadoA1);
            EditText b = (EditText) findViewById(R.id.tfDadoA2);
            EditText result = (EditText) findViewById(R.id.tfResulCalcA);

            int a1 = Integer.parseInt(a.getText().toString());
            int b1 = Integer.parseInt(b.getText().toString());

            int res = a1/b1;
            Integer z = res;
            result.setText(z.toString());
        }

        public void Mult(){
            EditText a = (EditText) findViewById(R.id.tfDadoA1);
            EditText b = (EditText) findViewById(R.id.tfDadoA2);
            EditText result = (EditText) findViewById(R.id.tfResulCalcA);

            int a1 = Integer.parseInt(a.getText().toString());
            int b1 = Integer.parseInt(b.getText().toString());

            int res = (a1) * (b1);
            Integer z = res;
            result.setText(z.toString());
        }

    }

