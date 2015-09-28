package com.example.primeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	private Button btn1;
	private Button btn5;

	final EditText txtNome =(EditText) findViewById(R.id.Tf1);
	final TextView txtRes =(TextView) findViewById(R.id.txtres);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Associa acitivy_main.xml à classe atual
		setContentView(R.layout.activity_main);

		//setContentView(R.layout.activity_main_cadastro_tela);

		// Associando os objetos em XML da UI aos objetos Java declarados na
		// classe

		btn5 = (Button) findViewById(R.id.buttonCadastMain);
		btn1 = (Button) findViewById(R.id.button1);


		// Criando OnClickListener e setando o no botao btn1
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Botao 1", Toast.LENGTH_SHORT).show();

				String nome = txtNome.getText().toString();
				txtRes.setText("obrigado" + nome);
			}
		});

		// Criando OnClickListener e setando o no botao btn1

		btn5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
			 Intent intent1 = new Intent(MainActivity.this, MainCadastroTela.class);
				startActivity(intent1);
			}
		});




	}

	@Override
	public void onClick(View view) {

	}

	//@Override
	//public void onClick(View v) {
	//	switch(v.getId()){
	//	case R.id.button1:
	//		Toast.makeText(getApplicationContext(), "Botao 3", Toast.LENGTH_SHORT).show();
	//		break;
	//	}

//	}
}
