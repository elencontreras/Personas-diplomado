package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {

    private EditText CajaCedula, CajaNombre, CajaApellido;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        res = this.getResources();

        CajaCedula = (EditText)findViewById(R.id.txtCedula);
        CajaNombre = (EditText)findViewById(R.id.txtNombre);
        CajaApellido = (EditText)findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String cedula,nombre, apellido;

        cedula = CajaCedula.getText().toString();
        nombre = CajaNombre.getText().toString();
        apellido = CajaApellido.getText().toString();

        Persona p = new Persona(cedula, nombre, apellido);
        p.guardar();
        Toast.makeText(this,res.getString(R.string.msjGuardar),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        CajaCedula.setText("");
        CajaNombre.setText("");
        CajaApellido.setText("");
        CajaNombre.requestFocus();
    }

    private void limpiar(){
        CajaCedula.setText("");
        CajaNombre.setText("");
        CajaApellido.setText("");
        CajaNombre.requestFocus();
    }
}
