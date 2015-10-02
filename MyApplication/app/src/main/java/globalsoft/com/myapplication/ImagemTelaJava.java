package globalsoft.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ImagemTelaJava extends Activity {

    String nome= "elias";
    String se = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem_tela_java);


        ImageView i3 = (ImageView) findViewById(R.id.imageView2);
        i3.setImageResource(R.drawable.smile);

        TextView i7 = (TextView) findViewById(R.id.dadosImage);
        i7.setText("Login = "+nome+"|| \n Senha = "+se);

    }


}
