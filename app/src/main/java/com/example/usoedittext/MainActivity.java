package com.example.usoedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText cajaUno = findViewById(R.id.caja1);
        final EditText cajaDos = findViewById(R.id.caja2);
        final TextView mensaje = findViewById(R.id.textView);
        final Button btnJuntar = findViewById(R.id.btnJuntar);
        final Button btnCambiar = findViewById(R.id.btnCambiar);
        final Button btnMezclar = findViewById(R.id.btnMezclar);

        btnJuntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt1 = String.valueOf(cajaUno.getText());
                String txt2 = String.valueOf(cajaDos.getText());
                String txtFinal = txt1 + " " + txt2;

                mensaje.setTextSize(20);
                mensaje.setText(txtFinal);
            }
        });

        btnMezclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt1 = String.valueOf(cajaUno.getText());
                String txt2 = String.valueOf(cajaDos.getText());
                String txtFinal = "";
                int diferencia = 0;
                char letra1, letra2;


                if(txt1.length() > txt2.length()){
                    diferencia = txt1.length() - txt2.length();
                    for(int i=0; i<diferencia; i++){
                        txt2 += "*";
                        //txt2 = txt2 + "*";
                    }
                }else if(txt2.length() > txt1.length()){
                    diferencia = txt2.length() - txt1.length();
                    for(int i=0; i<diferencia; i++){
                        txt1 += "*";
                    }
                }

                for (int i=0; i<txt1.length(); i++){
                    letra1 = txt1.charAt(i);
                    txtFinal += letra1;
                    letra2 = txt2.charAt(i);
                    txtFinal += letra2;
                }
                mensaje.setTextSize(20);
                mensaje.setText(txtFinal);
            }
        });

        btnCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt1 = String.valueOf(cajaUno.getText());
                String txt2 = String.valueOf(cajaDos.getText());
                String txtFinal = txt1 + " " + txt2;
                String txtCambio = "";
                char caracter;

                for(int i=0; i<txtFinal.length(); i++){
                    caracter = txtFinal.charAt(i);
                    if(caracter == 'A' || caracter == 'a'){
                        txtCambio += "4";
                        //txtCambio = txtCambio + "4"
                    }else if(caracter == 'E' || caracter == 'e'){
                        txtCambio += "3";
                    }else if(caracter == 'I' || caracter == 'i'){
                        txtCambio += "1";
                    }else if(caracter == 'O' || caracter == 'o'){
                        txtCambio += "0";
                    }else if(caracter == 'u'){
                        txtCambio += "v";
                    }else if(caracter == 'U'){
                        txtCambio += "V";
                    }else{
                        txtCambio += caracter;
                    }
                }
                mensaje.setTextSize(20);
                mensaje.setText(txtCambio);
            }
        });

    }
}