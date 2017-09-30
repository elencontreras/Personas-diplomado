package com.example.android.personas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {

    private EditText CajaCedula, CajaNombre, CajaApellido;
    private Spinner SpinnerSexo;
    private Resources res;
    private String[] sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);

        res = this.getResources();

        CajaCedula = (EditText)findViewById(R.id.txtCedula);
        CajaNombre = (EditText)findViewById(R.id.txtNombre);
        CajaApellido = (EditText)findViewById(R.id.txtApellido);
        SpinnerSexo = (Spinner)findViewById(R.id.cmbSexo);

        sexo= res.getStringArray(R.array.opcSexo);

        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,sexo);
        SpinnerSexo.setAdapter(adapter);


    }

    public void guardar(View v){
        String cedula,nombre, apellido;
        int sex;

        cedula = CajaCedula.getText().toString();
        nombre = CajaNombre.getText().toString();
        apellido = CajaApellido.getText().toString();
        sex = SpinnerSexo.getSelectedItemPosition();


        Persona p = new Persona(cedula, nombre, apellido,sex);
        p.guardar();
        Toast.makeText(this,res.getString(R.string.msjGuardar),Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void limpiar(View v){
        CajaCedula.setText("");
        CajaNombre.setText("");
        CajaApellido.setText("");
        SpinnerSexo.setSelection(0);
        CajaNombre.requestFocus();
    }

    private void limpiar(){
        CajaCedula.setText("");
        CajaNombre.setText("");
        CajaApellido.setText("");
        SpinnerSexo.setSelection(0);
        CajaNombre.requestFocus();
    }
}
