package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice4DrawPointView extends View {

  private Paint paint = new Paint();

  public Practice4DrawPointView(Context context) {
    super(context);
  }

  public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawPoint() 方法画点
    //        一个圆点，一个方点
    //        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

    paint.setStrokeWidth(50);
    paint.setStrokeCap(Paint.Cap.ROUND);
    canvas.drawPoint(300,200,paint);

    paint.setStrokeWidth(50);
    paint.setStrokeCap(Paint.Cap.BUTT);
    canvas.drawPoint(600,200,paint);


    paint.setStrokeWidth(20);
    paint.setStrokeCap(Paint.Cap.ROUND);
    float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
// 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
    canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
            8 /* 一共绘制 8 个数（4 个点）*/, paint);
  }
}
