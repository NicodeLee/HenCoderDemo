package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class Practice9DrawPathView extends View {

  Paint paint = new Paint();
  Path path = new Path();

  public Practice9DrawPathView(Context context) {
    super(context);
  }

  public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    // 使用 path 对图形进行描述（这段描述代码不必看懂）
    path.addArc(200, 200, 400, 400, -225, 225);
    path.arcTo(400, 200, 600, 400, -180, 225, false);
    path.lineTo(400, 542);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawPath() 方法画心形

    canvas.drawPath(path,paint);


  }
}
