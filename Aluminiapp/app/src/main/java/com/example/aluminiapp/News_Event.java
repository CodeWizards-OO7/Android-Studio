package com.example.aluminiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class News_Event extends AppCompatActivity {

    ImageView img1;
    ImageView img2;

    ImageView img3;
    ImageView img4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_event);

        img1=findViewById(R.id.nle);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(News_Event.this,News_letter.class);
                startActivity(in);
                //finishActivity(0);

            }
        });

        img2=findViewById(R.id.nalmeet);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(News_Event.this,alumni_meet.class);
                startActivity(in);

            }
        });

        img3=findViewById(R.id.nalact);

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(News_Event.this,alumni_activitcs.class);
                startActivity(in);

            }
        });

        img4=findViewById(R.id.ngal);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(News_Event.this,Gallery.class);
                startActivity(in);

            }
        });

    }
}