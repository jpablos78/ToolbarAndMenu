package com.example.jpablos.toolbarandmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMenuSimple;
    private Button btnToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenuSimple = findViewById(R.id.button_menu_simple);
        btnToolbar = findViewById(R.id.button_toolbar);

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
    }
}
