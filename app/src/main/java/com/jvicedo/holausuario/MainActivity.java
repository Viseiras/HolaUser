package com.jvicedo.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button btnAceptar;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar= findViewById(R.id.btnAceptar);
        txtNombre= findViewById(R.id.txtNombre);

        btnAceptar.setOnClickListener(v -> {
            Intent intent = new Intent(this, saluda.class);
            intent.putExtra("nombre",String.valueOf(txtNombre.getText()));
            startActivity(intent);
                }
                );



    }

}