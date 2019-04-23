package com.manishmundra.toaster;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public  class Toaster {
    public static int LENGTH_LONG= 1;
    public static int LENGTH_SHORT = 0;
    private static int position = Gravity.TOP;
    private static int duration = 0;





    public static void showSuccessToast(Context context, String message, int duration){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.success_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }


    public static void showSuccessToast(Context context, String message){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.success_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }

    public static void showSuccessToast(Context context, String message, int duration, int position){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.success_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }




    public static void showErrorToast(Context context, String message, int position, int duration){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.error_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);

        createToast(context,layout,position,duration);
    }

    public static void showErrorToast(Context context, String message, int position){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.error_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);

        createToast(context,layout,position,duration);
    }

    public static void showErrorToast(Context context, String message){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.error_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);

        createToast(context,layout,position,duration);
    }


    public static void showInfoToast(Context context, String message, int position, int duration){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.info_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }

    public static void showInfoToast(Context context, String message, int position){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.info_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }

    public static void showInfoToast(Context context, String message){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View layout = layoutInflater.inflate(R.layout.toaster_layout,null);
        ImageView customToastMessageIv = layout.findViewById(R.id.custom_toast_image);
        TextView customToastMessageTv = layout.findViewById(R.id.custom_toast_message);
        customToastMessageIv.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.toaster_round_background);
        drawable.setColorFilter(ContextCompat.getColor(context, R.color.info_color), PorterDuff.Mode.MULTIPLY);
        layout.setBackground(drawable);
        customToastMessageTv.setTextColor(Color.WHITE);
        customToastMessageTv.setText(message);
        createToast(context,layout,position,duration);
    }
    private static void createToast(Context context, View layout, int position, int duration) {
        Toast toast = new Toast(context.getApplicationContext());
        toast.setDuration(duration);
        toast.setGravity(position, 0, 40);
        toast.setView(layout); //setting the view of custom toast layout
        toast.show();
    }
}
