package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MtechActivity extends AppCompatActivity {

    CardView cardView,cardView2;
    private TextView tvCourse;
    private TextView tvBook;
    public TextView tvSalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtech);

        cardView=findViewById(R.id.cvExam);
        tvCourse=(TextView)findViewById(R.id.tvCourse);
        tvCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MtechActivity.this, MbaCourse.class));
            }
        });



        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MtechActivity.this, IndianExam.class));
            }
        });
        cardView2=findViewById(R.id.MtechColleges);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MtechActivity.this, InMtechColleges.class));
            }
        });

}
}
