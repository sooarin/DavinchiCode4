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

public class Activity_11 extends AppCompatActivity{
    Button next10;
    Button back10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);
        next10 = findViewById(R.id.next10);
        back10 = findViewById(R.id.back10);
    }
    public void next10OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_12.class);
        startActivity(intent);
    }
    public void back10OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_10.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_12.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
