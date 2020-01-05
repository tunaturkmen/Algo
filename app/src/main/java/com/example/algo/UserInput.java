package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UserInput extends AppCompatActivity {
    TextView heading;
    EditText inputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        heading=findViewById(R.id.heading);
        inputBox=findViewById(R.id.input);
    }

    public void textChange(View view){
        heading.setText(inputBox.getText());
    }
}
