package com.sam.calculadorapromedio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etCarrera, etNota1, etNota2, etNota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNombre = findViewById(R.id.etNombre);
        etCarrera = findViewById(R.id.etCarrera);
        etNota1 = findViewById(R.id.etNota1);
        etNota2 = findViewById(R.id.etNota2);
        etNota3 = findViewById(R.id.etNota3);
        Button btnCalcular = findViewById(R.id.btnCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double nota1 = Double.parseDouble(etNota1.getText().toString());
                    double nota2 = Double.parseDouble(etNota2.getText().toString());
                    double nota3 = Double.parseDouble(etNota3.getText().toString());


                    double promedio = (nota1 + nota2 + nota3) / 3;


                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("nombre", etNombre.getText().toString());
                    intent.putExtra("promedio", promedio);


                    startActivity(intent);
                } catch (NumberFormatException e) {

                    etNota1.setError("Ingresa un número válido");
                    etNota2.setError("Ingresa un número válido");
                    etNota3.setError("Ingresa un número válido");
                }
            }
        });
    }
}
