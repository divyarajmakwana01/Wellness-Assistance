package com.example.wellness_assistance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView title;
    Button start;
    ImageView img1;
    Animation anim_img1, anim_title, btn_anim, load_progress, load_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim_img1 = AnimationUtils.loadAnimation(this, R.anim.animimage1);
        anim_title = AnimationUtils.loadAnimation(this, R.anim.title);
        btn_anim = AnimationUtils.loadAnimation(this, R.anim.btnanim);
        load_progress = AnimationUtils.loadAnimation(this, R.anim.progress);
        load_stop = AnimationUtils.loadAnimation(this, R.anim.progress_stop);

        title = findViewById(R.id.title_txt);
        start = findViewById(R.id.btn1);
        img1 = findViewById(R.id.img1);

        img1.startAnimation(anim_img1);
        title.startAnimation(anim_title);
        start.startAnimation(btn_anim);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserPage();
            }
        });
    }

    public void openUserPage() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}