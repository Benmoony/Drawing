package edu.cascadia.brianb.mydrawing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Edited by Brian Bansenauer on 10/18/15.
 */
public class SimplyDrawnView extends View {

    private Paint mPaint;
    private Path mPath;
    private float mWidth, mHeight;

    public SimplyDrawnView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        mPaint = new Paint();
        mPath = new Path();
        mPath.addArc(0f, 600f, mWidth/2f, 600f, 270f, 90f);
     }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE); //draw background

        //Draw line
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(16.0f);
        canvas.drawLine(mWidth, 0, 200, mHeight, mPaint);

        //Draw red line
        mPaint.setColor(Color.RED); mPaint.setStrokeWidth(20);
        canvas.drawLine(0, 200, mWidth, 200, mPaint);
        //Draw green lines
        mPaint.setColor(Color.GREEN); mPaint.setStrokeWidth(5);
        canvas.drawLine(mWidth, 55, 125, mHeight, mPaint);



        //Draw Text
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(60);
        canvas.drawText("Hello", 300, 300, mPaint);

        //Draw Text on a Path
        mPaint.setTextSize(60);
        canvas.drawText("Greetings", mPath, 0, 20, mPaint);

        //Draw filled, opaque, and open ovals

        //Draw bee bitmap
        Drawable b = getResources().getDrawable(R.drawable.bee,null);

        //Add another image to drawable and draw it

    }
}
