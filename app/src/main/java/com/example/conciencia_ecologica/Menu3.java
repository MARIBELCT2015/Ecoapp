package com.example.conciencia_ecologica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.regex.MatchResult;

public class Menu3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonSalir = findViewById(R.id.buttonSalir);
        buttonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cerrar la aplicación
                finishAffinity();
            }
        });

Button buttonMarketplace = findViewById(R.id.buttonMarketplace);
buttonMarketplace.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent ingresarmarketplace = new Intent(Menu3.this, Marketplace.class);
        startActivity(ingresarmarketplace);
    }
});

        Button buttonBiodiversidad = findViewById(R.id.buttonBiodiversidad);
        buttonBiodiversidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarBiodiversidad = new Intent(Menu3.this, Biodiversidad8.class);
                startActivity(ingresarBiodiversidad);
            }
        });


        Button buttonEnergias = findViewById(R.id.buttonEnergias);
        buttonEnergias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarEnergias = new Intent(Menu3.this, Energias_Renovables7.class);
                startActivity(ingresarEnergias);
            }
        });


        Button buttonConservacion = findViewById(R.id.buttonConservacion);
        buttonConservacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarConservacion = new Intent(Menu3.this, Conservacion_Agua6.class);
                startActivity(ingresarConservacion);
            }
        });

        Button buttonReciclaje = findViewById(R.id.buttonReciclaje);
        buttonReciclaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarReciclaje = new Intent(Menu3.this, Reciclaje5.class);
                startActivity(ingresarReciclaje);
            }
        });


        Button buttonCambioClimatico = findViewById(R.id.buttonCambioClimatico);
        buttonCambioClimatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresarCambioClimatico = new Intent(Menu3.this, CambioClimatico4.class);
                startActivity(ingresarCambioClimatico);
            }
        });
    }
}