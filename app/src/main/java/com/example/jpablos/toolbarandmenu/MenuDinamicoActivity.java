package com.example.jpablos.toolbarandmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MenuDinamicoActivity extends AppCompatActivity {
    //private final int MENU_DOWNLOAD = 1;
    //private final int MENU_SETTINGS = 2;
    List<Opciones> opcionesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dinamico);

        //getting the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar_dinamico);

        toolbar.setTitle("Opciones Dinamico");

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //menu.add(0, MENU_DOWNLOAD, 0, "Download");
        //menu.add(0, MENU_SETTINGS, 0, "Settings");
        opcionesList = new ArrayList<>();

        opcionesList.add(new Opciones(1, "Seguridades"));
        opcionesList.add(new Opciones(2, "Mantenimientos"));
        opcionesList.add(new Opciones(3, "Transacciones"));
        opcionesList.add(new Opciones(4, "Reportes"));

        for (int i = 0; i < opcionesList.size(); i++) {
            Opciones opcion = opcionesList.get(i);

            menu.add(0, opcion.getOrden(), 0, opcion.getNombre());
        }

        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.findItem(3);
        menuItem.setVisible(false);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Menu Seguridades", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Menu Mantenimientos", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Menu Transacciones", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Menu Reportes", Toast.LENGTH_SHORT).show();
                break;
            default:
                return super.onContextItemSelected(item);
        }

        return true;
    }
}
