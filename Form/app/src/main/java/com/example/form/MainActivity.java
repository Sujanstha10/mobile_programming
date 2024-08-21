package com.example.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Button btn = findViewById(R.id.btn);
        EditText txt_name = findViewById(R.id.name);
        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);
        Spinner prgm = findViewById(R.id.program);
        TextView res = findViewById(R.id.result);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String name = txt_name.getText().toString();
                String gender = "";
                if(male.isChecked()){
                    gender= "male";
                }else {
                    gender="female";
                }
                String program = prgm.getSelectedItem().toString();
                res.setText("Name= "+name+"\n"+"Gender= "+gender+"\n"+"Program= "+program);

            }

        });






    }
}
