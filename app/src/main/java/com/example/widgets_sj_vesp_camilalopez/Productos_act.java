package com.example.widgets_sj_vesp_camilalopez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Productos_act extends AppCompatActivity {
    //declaro datos
    private RadioButton kilo1, kilo2;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        kilo1 = (RadioButton) findViewById(R.id.rb1);
        kilo2 = (RadioButton) findViewById(R.id.rb2);
        texto = (TextView) findViewById(R.id.tv1);

    }

  public void Calcular(View view)
    {
        if(kilo1.isChecked())
        {
            int resultado = 1000*1;
            texto.setText("1 kilo es: "+ resultado);

        }

        if (kilo2.isChecked())
        {
            int resultado = 1000*2;
            texto.setText("2 kilos es: " + resultado);

        }
    }


}