package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_10 extends AppCompatActivity{
    Button next9;
    Button back9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_10);
        next9 = findViewById(R.id.next9);
        back9 = findViewById(R.id.back9);
    }
    public void next9OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_11.class);
        startActivity(intent);
    }
    public void back9OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_9.class);
        startActivity(intent);
    }

}
