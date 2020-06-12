package com.example.davinchicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_3 extends AppCompatActivity {
    Button next2;
    Button back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_3);
        next2 = findViewById(R.id.next2);
        back2 = findViewById(R.id.back2);
    }
    public void next2OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_4.class);
        startActivity(intent);
    }
    public void back2OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_2.class);
        startActivity(intent);
    }


}
