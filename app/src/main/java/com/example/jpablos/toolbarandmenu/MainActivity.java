package com.example.jpablos.toolbarandmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMenuSimple;
    private Button btnToolbar;
    private Button btnPopup;
    private Button btnDinamico;
    private Button btnDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenuSimple = findViewById(R.id.button_menu_simple);
        btnToolbar = findViewById(R.id.button_toolbar);
        btnPopup = findViewById(R.id.button_popup);
        btnDinamico = findViewById(R.id.button_dinamico);
        btnDrawer = findViewById(R.id.button_drawer);

        btnMenuSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuSimpleActivity.class);
                startActivity(intent);
            }
        });

        btnToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ToolbarActivity.class);
                startActivity(intent);
            }
        });

        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivity(intent);
            }
        });

        btnDinamico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuDinamicoActivity.class);
                startActivity(intent);
            }
        });

        btnDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuDrawerActivity.class);
                startActivity(intent);
            }
        });
    }
}
