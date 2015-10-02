package globalsoft.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;


public class CalculadoraSimples extends Activity {

    Button b1x, b2x, b3x, b4x, b5x, b6x, b7x, b8x, b9x, b0x, btIgualx, btSomax, btDivx, btMenosx, btVezesx, bpontox, Pare1, Pare2, Acx, Belevado, Braiz, bdel;
    TextView visorx;
    String kx;
    JsEvaluator jsEvaluator = new JsEvaluator(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);


        visorx = (TextView) findViewById(R.id.TvTela);
        kx = visorx.getText().toString();

        b1x = (Button) findViewById(R.id.b1x);
        b1x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "1");

            }
        });
        b2x = (Button) findViewById(R.id.b2x);
        b2x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "2");
            }
        });
        b3x = (Button) findViewById(R.id.b3x);
        b3x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "3");
            }
        });
        b4x = (Button) findViewById(R.id.b4x);
        b4x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "4");
            }
        });
        b5x = (Button) findViewById(R.id.b5x);
        b5x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "5");
            }
        });
        b6x = (Button) findViewById(R.id.b6x);
        b6x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "6");
            }
        });
        b7x = (Button) findViewById(R.id.b7x);
        b7x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "7");
            }
        });
        b8x = (Button) findViewById(R.id.b8x);
        b8x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "8");
            }
        });
        b9x = (Button) findViewById(R.id.b9x);
        b9x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "9");
            }
        });
        b0x = (Button) findViewById(R.id.b0x);
        b0x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "0");
            }
        });

        Acx = (Button) findViewById(R.id.bac);
        Acx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kx = "";
                visorx.setText("");
            }
        });

        // Operações
        btIgualx = (Button) findViewById(R.id.biga);
        btIgualx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (kx.trim().equals("")) {
                } else {
                    calc(kx);
                }
            }
        });
        btSomax = (Button) findViewById(R.id.bMa);
        btSomax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "+");
            }
        });
        btMenosx = (Button) findViewById(R.id.bMe);
        btMenosx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "-");
            }
        });
        btDivx = (Button) findViewById(R.id.bdivx);
        btDivx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "/");
            }
        });
        btVezesx = (Button) findViewById(R.id.bV);
        btVezesx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visorx.setText(kx += "*");
            }
        });
        bpontox = (Button) findViewById(R.id.bPox);
        bpontox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visorx.setText(kx += ".");

            }

        });

    }

    public void calc(String exp) {
        try {
            jsEvaluator.evaluate(exp, new JsCallback() {
                @Override
                public void onResult(final String result) {
                    String xe = String.valueOf(result);
                    kx+=" = "+xe;
                    visorx.setText(kx);
                }

            });
        } catch (Exception A) {
            Toast.makeText(this, "Erro De Syntax", Toast.LENGTH_LONG).show();
        }
    }
}

