package com.example.circlelibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class circleLibraryClass {

    public static void zoom(ImageView imageView, Context context){

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.firstanimation);

        imageView.startAnimation(animation);

    }

    public static void clockwise(ImageView imageView, Context context){

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.clockwise);

        imageView.startAnimation(animation);

    }

}
