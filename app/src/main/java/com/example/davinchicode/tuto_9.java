package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_9 extends AppCompatActivity{
    Button next8;
    Button back8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_9);
        next8 = findViewById(R.id.next8);
        back8 = findViewById(R.id.back8);
    }
    public void next8OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_10.class);
        startActivity(intent);
    }
    public void back8OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_8.class);
        startActivity(intent);
    }

}
