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

public class Activity_8 extends AppCompatActivity {
    Button next7;
    Button back7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
        next7 = findViewById(R.id.next7);
        back7 = findViewById(R.id.back7);
    }
    public void next7OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_9.class);
        startActivity(intent);
    }
    public void back7OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_7.class);
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
            Intent intent = new Intent(getApplicationContext(), Activity_9.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }
}
