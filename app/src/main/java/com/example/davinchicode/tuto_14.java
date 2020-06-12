package com.example.davinchicode;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tuto_14 extends AppCompatActivity{
    Button back13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuto_14);
        back13 = findViewById(R.id.back13);
    }
    public void back13OnClick(View v){
        Intent intent = new Intent(getApplicationContext(), tuto_13.class);
        startActivity(intent);
    }

}
