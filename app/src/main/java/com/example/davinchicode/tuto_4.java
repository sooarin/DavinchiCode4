package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_4 extends AppCompatActivity {
    Button next3;
    Button back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_4);
        next3 = findViewById(R.id.next3);
        back3 = findViewById(R.id.back3);
    }
    public void next3OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_5.class);
        startActivity(intent);
    }
    public void back3OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_3.class);
        startActivity(intent);
    }


}
