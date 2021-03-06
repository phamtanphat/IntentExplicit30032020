package com.example.intentexplicitdata30032020;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnString = findViewById(R.id.buttonIntentString);
        mBtnObject = findViewById(R.id.buttonIntentObject);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("chuoi","Hello main 2");
                intent.putExtra("chuoi2","My names is main");
                startActivityForResult(intent,123);
            }
        });
        mBtnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sinhvien sinhvien = new Sinhvien("Nguyen Van A",20);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("object", sinhvien);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 123 & resultCode == RESULT_OK && data != null){
            Log.d("BBB",data.toString());
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
