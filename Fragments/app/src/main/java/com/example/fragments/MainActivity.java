package com.example.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btnFirst = findViewById(R.id.btnfragment1);
        Button btnSecond = findViewById(R.id.btnfragment2);

        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment1();
                androidx.fragment.app.FragmentManager manager =  getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment);
                transaction.commit();


            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new fragment2();
                androidx.fragment.app.FragmentManager manager =  getSupportFragmentManager();
                androidx.fragment.app.FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment);
                transaction.commit();


            }
        });


    }
}
