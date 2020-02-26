package com.example.wtest004_fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    @Override
    protected void onResume() {
        super.onResume();
        showImageView();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_layout);
        Log.d(TAG, "onCreate: Started");


    }

    private void showImageView() {
        ImageView imview = (ImageView) findViewById(R.id.imageView);
        imview.setImageResource(0);
        Drawable draw;
        draw = null;
        Random rand = new Random();
        int i = rand.nextInt(2);
        switch (i) {
            case 0 : draw = getResources().getDrawable(R.drawable.lemur01,null);  break;
            case 1 : draw = getDrawable(R.drawable.lemur02);break;
            case 2 : draw = getDrawable(R.drawable.lemur03);break;
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText("Image Index "+i);
        //Toast.makeText(this,"Image Index "+i, Toast.LENGTH_SHORT).show();
        imview.setImageDrawable(draw);
    }
}
