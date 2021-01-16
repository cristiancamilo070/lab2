package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button uno, dos, tres, cuatro, sintomas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //botones xd
         uno= (Button) findViewById(R.id.uno);
         dos= (Button) findViewById(R.id.dos);
         tres= (Button) findViewById(R.id.tres);
         cuatro= (Button) findViewById(R.id.cuatro);
         sintomas= (Button) findViewById(R.id.sintomas);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uno = new Intent(MainActivity.this, Ejercicio1.class);
                startActivity(uno);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dos = new Intent(MainActivity.this, Ejercicio2.class);
                startActivity(dos);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tres = new Intent(MainActivity.this, Ejercicio3.class);
                startActivity(tres);
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuatro = new Intent(MainActivity.this, Ejercicio4.class);
                startActivity(cuatro);
            }
        });


        sintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sintomas = new Intent(MainActivity.this, FormularioSintomas.class);
                startActivity(sintomas);
            }
        });

    }
}