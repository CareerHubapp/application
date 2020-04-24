package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MbaActivity extends AppCompatActivity {

    CardView cardView3;
    private CardView cvCourse;
    private TextView tvBook;
    public TextView tvSalary;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mba);
        cvCourse=(CardView) findViewById(R.id.cvCourse);
        cardView=findViewById(R.id.cvExam);

        cvCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MbaActivity.this, MbaCourse.class));
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MbaActivity.this, IndianExam.class));
            }
        });
        cardView3=findViewById(R.id.MbaColleges);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MbaActivity.this, InMbaColleges.class));
            }
        });

    }
}
