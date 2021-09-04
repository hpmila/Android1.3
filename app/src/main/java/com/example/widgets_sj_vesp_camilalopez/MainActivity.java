package com.example.widgets_sj_vesp_camilalopez;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    //declaro datos
    private ProgressBar barra;
    private CheckBox calificaciones, productos;
    private TextView texto;
    private int progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barra = (ProgressBar)findViewById(R.id.pb);
        calificaciones = (CheckBox)findViewById(R.id.ch1);
        productos = (CheckBox)findViewById(R.id.ch2);
        texto = (TextView)findViewById(R.id.tv);
    }

    public void Charge(View view)
    {
        Timer timer = new Timer();// es un temporizador

        TimerTask tarea = new TimerTask() { //creo una tarea
            @Override
            public void run() {  //implemento un proceso
                // rellenar el progressbar
              progreso++;//incremento el progreso
              barra.setProgress(progreso);//le paso el progreso a mi barra

              texto.setText("Mi progreso es: "+barra.getProgress() + " /100" );
              Show();
            }
        };

        timer.schedule(tarea, 0,100);// finalmente le paso mi tarea a mi temporizador
    }

    public void Show()
    {
        if(barra.getProgress() == 100)
        {
            progreso = 0;
            barra.setProgress(0);
            texto.setText(" Se ha completado la barra ...");
        }
    }

    //metodo para navegar entre activity
    public void Menu(View view)
    {
        if(calificaciones.isChecked() && productos.isChecked())
        {
            texto.setText("Porfavor selecciona 1 sola opcion");
        }
        else
        {
            if (productos.isChecked()) //si marque productos
            {
                //abre el activity
                Intent i = new Intent(this, Productos_act.class);
                startActivity(i); //incicia el activity

            }
            if (calificaciones.isChecked())//si marque calificaciones
            {
                Intent i = new Intent(this,Calificaciones_act.class);
                startActivity(i);
            }
        }
    }
}