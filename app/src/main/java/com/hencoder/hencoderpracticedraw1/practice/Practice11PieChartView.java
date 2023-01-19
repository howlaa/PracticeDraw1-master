package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Path path = new Path();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawArc(200,200,580,580,-180,130,true,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(200,200,600,600,-45,35,true,paint);
        paint.setColor(Color.parseColor("#A066D3"));
        canvas.drawArc(200,200,600,600,-5,10,true,paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(200,200,600,600,7,10,true,paint);
        paint.setColor(Color.parseColor("#2E8B57"));
        canvas.drawArc(200,200,600,600,18,45,true,paint);
        paint.setColor(Color.parseColor("#1E90FF"));
        canvas.drawArc(200,200,600,600,64,110,true,paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        canvas.drawText("饼图",400,680,paint);

        //画文字
        paint.setTextSize(30);
        canvas.drawText("Lollipop",100,150,paint);
        paint.setStyle(Paint.Style.STROKE);

        //画线
        path.moveTo(230,170);
        path.lineTo(350,170);
        path.rLineTo(0,30);
        canvas.drawPath(path,paint);

        path.moveTo(600,300);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
