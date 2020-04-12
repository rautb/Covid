package com.sd_it.covid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_CALENDAR)
                        != PackageManager.PERMISSION_GRANTED) {
                    // Permission is not granted
                }

                Intent i =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);

        TextView textView=findViewById(R.id.stsl);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_left);
        textView.startAnimation(animation);

//        ImageView imageView=findViewById(R.id.imageanim);
//        Animation animatio= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_right);
//        imageView.startAnimation(animatio);


    }
}
