package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_7 extends AppCompatActivity{
    Button next5;
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_7);
        next5 = findViewById(R.id.next5);
        back5 = findViewById(R.id.back5);
    }
    public void next6OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_8.class);
        startActivity(intent);
    }
    public void back6OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_6.class);
        startActivity(intent);
    }

}
