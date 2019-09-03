package com.example.demo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b4; //Text
    Button b5; //Backcolor
    Button b6; //Textcolor
    Button mvb; //Move to Intex.java
    Button move_map; //Move to apimap.java
    Button move_web; //Move to web_view.java
    TextView mpp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b4 = findViewById(R.id.button);
        b5 = findViewById(R.id.button3);
        b6= findViewById(R.id.button4);
        mvb = findViewById(R.id.INTEX);
        move_map = findViewById(R.id.api_map);
        move_web = findViewById(R.id.wbv);
        mpp = findViewById(R.id.tex1);
        final String[] strArray3 = new String[60];
        strArray3[0] = "Harish";
        strArray3[1] = "Babu";
        strArray3[2] = "Nitish";
        strArray3[3] = "ichigo";
        strArray3[4] = "Takeshi";
        strArray3[5] = "Izuku";

        final String[] bat = new String[60];
        bat[0] = "#64b3f4";
        bat[1] = "#c5c7d4";
        bat[2] = "#02193e";
        bat[3] = "#51a8c7";
        bat[4] = "#8ede83";
        bat[5] = "#fbbf4c";
        bat[6] = "#6e8281";


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = (int) ((Math.random() * ((5 - 0) + 1)) + 0);
                mpp.setText(strArray3[num]);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = (int) ((Math.random() * ((6 - 0) + 1)) + 0);
                mpp.setBackgroundColor(Color.parseColor(bat[num]));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = (int) ((Math.random() * ((6 - 0) + 1)) + 0);
                mpp.setTextColor(Color.parseColor(bat[num]));
            }
        });

        mvb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadIntent = new Intent(MainActivity.this, InText.class);
                startActivity(downloadIntent);
            }
        });

        move_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(downloadIntent);
            }
        });

        move_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloadIntent = new Intent(MainActivity.this, web_view.class);
                startActivity(downloadIntent);
            }
        });

    }

}
