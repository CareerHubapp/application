package com.example.careerhub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    ImageView i;
    ImageView ie;
    Toolbar t;
    CardView exam,career,cardView,colleges;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=findViewById(R.id.tool);
        auth=FirebaseAuth.getInstance();
        drawer=findViewById(R.id.drawer);
        setSupportActionBar(t);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,t,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView nav=findViewById(R.id.nav);
        career=findViewById(R.id.cvCareer);
        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, CareerActivity.class));
            }
        });

        exam=findViewById(R.id.cvExams);
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ExamActivity.class));
            }
        });

        colleges=findViewById(R.id.cvColleges);
        colleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CollegesActivity.class));
            }
        });

        cardView=findViewById(R.id.cvClasses);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClassesActivity.class));
            }
        });
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.logout:
                        auth.signOut();
                        finish();
                        Intent in=new Intent(MainActivity.this,LoginActivity.class);
                        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(in);
                        break;
                    case R.id.share:
                        Intent i=new Intent(Intent.ACTION_SEND);
                        i.setType("text/plain");
                        startActivity(Intent.createChooser(i,"Share using"));
                        break;
                    case  R.id.info:
                        Intent myIntent=new Intent(MainActivity.this, Aboutus.class);
                        startActivity(myIntent);
                        break;
                }
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
