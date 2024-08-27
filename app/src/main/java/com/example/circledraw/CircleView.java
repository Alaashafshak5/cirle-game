package com.example.circledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.content.res.TypedArray;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;
import java.util.Random;


public class CircleView extends View {

    Paint circlePaint;
    int r;
    Paint titlePaint;
    String title;
    public CircleView(Context context, AttributeSet attrs){
        super(context,attrs);
        TypedArray attribute = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CircleView,0,0);
        circlePaint = new Paint();
        titlePaint = new Paint();
        titlePaint.setTextSize(50);
        int c = attribute.getInteger(R.styleable.CircleView_circle_color ,new Random().nextInt());
        int t = attribute.getInteger(R.styleable.CircleView_circle_title_color,0);
        title = attribute.getString(R.styleable.CircleView_circle_title);
        titlePaint.setColor(t);
        circlePaint.setColor(c);


    }

    public Paint getCirclePaint() {
        return circlePaint;
    }

    public void setCirclePaint(Paint circlePaint) {
        this.circlePaint = circlePaint;
    }

    public Paint getTitlePaint() {
        return titlePaint;
    }

    public void setTitlePaint(Paint titlePaint) {
        this.titlePaint = titlePaint;
    }

    public void onDraw(Canvas canvas){
        r = getMeasuredWidth()/2;
        canvas.drawCircle(200, 200, 200, circlePaint);
        canvas.drawText(title,r/2,getMeasuredHeight()/2,titlePaint);
    }

}
