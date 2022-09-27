package com.example.a03_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnPalabras;
    private Button btnCaracteres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializo vistas
        inicializarVistas();

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this,NumeroPalabrasFraseActivity.class);
                Bundle bundle  = new Bundle();
                bundle.putString("FRASE", frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }


        });

        btnCaracteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                Intent intent = new Intent(MainActivity.this,NumeroCaracteresActivity.class);
                Bundle bundle  = new Bundle();
                bundle.putString("CARACTERES", frase);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    private void inicializarVistas() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
        btnCaracteres = findViewById(R.id.btnCaracteresMain);
    }
}