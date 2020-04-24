package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndianExam extends AppCompatActivity {

    CardView cardView;
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_exam);

        cardView=findViewById(R.id.cvGate);
        cardView1=findViewById(R.id.cvGMATind);
        cardView2=findViewById(R.id.cvCat);
        cardView3=findViewById(R.id.cvMat);
        cardView4=findViewById(R.id.cvMicat);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExam.this, IndianExamGate.class));
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExam.this, IndianExamGmat.class));
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExam.this, IndianExamCat.class));
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExam.this, IndianExamMat.class));
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExam.this, IndianExamMicat.class));
            }
        });
    }
}
