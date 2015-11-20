package com.example.diego.calculadora;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Tela_Lista extends ListActivity {

    private static final String[] Operacao = new String[]{"Soma","Subtracao","Multiplicacao","Divisao"};
    private ArrayAdapter<String> meeAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_tela_inicial);

        meeAdaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Operacao);
        setListAdapter(meeAdaptador);




    }
    @Override
    protected void onListItemClick (ListView l, View v, int posi, long id)
    {
        super.onListItemClick(l,v,1,id);

       // Toast.makeText(this,"Seçao " + Operacao[position],Toast.LENGTH_LONG).show();
        if(Operacao[posi].contains("Soma")) {
            Intent intent = new Intent(Tela_Lista.this, Soma.class);
            startActivity(intent);

        }
        if(Operacao[posi].contains("Subtracao")) {
            Intent intent = new Intent(Tela_Lista.this, Subtracao.class);
            startActivity(intent);
        }

        if(Operacao[posi].contains("Multiplicacao")) {
            Intent intent = new Intent(Tela_Lista.this, Multiplicacao.class);
            startActivity(intent);
        }
        if(Operacao[posi].contains("Divisao")) {
            Intent intent = new Intent(Tela_Lista.this, Divisao.class);
            startActivity(intent);
        }


    }




}
