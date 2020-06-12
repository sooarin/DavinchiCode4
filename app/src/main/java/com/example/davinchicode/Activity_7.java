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

public class Activity_7 extends AppCompatActivity{
    Button next5;
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        next5 = findViewById(R.id.next5);
        back5 = findViewById(R.id.back5);
    }
    public void next6OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_8.class);
        startActivity(intent);
    }
    public void back6OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_6.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_8.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
