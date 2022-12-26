package com.example.test4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    public final static String USERNAME = ".com.example.Test4.USERNAME";
    TextView tvUname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvUname = findViewById(R.id.tvUname);
        Intent intent = getIntent();
        String etUname = intent.getStringExtra("USERNAME");
        tvUname.setTextSize(45);
        tvUname.setText("Welcome " + etUname);

    }
}