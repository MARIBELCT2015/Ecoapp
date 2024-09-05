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

public class Conservacion_Agua6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conservacion_agua6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageBefore = findViewById(R.id.imageBefore);
        imageBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverMenu = new Intent(Conservacion_Agua6.this, Menu3.class);
                startActivity(volverMenu);
            }
        });


Button buttonAprende = findViewById(R.id.buttonAprende);
buttonAprende.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent ingresarConservacionAgua = new Intent(Conservacion_Agua6.this, aprender_agua61.class);
        startActivity(ingresarConservacionAgua);
    }
});

    }
}