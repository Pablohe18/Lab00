package com.example.pabloherrera.lab0ed2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    private ListView lista;
    List<String> items;
    ArrayAdapter ADP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final EditText txtNombre = findViewById(R.id.txtNombre);
        final Button btnAgregar = findViewById(R.id.btnAgregar);
        lista = findViewById(R.id.lista);
        items = new ArrayList<>();
        ADP = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,items);
        lista.setAdapter(ADP);

        lista.setBackgroundColor(Color.DKGRAY);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.add(txtNombre.getText().toString());
                ADP.notifyDataSetChanged();
            }
        });
    }
}
