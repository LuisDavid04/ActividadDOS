package com.actividaddos.actividaddos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText NombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreUsuario = (EditText) findViewById(R.id.Usuario);
    }


    public void enviarDatos(View view){
        String Usuario = NombreUsuario.getText().toString();

        Intent I = new Intent(this, ActividadDOS.class);
        I.putExtra("Usuario", Usuario);
        startActivity(I);

    }
}




