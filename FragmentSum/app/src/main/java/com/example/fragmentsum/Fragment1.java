package com.example.fragmentsum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment,container,false);

        EditText num1 = view.findViewById(R.id.firstNum);
        EditText num2 = view.findViewById(R.id.secNum);
        Button btn = view.findViewById(R.id.btn);
        TextView result = view.findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer first = Integer.parseInt(num1.getText().toString());
                Integer sec = Integer.parseInt(num2.getText().toString());
                int sum = first+sec;
            result.setText("Result:"+sum);
            }
        });
        return view;
    }
}
