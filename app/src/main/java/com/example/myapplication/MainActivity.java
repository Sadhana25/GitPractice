package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

    // created branch from master for register feature 

    // feature branch created for  adding login feature
}