package com.example.p1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);
        Intent i = getIntent();
        int id = i.getIntExtra("id",0);
        String name = i.getStringExtra("name");
        TextView txt = findViewById(R.id.textview);

        txt.setText("name=" + name +"\n"+"id=" +id);


    }
}
