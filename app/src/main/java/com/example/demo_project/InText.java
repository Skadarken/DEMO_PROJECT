package com.example.demo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InText extends AppCompatActivity {

    Button d_bt;
    Button e_bt;
    Button y_bt;
    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_text);
        input = findViewById(R.id.cur_input);
        result = findViewById(R.id.relt);
        d_bt = findViewById(R.id.con_dollar);
        e_bt = findViewById(R.id.con_euro);
        y_bt = findViewById(R.id.con_yen);

        d_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input.getText().toString());
                a = 71* a;
                result.setText(String.valueOf(a));
            }
        });

        e_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(input.getText().toString());
                a = 65* a;
                result.setText(String.valueOf(a));
            }
        });

        y_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(input.getText().toString());
                a = (float) 0.6* a;
                result.setText(String.valueOf(a));
            }
        });
    }
}
