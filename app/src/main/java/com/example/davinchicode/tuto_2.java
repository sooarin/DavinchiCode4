package com.example.davinchicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_2 extends AppCompatActivity {
    Button next1;
    Button back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_2);
        next1 = findViewById(R.id.next1);
        back2 = findViewById(R.id.back2);
    }
    public void next1OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_3.class);
        startActivity(intent);
    }
    public void back2OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


}
