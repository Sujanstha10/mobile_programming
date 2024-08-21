package com.example.mymenu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.contextBtn);
        registerForContextMenu(btn);

        Button poupBtn = findViewById(R.id.popupBtn);
    poupBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }
    });

    }
//Option Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item2) {
            Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item3) {
            Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.item4) {
            Toast.makeText(this, "item4", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.edit){
            Toast.makeText(this, "Edited", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.delete) {
            Toast.makeText(this,"Deleted",Toast.LENGTH_SHORT).show();
            return true;
        }else {
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }

    boolean showPopupMenu(View view){
        PopupMenu popupMenu = new PopupMenu(this,view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.menu_edit) {
                    Toast.makeText(MainActivity.this, "Edit selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_delete) {
                    Toast.makeText(MainActivity.this, "Delete selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.menu_share) {
                    Toast.makeText(MainActivity.this, "Share selected", Toast.LENGTH_SHORT).show();
                    return true;
                } else {
                    return false;
                }
            }
        });
        popupMenu.show();
        return false;
    }

}
