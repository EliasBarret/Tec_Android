package globalsoft.com.myapplication;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.Suppress;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AnimcaoRB extends AppCompatActivity {


    public int cont1 = 0;
    public int cont2 = 0;
    public int valorRot = 0;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("NewApi")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animcao_rb);

        Button button = (Button)findViewById(R.id.btnSub);
        Button btn = (Button)findViewById(R.id.btnlad);

        btn.animate().translationY(200).withLayer();
        button.animate().translationX(400).withLayer();

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("NewApi")
    public void acaoImagen(View v){
        if(valorRot!=360)
            valorRot +=90;
        else
            v.animate().rotation(valorRot);
    }

}
