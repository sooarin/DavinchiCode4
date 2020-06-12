package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_11 extends AppCompatActivity{
    Button next10;
    Button back10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_11);
        next10 = findViewById(R.id.next10);
        back10 = findViewById(R.id.back10);
    }
    public void next10OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_12.class);
        startActivity(intent);
    }
    public void back10OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_10.class);
        startActivity(intent);
    }

}
