package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CollegesActivity extends AppCompatActivity {

    CardView cardView,cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);

        cardView=findViewById(R.id.cvInColleges);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesActivity.this, CollegesIndia.class));
            }
        });
        cardView1=findViewById(R.id.cvAbColleges);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CollegesActivity.this, CollegesAbroad.class));
            }
        });

    }
}
