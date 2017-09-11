package com.tree.rh.ctlib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sittu Agrawal on 11-09-2017.
 */

public class CT {

    public CT(Builder builder) {
        LayoutInflater inflater = (LayoutInflater) builder.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layout = inflater.inflate(R.layout.custom_layout, null);
        TextView tv = layout.findViewById(R.id.cltv);
        tv.setText(builder.text);
        tv.setTextColor(builder.textCol);

        ImageView iv = layout.findViewById(R.id.cliv);
        iv.setImageResource(builder.imageRes);


        GradientDrawable shape = new GradientDrawable();
        shape.setShape(builder.shape);
        shape.setCornerRadii(new float[]{
                builder.radiusTopLeft,
                builder.radiusTopLeft,
                builder.radiusTopRight,
                builder.radiusTopRight,
                builder.radiusBottomRight,
                builder.radiusBottomRight,
                builder.radiusBottomLeft,
                builder.radiusBottomLeft
        });
        shape.setColor(builder.backCol);
        shape.setStroke(builder.borderWidth, builder.borderCol);

        layout.setBackgroundDrawable(shape);
        Toast toast = new Toast(builder.context);
        toast.setView(layout);
        toast.setDuration(builder.toastDuration);
        toast.setGravity(builder.toastGravity,0,100);
        toast.show();
    }

    public static void normal(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

    public static void normal2(Context context, String text){
        new CT.Builder(context, text)
                .borderWidth(0)
                .backCol(Color.BLACK)
                .textCol(Color.WHITE)
                .radius(80,0,0,80)
                .show();
    }

    public static void success(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.rgb(23, 138, 26))
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.WHITE)
                .image(R.drawable.success)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void success2(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.WHITE)
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.BLACK)
                .image(R.drawable.success2)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void failed(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.rgb(255, 59, 59))
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.WHITE)
                .image(R.drawable.failed)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void failed2(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.WHITE)
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.BLACK)
                .image(R.drawable.failed)
                .radius(50, 50, 50, 50)
                .show();
    }


    public static void loading(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.rgb(51, 102, 204))
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.WHITE)
                .image(R.drawable.loading)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void loading2(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.WHITE)
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.BLACK)
                .image(R.drawable.loading)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void mute(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.rgb(204,0,0))
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.WHITE)
                .image(R.drawable.mute)
                .radius(50, 50, 50, 50)
                .show();
    }

    public static void mute2(Context context, String text) {
        new Builder(context, text)
                .shape(GradientDrawable.RECTANGLE)
                .backCol(Color.WHITE)
                .borderCol(Color.BLACK)
                .borderWidth(10)
                .textCol(Color.BLACK)
                .image(R.drawable.mute)
                .radius(50, 50, 50, 50)
                .show();
    }


    public static class Builder {

        private Context context;
        private String text;
        private int imageRes=0;
        private int shape=GradientDrawable.RECTANGLE;
        private int backCol=Color.WHITE;
        private int borderCol=Color.BLACK;
        private int textCol=Color.BLACK;
        private int borderWidth=15;
        private int toastDuration=Toast.LENGTH_SHORT;
        private int toastGravity= Gravity.BOTTOM;

        private int radiusTopLeft = 0;
        private int radiusTopRight = 0;
        private int radiusBottomLeft = 0;
        private int radiusBottomRight = 0;

        public Builder(Context context, String text) {
            this.context = context;
            this.text = text;

            shape = GradientDrawable.RECTANGLE;
            backCol = Color.WHITE;
            borderCol = Color.BLACK;
            textCol = Color.BLACK;
            imageRes = 0;
        }

        public Builder shape(int shape) {
            this.shape = shape;
            return this;
        }

        public Builder image(int imageRes) {
            this.imageRes = imageRes;
            return this;
        }

        public Builder backCol(int color) {
            this.backCol = color;
            return this;
        }

        public Builder borderCol(int color) {
            this.borderCol = color;
            return this;
        }

        public Builder textCol(int color) {
            this.textCol = color;
            return this;
        }

        public Builder borderWidth(int borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Builder radius(int topLeft, int topRight, int bottomLeft, int bottomRight) {
            this.radiusTopLeft = topLeft;
            this.radiusTopRight = topRight;
            this.radiusBottomLeft = bottomLeft;
            this.radiusBottomRight = bottomRight;
            return this;
        }

        public Builder duration(int durationConstant){
            this.toastDuration= durationConstant;
            return this;
        }

        public Builder gravity(int gravityConstant){
            this.toastGravity= gravityConstant;
            return this;
        }

        public void show() {
            new CT(this);
        }

    }//innerEND
}//classEND
