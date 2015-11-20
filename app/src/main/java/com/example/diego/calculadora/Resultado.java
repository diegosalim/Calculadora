package com.example.diego.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent intent = getIntent();

        double result = (Double) intent.getSerializableExtra("result");

        String t = Double.toString(result);
        int i = t.length()-2;

        t = t.substring(0, i);


        TextView resultado;

        resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(t);


    }

}


