package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean aux = true;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton = findViewById(R.id.botonCambiar);
        final TextView texto = findViewById(R.id.cartel);
        final TextView contador = findViewById(R.id.contador);

        final TextView operando1 = findViewById(R.id.op1);
        final TextView operando2 = findViewById(R.id.op2);

        Button botonSuma = findViewById(R.id.botonSumar);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto.setText("Suma: "+(Integer.parseInt(operando1.getText().toString())+(Integer.parseInt(operando2.getText().toString()))));

            }
        });


        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*if(aux){

                    texto.setText("Adiós Mundo");
                    aux=false;

                }
                else{

                    texto.setText("Hola Mundo");
                    aux=true;
                }*/

                texto.setText(aux?"Adiós mundo":"Hola mundo");
                aux=!aux;

                cont=cont+1;

                contador.setText(String.valueOf(cont));

            }
        });

        

    }

}







