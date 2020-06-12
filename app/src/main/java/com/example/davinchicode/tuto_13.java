package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_13 extends AppCompatActivity{
    Button next12;
    Button back12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_13);
        next12 = findViewById(R.id.next12);
        back12 = findViewById(R.id.back12);
    }
    public void next12OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_14.class);
        startActivity(intent);
    }
    public void back12OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_12.class);
        startActivity(intent);
    }


}
