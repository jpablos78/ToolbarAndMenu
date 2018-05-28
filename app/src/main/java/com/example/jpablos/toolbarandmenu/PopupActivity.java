package com.example.jpablos.toolbarandmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupActivity extends AppCompatActivity {
    private ImageButton imageButtonReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        imageButtonReply =  findViewById(R.id.imageButtonReply);

        final PopupMenu.OnMenuItemClickListener onMenuItemClickListener = new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_reply:
                        Toast.makeText(PopupActivity.this, "Reply", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_reply_all:
                        Toast.makeText(PopupActivity.this, "Reply All", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_forward:
                        Toast.makeText(PopupActivity.this, "Forward", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        return false;
                }

                return false;
            }
        };

        imageButtonReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(PopupActivity.this, view);

                popupMenu.inflate(R.menu.menu_popup);

                popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);

                popupMenu.show();
            }
        });
    }
}
