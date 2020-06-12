package com.example.davinchicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_6 extends AppCompatActivity{
    Button next5;
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_6);
        next5 = findViewById(R.id.next5);
        back5 = findViewById(R.id.back5);
    }
    public void next5OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_7.class);
        startActivity(intent);
    }
    public void back5OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_5.class);
        startActivity(intent);
    }

}
