package com.example.pabloherrera.lab0ed2;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ArrayList<String> Lista;
    private ArrayAdapter<String> adaptador1;
    private ListView lv1;
    private EditText et1;
    
    List<String> lista = new ArrayList<>();
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lista= new ArrayList<>();
        adaptador1= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        lv1= findViewById(R.id.Listashow);
        lv1.setAdapter(adaptador1);

        et1= findViewById(R.id.button);


        
    }


    public void AgregarCancion() {

    }
}
