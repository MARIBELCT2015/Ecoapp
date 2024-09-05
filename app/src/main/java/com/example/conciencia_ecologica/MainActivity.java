package com.example.conciencia_ecologica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        TextView txtRegistrate = findViewById(R.id.Registrate);
        TextView txtOlvidarContrasena = findViewById(R.id.Olvidaste);
        Button buttonSesion = findViewById(R.id.buttonSesion);
        buttonSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresar = new Intent(MainActivity.this, Menu3.class);
                startActivity(ingresar);
            }
        });

        txtRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrarse = new Intent(MainActivity.this, Registro_usuario2.class);
                startActivity(registrarse);
            }
        });

txtOlvidarContrasena.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent olvidarContrasena = new Intent(MainActivity.this, olvidaste_contrasena.class);
        startActivity(olvidarContrasena);
    }
});
    }
}