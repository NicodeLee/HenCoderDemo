package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice7DrawRoundRectView extends View {
  private Paint paint = new Paint();

  public Practice7DrawRoundRectView(Context context) {
    super(context);
  }

  public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice7DrawRoundRectView(
      Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
    //        left, top, right, bottom 是四条边的坐标，rx 和 ry 是圆角的横向半径和纵向半径。

    canvas.drawRoundRect(100,100,500,300,50,50,paint);

    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(3);
    canvas.drawRoundRect(600,100,1000,300,50,50,paint);
  }
}
