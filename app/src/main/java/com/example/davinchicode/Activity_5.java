package com.example.davinchicode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Activity_5 extends AppCompatActivity{
    Button next4;
    Button back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        next4 = findViewById(R.id.next4);
        back4 = findViewById(R.id.back4);
    }
    public void next4OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_6.class);
        startActivity(intent);
    }
    public void back4OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_4.class);
        startActivity(intent);
    }
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }

}
