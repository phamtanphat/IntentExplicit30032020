package com.example.intentexplicitdata30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    Button mBtnReplyString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBtnReplyString = findViewById(R.id.buttonIntentString);
        Intent intent = getIntent();
        if (intent != null){
            //String
//            String chuoi1 = intent.getStringExtra("chuoi");
//            String chuoi2 = intent.getStringExtra("chuoi2");
            //Object
            Sinhvien sinhvien = intent.getParcelableExtra("object");
            Log.d("BBB",sinhvien.name);

//
//            ArrayList<Sinhvien> sinhvien = intent.getParcelableArrayListExtra("object");
//            Log.d("BBB",sinhvien.size() + "");
        }
        mBtnReplyString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Main2Activity.this,MainActivity.class);
                intent2.putExtra("main2chuoi","Thanks main");
                setResult(RESULT_OK,intent2);
                finish();
            }
        });
    }
}
