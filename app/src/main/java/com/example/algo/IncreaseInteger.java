package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IncreaseInteger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_integer);
    }

    public void increaseInt(View view){
        Intent i1 = new Intent(getApplicationContext(), IncreaseInt.class);
        startActivity(i1);
    }

    public void userInput(View view){
        Intent i2 = new Intent(getApplicationContext(), UserInput.class);
        startActivity(i2);
    }

    public void login(View view){
        Intent i3 = new Intent(getApplicationContext(), Login.class);
        startActivity(i3);
    }

    public void backgroundColor(View view){
        Intent i4 = new Intent(getApplicationContext(), BackgroundColor.class);
        startActivity(i4);
    }


}
