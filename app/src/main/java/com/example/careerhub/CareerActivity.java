package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CareerActivity extends AppCompatActivity {

    ImageView Mtechiv;
    ImageView Mbaiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        Mtechiv=findViewById(R.id.ivMtech);
        Mbaiv=findViewById(R.id.ivMba);
        Mtechiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CareerActivity.this, MtechActivity.class));
            }
        });

        Mtechiv=findViewById(R.id.ivMtech);
        Mbaiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CareerActivity.this, MbaActivity.class));
            }
        });
    }
}
