package globalsoft.com.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class activity_fadein extends AppCompatActivity {

    TextView txtMenssage;
    Animation animFadeIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_fadein);
        txtMenssage = (TextView) findViewById(R.id.txtMenssagem);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        txtMenssage.startAnimation(animFadeIn);
    }
}
