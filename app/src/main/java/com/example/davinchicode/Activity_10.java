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

public class Activity_10 extends AppCompatActivity{
    Button next9;
    Button back9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);
        next9 = findViewById(R.id.next9);
        back9 = findViewById(R.id.back9);
    }
    public void next9OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_11.class);
        startActivity(intent);
    }
    public void back9OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_9.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_11.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
