package com.example.aplicacion;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
//herenaddo un sub hijo de la clase lisview
	private ListView listView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //estamos llamando al id de la lista del layout
       listView = (ListView)  findViewById(R.id.lista_de_contactos );
       //Creando una variable del tipo lista con arraylist "nombres"
       final List<String> nombres = new ArrayList <String>();
       //Agregando registros a nuesra lista "nombres"
        nombres.add("David Ramirez Lopez");
        nombres.add("Jose Maldonado Perez"); 
        nombres.add("Rosa de la Cruz Salcedo");
        nombres.add("Maria fernandez Quispe");
        nombres.add("Josue fernandezQuispe");
        nombres.add("Franklin Mirandad Ramirez");
        nombres.add("Juaquin Mendoza Ramos");
        //creamos un adaptador para insertar nuestro listado "nombres"
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres);
        //llamamos el adapter en nuestro id "listView" del layout
        listView.setAdapter(adapter);
    }
}
