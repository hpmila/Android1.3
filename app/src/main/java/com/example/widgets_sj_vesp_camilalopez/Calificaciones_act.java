package com.example.widgets_sj_vesp_camilalopez;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Calificaciones_act extends AppCompatActivity {
    //declaro datos
    private RatingBar calificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);

        calificacion = (RatingBar)findViewById(R.id.rt);

    }
        //metodo
    public void Calificar(View view)
    {
        calificacion.setNumStars(5);// cambia el numero de estrellas
        calificacion.setRating(5); //pi8nta estrellas
        float rat = calificacion.getRating(); //obtiene las estrellas pintadas

        Toast.makeText(this,"calificacion: " + rat, Toast.LENGTH_LONG).show();//muestra una notificacion

    }
}