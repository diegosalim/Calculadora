package com.example.diego.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Multiplicacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);
        Button botao = (Button) findViewById(R.id.calculo);

        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {

                EditText v1 = (EditText) findViewById(R.id.editText);
                EditText v2 = (EditText) findViewById(R.id.editText2);

                double pv1 = Double.parseDouble(v1.getText().toString());
                double pv2 = Double.parseDouble(v2.getText().toString());

                double result = pv1 * pv2;

                Intent intent = new Intent(Multiplicacao.this, Resultado.class);

                intent.putExtra("result", result);

                startActivity(intent);
            }
        });
    }

}
