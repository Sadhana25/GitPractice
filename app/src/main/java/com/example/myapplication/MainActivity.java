package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // code added in maseter branch
        add();
    }
    public void add(){
        //method added
        //changes done after clone 
    }

    // feature branch created for  adding login feature
    public void login(){
        Toast.makeText(this, "login ", Toast.LENGTH_SHORT).show();
    }
}