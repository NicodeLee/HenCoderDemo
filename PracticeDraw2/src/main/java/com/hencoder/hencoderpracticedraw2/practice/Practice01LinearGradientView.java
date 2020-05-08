package com.hencoder.hencoderpracticedraw2.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice01LinearGradientView extends View {
  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

  public Practice01LinearGradientView(Context context) {
    super(context);
  }

  public Practice01LinearGradientView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice01LinearGradientView(
      Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    // 用 Paint.setShader(shader) 设置一个 LinearGradient
    // LinearGradient 的参数：坐标：(100, 100) 到 (500, 500) ；颜色：#E91E63 到 #2196F3

    // 在设置了 Shader 的情况下， Paint.setColor/ARGB() 所设置的颜色就不再起作用
    @SuppressLint("DrawAllocation")
    Shader shader =
            new LinearGradient(
                    100,
                    100,
                    500,
                    500,
                    Color.parseColor("#E91E63"),
                    Color.parseColor("#2196F3"),
                    Shader.TileMode.CLAMP);
    paint.setShader(shader);

  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    canvas.drawCircle(300, 300, 200, paint);
    /*
      x0 y0 x1 y1：渐变的两个端点的位置
     color0 color1 是端点的颜色
     tile：端点范围之外的着色规则
    */
    @SuppressLint("DrawAllocation")
    Shader shader2 =
        new LinearGradient(
            100,
            100,
            500,
            500,
            Color.parseColor("#EA4335"),
            Color.parseColor("#4285F4"),
            Shader.TileMode.MIRROR);
    paint.setShader(shader2);

    canvas.drawCircle(800, 300, 200, paint);
  }
}
