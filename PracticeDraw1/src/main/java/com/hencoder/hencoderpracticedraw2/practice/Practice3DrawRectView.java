package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice3DrawRectView extends View {

  private Paint paint = new Paint();

  public Practice3DrawRectView(Context context) {
    super(context);
  }

  public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawRect() 方法画矩形

    //left, top, right, bottom 是矩形四条边的坐标。
    paint.setStyle(Paint.Style.FILL);
    canvas.drawRect(100, 100, 400, 400, paint);

    paint.setStyle(Paint.Style.STROKE);
    canvas.drawRect(500, 100, 800, 400, paint);
  }
}
