package com.example.conciencia_ecologica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class investigar_energias_renovables71 extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextDireccion;
    private EditText editTextTelefono;
    private EditText editTextEmail;
    private RadioButton radioButtonCasa;
    private RadioButton radioButtonApartamento;
    private RadioButton radioButtonGranja;
    private Button buttonEnviar;
    private ImageView imageBefore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_investigar_energias_renovables71);

        // Inicializa los elementos de la interfaz
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextDireccion = findViewById(R.id.editTextDireccion);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        editTextEmail = findViewById(R.id.editTextEmail);
        radioButtonCasa = findViewById(R.id.radioButtonCasa);
        radioButtonApartamento = findViewById(R.id.radioButtonApartamento);
        radioButtonGranja = findViewById(R.id.radioButtonGranja);
        buttonEnviar = findViewById(R.id.buttonEnviar);
        imageBefore = findViewById(R.id.imageBefore);

        // Configura el listener para el botón "Enviar"
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarSolicitud();
            }
        });

        imageBefore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devolverse();
            }
        });
    }

    private void devolverse (){
        Intent volverMenu = new Intent(investigar_energias_renovables71.this, Menu3.class);
        startActivity(volverMenu);

    }
    private void enviarSolicitud() {
        // Obtiene los valores de los campos
        String nombre = editTextNombre.getText().toString();
        String direccion = editTextDireccion.getText().toString();
        String telefono = editTextTelefono.getText().toString();
        String correo = editTextEmail.getText().toString();

        String tipoVivienda = "";
        if (radioButtonCasa.isChecked()) {
            tipoVivienda = "Casa";
        } else if (radioButtonApartamento.isChecked()) {
            tipoVivienda = "Apartamento";
        } else if (radioButtonGranja.isChecked()) {
            tipoVivienda = "Granja";
        }

        // Valida que los campos no estén vacíos
        if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_LONG).show();
            return;
        }

        // Muestra un mensaje de confirmación
        String mensaje = "Solicitud enviada:\nNombre: " + nombre + "\nDirección: " + direccion +
                "\nTeléfono: " + telefono + "\nCorreo: " + correo + "\nTipo de vivienda: " + tipoVivienda;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

        // Aquí puedes agregar la lógica para enviar los datos a un servidor o base de datos





    }
}