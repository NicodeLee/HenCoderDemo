package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice04BitmapShaderView extends View {
  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

  public Practice04BitmapShaderView(Context context) {
    super(context);
  }

  public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice04BitmapShaderView(
      Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  {
    // 用 Paint.setShader(shader) 设置一个 BitmapShader
    // Bitmap: R.drawable.batman

  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
    /*
    bitmap：用来做模板的 Bitmap 对象
    tileX：横向的 TileMode
    tileY：纵向的 TileMode。
    * */
    Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    paint.setShader(shader);
    canvas.drawCircle(150, 200, 150, paint);

    Shader shader2 = new BitmapShader(bitmap, Shader.TileMode.MIRROR, Shader.TileMode.MIRROR);
    paint.setShader(shader2);
    canvas.drawCircle(500, 200, 150, paint);

    Shader shader3 = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    paint.setShader(shader3);
    canvas.drawCircle(850, 200, 150, paint);
  }
}
