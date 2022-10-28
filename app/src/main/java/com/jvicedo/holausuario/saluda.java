package com.jvicedo.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class saluda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saluda);

        Intent intent = getIntent();

        String saludo="Hola " + intent.getStringExtra("nombre");

        TextView txtView = findViewById(R.id.txtView);
        txtView.setText(saludo);
    }
}