package com.example.cardviewanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cardviewanimation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CardView card= binding.cardViewDog;
        Button button1= binding.buttonAnim1;
        Button button2= binding.buttonAnim2;
        Button button3= binding.buttonAnim3;
        ImageView imgDog= binding.imageView;

        Animation scale= AnimationUtils.loadAnimation(this,R.anim.scale);
        Animation anim1= AnimationUtils.loadAnimation(this,R.anim.animation1);
        Animation anim2= AnimationUtils.loadAnimation(this,R.anim.animation2);
        Animation anim3= AnimationUtils.loadAnimation(this,R.anim.animation3);

        imgDog.startAnimation(scale);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(anim1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(anim2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(anim3);
            }
        });
    }
}