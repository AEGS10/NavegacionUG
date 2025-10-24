package com.example.navegacionug;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String nombre = getIntent().getStringExtra("NOMBRE");
        TextView tv = findViewById(R.id.tvSaludo);
        if (nombre == null || nombre.isEmpty()) nombre = "Estudiante"
                ;
        tv.setText("Hola, " + nombre + ". ¡Bienvenido a la aplicación NavegacionUG!");
    }
}