package com.example.conciencia_ecologica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Energias_Renovables7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_energias_renovables7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button buttonInvestiga = findViewById(R.id.buttonInvestiga);
        buttonInvestiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irainvestiga = new Intent(Energias_Renovables7.this, investigar_energias_renovables71.class);
                startActivity(irainvestiga);
            }
        });



        ImageView imageBefore = findViewById(R.id.imageBefore);
        imageBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverMenu = new Intent(Energias_Renovables7.this, Menu3.class);
                startActivity(volverMenu);
            }
        });

    }
}