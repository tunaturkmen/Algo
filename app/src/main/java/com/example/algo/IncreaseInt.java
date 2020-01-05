package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IncreaseInt extends AppCompatActivity {
    TextView number; //ekranda kullaniciya rakami gosterir
    int no; //bizim sayac

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_int);

        number = findViewById(R.id.number);
        no=0;

    }

    public void plusFive(View view){
        no+=5;
        number.setText(Integer.toString(no));
    }

    public void MinusTen(View view){
        no-=10;
        number.setText(Integer.toString(no));
    }


}
