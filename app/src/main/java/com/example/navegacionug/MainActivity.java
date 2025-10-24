package com.example.navegacionug;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etNombre = findViewById(R.id.etNombre);
        Button btnDetalle = findViewById(R.id.btnDetalle);
        Button btnWeb = findViewById(R.id.btnWeb);


        btnDetalle.setOnClickListener(v-> {
            String nombre = etNombre.getText().toString().trim();
            Intent intent = new Intent(MainActivity.this,
                    DetailActivity.class);
            intent.putExtra("NOMBRE", nombre);
            startActivity(intent);
        });
        btnWeb.setOnClickListener(v-> {
            Uri uri = Uri.parse("https://www.ug.edu.ec/");
            Intent webIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(webIntent);
        });
    }
}