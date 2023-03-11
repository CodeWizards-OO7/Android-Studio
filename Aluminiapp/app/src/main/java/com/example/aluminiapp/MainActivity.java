package com.example.aluminiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.session.MediaController;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bh=(Button)findViewById(R.id.button2);



        bh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    Intent ine = new Intent(MainActivity.this, scroll.class);
                    startActivity(ine);

            }
        });

       Button bh1=(Button) findViewById(R.id.button);

       bh1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               EditText name=(EditText)findViewById(R.id.uname);
               EditText pass=(EditText)findViewById(R.id.upass);

               String a= name.getText().toString();
               String p=pass.getText().toString();

               if(a.equals("admin")&&p.equals("123")) {

                   Intent ie = new Intent(MainActivity.this, Home_page.class);
                   startActivity(ie);
                   name.setText("");
                   pass.setText("");
               }
           }
       });

    }
}