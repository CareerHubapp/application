package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IndianExamGate extends AppCompatActivity {

    private CardView cvPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_exam_gate);

        cvPattern=findViewById(R.id.cvGatePattern);

        cvPattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IndianExamGate.this, GatePattern.class));
            }
        });
    }
}
