package com.example.luis.myapplication;

import android.content.Intent;
import android.graphics.PaintFlagsDrawFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    ListView ListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = (android.widget.ListView)findViewById(R.id.LV);
       String[] lista = new String[]{"Crepusculo","300","divergente","padre_rico_padre_pobre","las_50_sombras_de_luisito","las_aventuras_de_guiliber","diario_de_ana_frank","las_cartas_a_veronica","resident_evil","gears_of_wars"};

              ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lista);

        ListView.setAdapter(adapter);
        ListView. setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                int itemPosition=posicion;
                String itemValue=(String)ListView.getItemAtPosition(posicion);
                switch (posicion) {
                    case 0:
                        Intent crepusculo = new Intent(getApplicationContext(),Crepusculo.class);
                        startActivity(crepusculo);
                        break;
                    case 1:
                        Intent los300 =new Intent(getApplicationContext(),Los300.class);
                        startActivity(los300);
                        break;
                    case 2:
                        Intent divergente = new Intent(getApplicationContext(),Divergente.class);
                        startActivity(divergente);
                        break;
                    case 3:
                        Intent padre_rico_padre_pobre =new Intent(getApplicationContext(),Padre_rico_padre_pobre.class);
                        startActivity(padre_rico_padre_pobre);
                        break;
                    case 4:
                        Intent las_50_sombras_de_luisito = new Intent(getApplicationContext(),Las_50_sombras_de_luisito.class);
                        startActivity(las_50_sombras_de_luisito);
                        break;
                    case 5:
                        Intent las_aventuras_de_guiliber = new Intent(getApplicationContext(),Las_aventuras_de_guiliber.class);
                        startActivity(las_aventuras_de_guiliber);
                        break;
                    case 6:
                        Intent diario_de_ana_frank = new Intent(getApplicationContext(),Diario_de_ana_frank.class);
                        startActivity(diario_de_ana_frank);
                        break;
                    case 7:
                       Intent las_cartas_a_veronica = new Intent(getApplicationContext(),Las_cartas_a_veronica.class);
                        startActivity(las_cartas_a_veronica);
                        break;
                    case 8:
                        Intent resident_evil = new Intent(getApplicationContext(),Resident_evil.class);
                        startActivity(resident_evil);
                        break;
                    case 9:
                        Intent gears_of_wars = new Intent(getApplicationContext(),Gears_of_wars.class);
                        startActivity(gears_of_wars);



                    }

                }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
