package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClassesActivity extends AppCompatActivity {
    CardView cardView,cardView1,cardView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        cardView= findViewById(R.id.cvcls1);
        cardView1= findViewById(R.id.cvcls2);
        cardView2= findViewById(R.id.cvcls3);

        button=findViewById(R.id.btnCall);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9737524252"));
                startActivity(intent);
            }
        });


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClassesActivity.this, ExtraClass.class));

            }
        });

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClassesActivity.this, ExtraClass.class));

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClassesActivity.this, ExtraClass.class));

            }
        });

    }
}
