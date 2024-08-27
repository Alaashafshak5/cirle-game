package com.example.circledraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private CircleView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeHere(View v){
        Random r = new Random();
        c1.circlePaint.setColor(r.nextInt()/15);
        c1.titlePaint.setColor(r.nextInt()/15);
        c1.invalidate();
    }
    public void zoomIn(View v){
        ViewGroup.LayoutParams layoutParams = c1.getLayoutParams();
        layoutParams.width += 100;
        layoutParams.height+= 100;
        c1.setLayoutParams(layoutParams);
        c1.invalidate();
    }

    public void zoomOut(View v){
        ViewGroup.LayoutParams layoutParams = c1.getLayoutParams();
        layoutParams.width -= 100;
        layoutParams.height-= 100;
        c1.setLayoutParams(layoutParams);
        c1.invalidate();
    }
}