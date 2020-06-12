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

public class Activity_4 extends AppCompatActivity {
    Button next3;
    Button back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        next3 = findViewById(R.id.next3);
        back3 = findViewById(R.id.back3);
    }
    public void next3OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_5.class);
        startActivity(intent);
    }
    public void back3OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), Activity_3.class);
        startActivity(intent);
    }
    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }

}
