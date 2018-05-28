package com.example.jpablos.toolbarandmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuSimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_simple);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_simple, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String cadena = "";

        switch (item.getItemId()) {
            case R.id.menu_settings:
                cadena = "Opciones Settings";
                break;
            case R.id.menu_sub1:
                cadena = "SubMenu1 Settings";
                break;
            case R.id.menu_sub2:
                cadena = "SubMenu2 Settings";
                break;
            case R.id.menu_search:
                cadena = "Opciones Search";
                break;
            case R.id.menu_add_item:
                cadena = "Opciones Add Item";
                break;
            case R.id.menu_help:
                cadena = "Opciones Help";
                break;
        }

        Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show();

        return true;
    }
}
