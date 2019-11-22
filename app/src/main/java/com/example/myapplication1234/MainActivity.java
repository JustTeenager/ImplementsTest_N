package com.example.myapplication1234;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, View.OnTouchListener {
    static boolean a=true;
    static boolean b=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(this);
        ConstraintLayout r=findViewById(R.id.root);
        r.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        if (a==true){
        v.setBackgroundColor(Color.GREEN);
        a=false;
        }
        else {v.setBackgroundColor(Color.RED);
        a=true;}
    }
    public boolean onTouch(View v, MotionEvent event){
        if (b==true){
        v.setBackgroundColor(Color.BLACK);
        b=false;
        }
        else {
            v.setBackgroundColor(Color.MAGENTA);
            b = true;}
            return false;
    }

}
