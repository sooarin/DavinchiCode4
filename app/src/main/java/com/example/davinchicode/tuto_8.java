package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_8 extends AppCompatActivity {
    Button next7;
    Button back7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_8);
        next7 = findViewById(R.id.next7);
        back7 = findViewById(R.id.back7);
    }
    public void next7OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_9.class);
        startActivity(intent);
    }
    public void back7OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_7.class);
        startActivity(intent);
    }

}
