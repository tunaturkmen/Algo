package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void giris(View view){
        Intent grs = new Intent(getApplicationContext(), IncreaseInteger.class);
        startActivity(grs);
    }
}
