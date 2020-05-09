package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.DiscretePathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.SumPathEffect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice12PathEffectView extends View {
  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
  Path path = new Path();

  public Practice12PathEffectView(Context context) {
    super(context);
  }

  public Practice12PathEffectView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice12PathEffectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    paint.setStyle(Paint.Style.STROKE);

    path.moveTo(50, 100);
    path.rLineTo(50, 100);
    path.rLineTo(80, -150);
    path.rLineTo(100, 100);
    path.rLineTo(70, -120);
    path.rLineTo(150, 80);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    // 使用 Paint.setPathEffect() 来设置不同的 PathEffect

    // 第一处：CornerPathEffect
    PathEffect connerPathEffect = new CornerPathEffect(20);
    paint.setPathEffect(connerPathEffect);
    canvas.drawPath(path, paint);

    canvas.save();
    canvas.translate(500, 0);
    // 第二处：DiscretePathEffect
    PathEffect discretePathEffect = new DiscretePathEffect(20, 5);
    paint.setPathEffect(discretePathEffect);
    canvas.drawPath(path, paint);
    canvas.restore();

    canvas.save();
    canvas.translate(0, 200);
    // 第三处：DashPathEffect 第一个参数 intervals 是一个数组，它指定了虚线的格式：数组中元素必须为偶数（最少是 2
    // 个），按照「画线长度、空白长度、画线长度、空白长度」
    PathEffect dashPathEffect = new DashPathEffect(new float[] {20, 10, 5, 10}, 0);
    paint.setPathEffect(dashPathEffect);
    canvas.drawPath(path, paint);
    canvas.restore();

    canvas.save();
    canvas.translate(500, 200);
    // 第四处：PathDashPathEffect
    Path dashPath = new Path();
    dashPath.lineTo(20, -30);
    dashPath.lineTo(40, 0);
    dashPath.close();
    PathEffect pathDashPathEffect =
        new PathDashPathEffect(dashPath, 50, 0, PathDashPathEffect.Style.MORPH);
    paint.setPathEffect(pathDashPathEffect);
    canvas.drawPath(path, paint);
    canvas.restore();

    canvas.save();
    canvas.translate(0, 400);
    // 第五处：SumPathEffect
    PathEffect dashPathEffect1 = new DashPathEffect(new float[] {20, 10}, 0);
    PathEffect discretePathEffect1 = new DiscretePathEffect(20, 5);
    PathEffect sumPathEffect = new SumPathEffect(dashPathEffect1, discretePathEffect1);
    paint.setPathEffect(sumPathEffect);
    canvas.drawPath(path, paint);
    canvas.restore();

    canvas.save();
    canvas.translate(500, 400);
    // 第六处：ComposePathEffect
      PathEffect dashPathEffect2 = new DashPathEffect(new float[]{20, 10}, 0);
      PathEffect discretePathEffect2 = new DiscretePathEffect(20, 5);
      PathEffect pathEffect = new ComposePathEffect(dashPathEffect2, discretePathEffect2);
      paint.setPathEffect(pathEffect);
    canvas.drawPath(path, paint);
    canvas.restore();
  }
}
