package com.example.algo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
    }

    public void login(View view){
        if(email.getText().toString().equalsIgnoreCase("tunaturkmn@gmail.com")
                && password.getText().toString().equalsIgnoreCase("123456")){
            Toast.makeText(getApplicationContext(),"Correct e-mail & passwords", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Incorrect e-mail & passwords", Toast.LENGTH_LONG).show();
        }
    }
}
