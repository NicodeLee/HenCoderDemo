package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice2DrawCircleView extends View {

  Paint paint = new Paint();

  public Practice2DrawCircleView(Context context) {
    super(context);
  }

  public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawCircle() 方法画圆
    //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

    paint.setAntiAlias(true);//抗锯齿
    canvas.drawCircle(300,200,150,paint);


    paint.setColor(Color.parseColor("#4A90E2"));
    canvas.drawCircle(300,600,150,paint);

    paint.setStyle(Paint.Style.STROKE); // Style 修改为画线模式
    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(3);
    canvas.drawCircle(700,200,150,paint);

    paint.setStyle(Paint.Style.STROKE ); // Style 修改为画线模式
    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(50); // 线条宽度
    canvas.drawCircle(700,600,120,paint);
  }
}
