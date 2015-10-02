package globalsoft.com.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//import com.globalsoft.ExecicioCalc.LetraAcalc;


/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/
public class MenuTela extends ListActivity {

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] itens = new String[]{"Aplicativo De Cadastro", "ProvaAV1", "ExeFichaMat.(A)","ExeFichaMat.(B)","ExeFichaMat.(C)","ExeFichaMat.(D)","ExeFichaMat.(E)"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, itens);
        setListAdapter(arrayAdapter);
    }
    /*
*
* Developement For Elias Barreto By GlobalSoft
*
*/
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch (position) {
            case 0:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, CalculadoraAV1.class));
                break;
            case 2:
                startActivity(new Intent(this, ExeCalcA.class));
                break;
            case 3:
                startActivity(new Intent(this, Autenticacao.class));
                break;
            case 4:
                startActivity(new Intent(this, Expre_calc.class));
                break;
            case 5:
                Toast.makeText(this,"Exercicios Adicionados na Lista de Exercicios",Toast.LENGTH_LONG).show();
                break;
            case 6:
                //Toast.makeText(this,"exercicio6",Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, CalculadoraSimples.class));
                break;
           /* case 7:
                Toast.makeText(this,"exercicio7",Toast.LENGTH_LONG).show();
                break;
            case 8:
                Toast.makeText(this,"exercicio8",Toast.LENGTH_LONG).show();
                break;
            case 9:
                Toast.makeText(this,"exercicio9",Toast.LENGTH_LONG).show();
                break;
            case 10:
                Toast.makeText(this,"exercicio10",Toast.LENGTH_LONG).show();
                break;*/
            default:
                finish();

        }
    }
}

/*
*
* Developement For Elias Barreto By GlobalSoft
*
*/