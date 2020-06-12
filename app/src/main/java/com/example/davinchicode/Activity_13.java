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

public class Activity_13 extends AppCompatActivity{
    Button next12;
    Button back12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);
        next12 = findViewById(R.id.next12);
        back12 = findViewById(R.id.back12);
    }
    public void next12OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_14.class);
        startActivity(intent);
    }
    public void back12OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_12.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_14.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
