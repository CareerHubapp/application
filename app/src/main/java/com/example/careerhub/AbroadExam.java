package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AbroadExam extends AppCompatActivity {

    CardView cardView;
    CardView cardView1;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad_exam);

        cardView=findViewById(R.id.cvGRE);
        cardView1=findViewById(R.id.cvGMAT);
        cardView2=findViewById(R.id.cvIELTS);
        cardView3=findViewById(R.id.cvTOFLE);
        cardView4=findViewById(R.id.cvPTE);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbroadExam.this, AbroadExamGre.class));
            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbroadExam.this, AbroadExamGmat.class));
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbroadExam.this, AbroadExamIelts.class));
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbroadExam.this, AbroadExamTofle.class));
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbroadExam.this, AbroadExamPte.class));
            }
        });
    }
}
