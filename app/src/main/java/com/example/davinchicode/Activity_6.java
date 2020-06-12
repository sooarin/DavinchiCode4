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

public class Activity_6 extends AppCompatActivity{
    Button next5;
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        next5 = findViewById(R.id.next5);
        back5 = findViewById(R.id.back5);
    }
    public void next5OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_7.class);
        startActivity(intent);
    }
    public void back5OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_5.class);
        startActivity(intent);
    }
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        int action = event.getAction();
        if(action == MotionEvent.ACTION_DOWN){
            Intent intent = new Intent(getApplicationContext(), Activity_7.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
