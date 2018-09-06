package com.example.pabloherrera.lab0ed2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private ArrayList<String> canciones;
    private ListView lista;
    private EditText et_buscador;
    private EditText txtAgregar;
    private Button btnAgregar;
    private ArrayAdapter<String> adapter;
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lista = (ListView) findViewById(R.id.lista);
        if (counter == 0){
            canciones = new ArrayList<String>();
            canciones.add("Noche Complicada; 3:45");
            canciones.add("Chica paranormal ; 3:41");
            canciones.add("BEBE ; 3:37");
            canciones.add("CaraLuna ; 4:20");
            canciones.add("Maquiavelico ; 3:25");
            canciones.add("Feliz LSD ; 3:87");
            canciones.add("Chica loca ; 4:41");
            canciones.add("Feliz Navidad.mp3 ; 3:37");
            canciones.add("DimitriVegas ; 7:20");
            canciones.add("Juanes ; 3:28");
            canciones.add("materia Complicada ; 5:32");
            canciones.add("Actividad paranormal ; 8:41");
            canciones.add("BUBU ; 2:37");
            canciones.add("Mani con rocs ; 4:20");
            canciones.add("Tu ; 1:25");
        }
            counter++;
        et_buscador = (EditText) findViewById(R.id.et_buscar);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, canciones);
        lista.setAdapter(adapter);
        et_buscador.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

               
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                adapter.getFilter().filter(s);


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                final int posicion = i;

                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Main2Activity.this);
                dialogo1.setTitle("Importante");
                dialogo1.setMessage("¿Elimina esta cancion?");
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        canciones.remove(posicion);
                        adapter.notifyDataSetChanged();
                    }
                });
                dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                    }
                });
                dialogo1.show();

                return false;
            }
        });
    }


    public void agregar(View v) {
        canciones.add(txtAgregar.getText().toString());
        adapter.notifyDataSetChanged();
        txtAgregar.setText("");
    }

}
