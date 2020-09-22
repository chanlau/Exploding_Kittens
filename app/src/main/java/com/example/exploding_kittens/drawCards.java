package com.example.exploding_kittens;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class drawCards extends SurfaceView {

    private Paint magentaPaint = new Paint();

    public drawCards(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

        this.magentaPaint.setColor(Color.MAGENTA);
    }



    //override the onDraw method in SurfaceView
    @Override
    public void onDraw(Canvas canvas) {

        //draw a favor card
        Bitmap favorCard = BitmapFactory.decodeResource(getResources(), R.drawable.favorcard);
        Bitmap resizedCard = Bitmap.createScaledBitmap(favorCard, 200, 300, true);
        canvas.drawBitmap(resizedCard, 50.0f, 50.0f, null);
    }

}
