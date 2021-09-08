package com.actividaddos.actividaddos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActividadDOS extends AppCompatActivity {

    TextView Usuario2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);

        Usuario2 = (TextView) findViewById(R.id.Usuario2);

        String NomUsuario = getIntent().getStringExtra("Usuario");
        Usuario2.setText("Bienvenido: "+NomUsuario);
    }
}



































