package com.sam.calculadorapromedio;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        @SuppressLint("MissingInflatedId")
        TextView tvPromedio = findViewById(R.id.tvPromedio);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            double promedio = extras.getDouble("promedio");


            tvPromedio.setText(nombre + ", tu promedio es: " + promedio);
        }
    }
}

