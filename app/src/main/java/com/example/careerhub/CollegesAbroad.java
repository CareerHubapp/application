package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CollegesAbroad extends AppCompatActivity {
    CardView cardView,cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges_abroad);

        cardView=findViewById(R.id.cvAbMTECHColleges);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesAbroad.this, AbMbaColleges.class));
            }
        });
        cardView1=findViewById(R.id.cvAbMBAColleges);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesAbroad.this, AbMtechColleges.class));
            }
        });
    }
}
