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

public class Activity_9 extends AppCompatActivity{
    Button next8;
    Button back8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        next8 = findViewById(R.id.next8);
        back8 = findViewById(R.id.back8);
    }
    public void next8OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_10.class);
        startActivity(intent);
    }
    public void back8OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_8.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_10.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
