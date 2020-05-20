package com.example.intentexplicitdata30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        if (intent != null){
            String chuoi1 = intent.getStringExtra("chuoi");
            String chuoi2 = intent.getStringExtra("chuoi2");
        }
    }
}
