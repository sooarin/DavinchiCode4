package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_12 extends AppCompatActivity{
    Button next11;
    Button back11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_12);
        next11 = findViewById(R.id.next11);
        back11 = findViewById(R.id.back11);
    }
    public void next11OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_13.class);
        startActivity(intent);
    }
    public void back11OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_11.class);
        startActivity(intent);
    }

}
