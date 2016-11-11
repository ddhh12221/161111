package com.example.a403.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView b2;
    LinearLayout ll;
    RadioButton rg1, rg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "하이염", Toast.LENGTH_SHORT).show();
            }

        });

        b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "빠이염", Toast.LENGTH_SHORT).show();
            }

        });

        b2 = (TextView) findViewById(R.id.textView);
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "뚠뚠", Toast.LENGTH_SHORT).show();
            }
        });


        ll = (LinearLayout) findViewById(R.id.linaer1);
        rg1 = (RadioButton) findViewById(R.id.radioButton);
        rg1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        rg2 = (RadioButton) findViewById(R.id.radioButton2);
        rg2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ll.setBackgroundColor(Color.BLUE);
            }
        });
    }




    }

