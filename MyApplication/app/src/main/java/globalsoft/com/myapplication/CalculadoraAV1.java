package globalsoft.com.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;

import java.text.DecimalFormat;

public class CalculadoraAV1 extends Activity  {
    /*
    *
    * Developement For Elias Barreto By GlobalSoft
    *
    */
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, btIgual, btSoma, btDiv, btMenos, btVezes, bponto, Pare1, Pare2, Ac, Belevado, Braiz, bdel;
    TextView visor;
    String k;
    JsEvaluator jsEvaluator = new JsEvaluator(this);
   // boolean veriP = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora_av1);
        visor = (TextView) findViewById(R.id.telaCalc);
        k = visor.getText().toString();

        b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "1");
                Vibrar();

            }
        });
        b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "2");
                Vibrar();
            }
        });
        b3 = (Button) findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "3");
                Vibrar();
            }
        });
        b4 = (Button) findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "4");
                Vibrar();
            }
        });
        b5 = (Button) findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "5");
                Vibrar();
            }
        });
        b6 = (Button) findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "6");
                Vibrar();
            }
        });
        b7 = (Button) findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "7");
                Vibrar();
            }
        });
        b8 = (Button) findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "8");
                Vibrar();
            }
        });
        b9 = (Button) findViewById(R.id.btn9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "9");
                Vibrar();
            }
        });
        b0 = (Button) findViewById(R.id.btn0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "0");
                Vibrar();
            }
        });

        Pare1 = (Button) findViewById(R.id.btnPare1);
        Pare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += ")");
                Vibrar();
            }
        });
        Pare2 = (Button) findViewById(R.id.btnPare2);
        Pare2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "(");
                Vibrar();
            }
        });
        Ac = (Button) findViewById(R.id.btDel);
        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                k = "";
                visor.setText("");
                Vibrar();
            }
        });

        // Operações
        btIgual = (Button) findViewById(R.id.btnIgual);
        btIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (k.trim().equals("")) {
                    Trat();
                    VibrarErro();
                } else {
                    calc(k);
                    Vibrar();
                }
            }
        });
        btSoma = (Button) findViewById(R.id.btnMais);
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "+");
                Vibrar();
            }
        });
        btMenos = (Button) findViewById(R.id.btnMenos);
        btMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "-");
                Vibrar();
            }
        });
        btDiv = (Button) findViewById(R.id.btnDiv);
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "/");
                Vibrar();
            }
        });
        btVezes = (Button) findViewById(R.id.btnVezes);
        btVezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                visor.setText(k += "*");
                Vibrar();
            }
        });
        bponto = (Button) findViewById(R.id.btnPonto);
        bponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  if (!veriP) {
                visor.setText(k += ".");
                //veriP = true;
                Vibrar();
                // } else {
                return;
                //   }
            }

        });

        Belevado = (Button) findViewById(R.id.btnElevado);
        Belevado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MxELEVADO(k);
                Vibrar();
            }
        });
        Braiz = (Button) findViewById(R.id.btnRaiz);
        Braiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MRaiz(k);
                Vibrar();
            }
        });

        bdel = (Button) findViewById(R.id.btDel1);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (k.length() > 0) {
                    k = k.substring(0, k.length() - 1);
                    visor.setText(k);
                }

            }
        });

    }

    /*
    *
    * Developement For Elias Barreto By GlobalSoft
    *
    *
    */

    public void calc(String exp) {
        try {
            jsEvaluator.evaluate(exp, new JsCallback() {
                @Override
                public void onResult(final String result) {

                    String xc = String.valueOf(result);
                    k="";
                    k+=xc;
                    visor.setText(k);

                }

            });
        } catch (Exception A) {
            Toast.makeText(this, "Erro De Syntax", Toast.LENGTH_LONG).show();
            VibrarErro();
        }
    }

    public void MRaiz(String ki) {
        try {
            double res = Double.parseDouble(ki);
            String Ra = String.valueOf(Math.sqrt(res));
            k="";
            k+=Ra;
            visor.setText(Ra);
        } catch (Exception A) {
            Toast.makeText(this, "Erro De Syntax", Toast.LENGTH_LONG).show();
            VibrarErro();
        }
    }


    public void MxELEVADO(String x) {
        try {
            double res = Double.parseDouble(x);
            String ele = String.valueOf(Math.pow(res, 2));
            k="";
            k+=ele;
            visor.setText(ele);

        } catch (Exception A) {
            Toast.makeText(this, " Erro De Syntax ", Toast.LENGTH_LONG).show();
            VibrarErro();
        }
    }

    private void Vibrar() {
        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milliseconds = 30;//'30' é o tempo em milissegundos, é basicamente o tempo de duração da vibração. portanto, quanto maior este numero, mais tempo de vibração você irá ter
        rr.vibrate(milliseconds);
    }

    public void formatarSaida(double resultado) {

        try {
            DecimalFormat formatar = new DecimalFormat("0");
            if (resultado % 1 == 0) {
                visor.setText(formatar.format(resultado));
                k = visor.getText().toString();
            } else {
                visor.setText(String.valueOf(resultado));
            }
        } catch (Exception A) {
            Toast.makeText(this, " Erro De Syntax ", Toast.LENGTH_LONG).show();
        }
    }

    private void VibrarErro() {
        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milliseconds =40;//'30' é o tempo em milissegundos, é basicamente o tempo de duração da vibração. portanto, quanto maior este numero, mais tempo de vibração você irá ter
        rr.vibrate(milliseconds);
    }

    public void Trat() {
        Toast.makeText(this, " Erro de Sintax ", Toast.LENGTH_LONG).show();
        return;
    }
}
/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/