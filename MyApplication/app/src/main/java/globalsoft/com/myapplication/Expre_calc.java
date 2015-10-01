package globalsoft.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.evgenii.jsevaluator.JsEvaluator;
import com.evgenii.jsevaluator.interfaces.JsCallback;

public class Expre_calc extends Activity {

    EditText exps;
    Button ok;
    String pegacalc;
    JsEvaluator jsEvaluator = new JsEvaluator(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expre_calc);

        exps = (EditText) findViewById(R.id.etExp);
        ok = (Button) findViewById(R.id.btCalc);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pegacalc = exps.getText().toString();
                calc(pegacalc);

            }
        });

    }

    public void calc(final String exp) {
        try {
            jsEvaluator.evaluate(exp, new JsCallback() {
                @Override
                public void onResult(final String result) {
                    String mostra = pegacalc += " = " + result;
                    exps.setText(pegacalc);
                }

            });
        } catch (Exception A) {
            Toast.makeText(this, "Erro De Syntax", Toast.LENGTH_LONG).show();

        }
    }
}
