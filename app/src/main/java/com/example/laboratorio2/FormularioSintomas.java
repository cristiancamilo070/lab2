package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Spinner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class FormularioSintomas extends AppCompatActivity {
    private Spinner spinner4, spinner5, spinner6, spinner7, spinner8, spinner9;
    private String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_sintomas);
        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                spinner4 = (Spinner) findViewById(R.id.spinner4);
                spinner5 = (Spinner) findViewById(R.id.spinner5);
                spinner6 = (Spinner) findViewById(R.id.spinner6);
                spinner7 = (Spinner) findViewById(R.id.spinner7);
                spinner8 = (Spinner) findViewById(R.id.spinner8);
                spinner9 = (Spinner) findViewById(R.id.spinner9);
                resultado = "";
                  if (spinner4.getSelectedItemPosition() == 0) {
                        resultado += "Primer Sintoma positivo, ";
                         } else {
                      resultado += "Primer Sintoma negativo, ";
                      }
                    if (spinner5.getSelectedItemPosition() == 0) {
                        resultado += "Segundo Sintoma positivo, ";
                    } else {
                        resultado += "Segundo Sintoma negativo, ";
                    }
                    if (spinner6.getSelectedItemPosition() == 0) {
                        resultado += "Tercer Sintoma positivo, ";
                    } else {
                        resultado += "Tercer Sintoma negativo, ";
                    }
                    if (spinner7.getSelectedItemPosition() == 0) {
                        resultado += "Cuarto Sintoma positivo, ";
                    } else {
                        resultado += "Cuarto Sintoma negativo, ";
                    }
                    if (spinner8.getSelectedItemPosition() == 0) {
                        resultado += "Quinto Sintoma positivo, ";
                    } else {
                        resultado += "Quinto Sintoma negativo, ";
                    }
                    if (spinner9.getSelectedItemPosition() == 0) {
                        resultado += "Sexto Sintoma positivo  ";
                    } else {
                        resultado += "Sexto Sintoma negativo  ";
                    }
                    String enviarRes = "El resultado de sus sintomas fueron "+resultado;
                String escogerTexto = "Enviar via...";
                Intent enviar = new Intent(Intent.ACTION_SEND);
                enviar.setType("text/plain");
                enviar.putExtra(Intent.EXTRA_TEXT, enviarRes);
                Intent pick = Intent.createChooser(enviar, escogerTexto);
                startActivity(pick);
            }
        });
    }
}