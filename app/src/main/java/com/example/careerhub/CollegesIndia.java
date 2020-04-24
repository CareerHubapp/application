package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CollegesIndia extends AppCompatActivity {
    CardView cardView,cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges_india);

        cardView=findViewById(R.id.cvInMTECHColleges);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesIndia.this, InMtechColleges.class));
            }
        });
        cardView1=findViewById(R.id.cvInMBAColleges);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesIndia.this, InMbaColleges.class));
            }
        });
    }
}
