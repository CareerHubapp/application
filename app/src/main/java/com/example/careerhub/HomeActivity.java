package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT= 4000;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        firebaseAuth = FirebaseAuth.getInstance();
        final FirebaseUser user = firebaseAuth.getCurrentUser();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
                {
                    if(user !=null)
                    {
                        finish();
                        startActivity(new Intent(HomeActivity.this, MainActivity.class));
                    }
                    else {
                        Intent homeIntent = new Intent(HomeActivity.this, StartActivity.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }

        },SPLASH_TIME_OUT);

    }
}
