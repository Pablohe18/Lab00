package com.example.pabloherrera.lab0ed2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_list_item_1;

public class Main2Activity extends AppCompatActivity {
    private EditText Micaja;
    private ListView Misalida;
    private Button BotonMostrar;
    private ArrayAdapter<String> adaptador1;
    private ArrayList<String> lista;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lista=new ArrayList<String>();
        Micaja = (EditText) findViewById(R.id.txtNombre);
        Misalida = (ListView) findViewById(R.id.txtSalida);
        BotonMostrar = (Button) findViewById(R.id.btnNombre);

        BotonMostrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                
            }
        
    }


    public void AgregarCancion() {

    }
}
