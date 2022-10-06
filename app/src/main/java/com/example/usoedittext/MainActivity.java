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



        btnMezclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt1 = String.valueOf(cajaUno.getText());
                String txt2 = String.valueOf(cajaDos.getText());
                int numTxt1 = 0, numTxt2 = 0;

                if(txt1.length() > txt2.length()){
                    for(int i=0; i<txt1.length() - txt2.length(); i++){
                        txt2 = txt2 + "*";
                    }
                }
                char caracteres1[] = txt1.toCharArray();
                char caracteres2[] = txt2.toCharArray();

            }
        });


    }
}