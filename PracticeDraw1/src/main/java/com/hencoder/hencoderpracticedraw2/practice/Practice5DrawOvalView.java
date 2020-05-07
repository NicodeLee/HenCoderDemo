package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Practice5DrawOvalView extends View {

  private Paint paint = new Paint();

  public Practice5DrawOvalView(Context context) {
    super(context);
  }

  public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawOval() 方法画椭圆
    paint.setStyle(Paint.Style.FILL);
    canvas.drawOval(50, 50, 350, 200, paint);

    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawOval(400, 50, 700, 200, paint);
  }
}
