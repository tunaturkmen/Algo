package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.Random;

public class BackgroundColor extends AppCompatActivity {
    RelativeLayout screen;
    String colorArray[] = {"#FF007F", "#FF0000", "#00FF7F", "#007FFF"};
    Random rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_color);

        screen=(RelativeLayout) findViewById(R.id.screen);
        rnd=new Random();
//uyghjkl
    }

    public void changeBackgroundColor(View view){
        screen.setBackgroundColor(Color.parseColor("#9dc4c3"));
    }

    public void random(View view){
        int index = rnd.nextInt(colorArray.length);
        screen.setBackgroundColor(Color.parseColor(colorArray[index]));
    }
}
