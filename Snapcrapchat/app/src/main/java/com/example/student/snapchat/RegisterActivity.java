package com.example.student.snapchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        RegisterFragment register = new RegisterFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.registerContainer, register).commit();
    }
}
