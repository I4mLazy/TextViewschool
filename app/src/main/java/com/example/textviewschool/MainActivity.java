package com.example.textviewschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity
{
    private TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text1);
        tv.setTextSize(40);
        tv.setTextColor(Color.BLACK);
        tv.setWidth(20);
        tv.setVisibility(View.VISIBLE);


    }
}