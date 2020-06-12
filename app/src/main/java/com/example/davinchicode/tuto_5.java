package com.example.davinchicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_5 extends AppCompatActivity{
    Button next4;
    Button back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_5);
        next4 = findViewById(R.id.next4);
        back4 = findViewById(R.id.back4);
    }
    public void next4OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_6.class);
        startActivity(intent);
    }
    public void back4OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_4.class);
        startActivity(intent);
    }


}
