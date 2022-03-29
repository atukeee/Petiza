package com.example.petiza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imageView6=findViewById(R.id.imageView6);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search= new Intent(Home.this,Search.class);
                startActivity(search);
            }
        });
    }
}