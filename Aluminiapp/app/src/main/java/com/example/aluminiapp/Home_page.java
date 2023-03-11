package com.example.aluminiapp;

import static com.example.aluminiapp.R.id.le;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_page extends AppCompatActivity {
    ImageView img1;
    ImageView img2;

    ImageView img3;
    ImageView img4;
    ImageView img5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        img1=findViewById(R.id.ne);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Home_page.this,News_Event.class);
                startActivity(in);

            }
        });


        img2=findViewById(R.id.le);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Home_page.this,News_letter.class);
                startActivity(in);

            }
        });

        img3=findViewById(R.id.almeet);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Home_page.this,alumni_meet.class);
                startActivity(in);

            }
        });

        img4=findViewById(R.id.alact);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Home_page.this,alumni_activitcs.class);
                startActivity(in);

            }
        });

        img5=findViewById(R.id.gal);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Home_page.this,Gallery.class);
                startActivity(in);

            }
        });

        ImageView profile=findViewById(R.id.imageView12);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();

            }
        });
    }
}