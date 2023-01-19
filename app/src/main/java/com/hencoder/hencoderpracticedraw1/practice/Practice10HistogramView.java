package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        path.moveTo(200,200);
        path.lineTo(200,600);
        path.lineTo(1000,600);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path,paint);

        //画文字
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(30);
        canvas.drawText("Froyo",210,630,paint);
        canvas.drawText("GB",330,630,paint);
        canvas.drawText("ICS",450,630,paint);
        canvas.drawText("JB",570,630,paint);
        canvas.drawText("KitKat",690,630,paint);
        canvas.drawText("L",810,630,paint);
        canvas.drawText("M",930,630,paint);

        //画矩形
        paint.setColor(Color.GREEN);
        canvas.drawRect(200,580,300,600,paint);
        canvas.drawRect(310,550,410,600,paint);
        canvas.drawRect(420,580,520,600,paint);
        canvas.drawRect(525,300,630,600,paint);
        canvas.drawRect(635,400,740,600,paint);
        canvas.drawRect(750,550,850,600,paint);
        canvas.drawRect(860,200,970,600,paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
