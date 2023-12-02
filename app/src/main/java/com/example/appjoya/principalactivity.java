package com.example.appjoya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class principalactivity extends AppCompatActivity {
    private EditText editTextCorreo;
    private EditText editTextContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principalactivity);

        editTextCorreo = findViewById(R.id.etcorreo);
        editTextContraseña = findViewById(R.id.etpassword);

        Button btnIniciarCorreo = findViewById(R.id.btnIniciarCorreo);
        Button btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        Button btnContinuarInvitado = findViewById(R.id.btnInvitado);
        Button btnGoogle = findViewById(R.id.btnGooglemain);

        TextWatcher textWatcher;
        editTextCorreo.addTextChangedListener(textWatcher);
        editTextContraseña.addTextChangedListener(textWatcher);
        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (!editTextCorreo.getText().toString().trim().isEmpty() &&
                        !editTextContraseña.getText().toString().trim().isEmpty()) {
                    abrirmenuinicio();
                }
            }
        };
        private void iniciarSesionAutomatico() {
            Intent intent = new Intent(principalactivity.this, menu_inicio.class);
            startActivity(intent);
            finish();
        }
        btnIniciarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnContinuarInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        private void abrirmenuinicio() {
            String correoIngresado = editTextCorreo.getText().toString().trim();
            String contraseñaIngresada = editTextContraseña.getText().toString().trim();

            String usuarioGuardado = "usuario";
            String contraseñaGuardada = "contraseña123";

            if (correoIngresado.equals(usuarioGuardado) && contraseñaIngresada.equals(contraseñaGuardada)) {
                mostrarMensaje("Inicio de sesión automático exitoso");
                abrirmenuinicio();
            } else {
                mostrarMensaje("Credenciales incorrectas");
            }
        }

    }
    private void abrirmenuinicio() {
        Intent intent = new Intent(principalactivity.this, menu_inicio.class);
        startActivity(intent);
        finish();
    }

    private void mostrarMensaje(String credencialesIncorrectas) {

    }
}
