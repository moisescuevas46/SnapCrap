package com.example.student.snapchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.backendless.Backendless;

public class MainActivity extends AppCompatActivity {

    public static final String APP_ID = "6859EFC6-CA09-1E81-FFD9-845A1111F800";
    public static final String SECRET_KEY = "D859B9A4-34BD-4D18-FFC9-992D95AA3E00";
    public static final String VERSION = "v1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MainMenuFragment mainMenu = new MainMenuFragment();
       // getSupportFragmentManager().beginTransaction().add(R.id.container,  mainMenu).commit();
        LoginMenuFragment loginMenu = new LoginMenuFragment();
         getSupportFragmentManager().beginTransaction().add(R.id.container,  loginMenu).commit();


        Backendless.initApp(this, APP_ID, SECRET_KEY, VERSION);
    }
}
