package com.example.careerhub;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import static com.example.careerhub.EnterNumber.number;

public class ConformationActivity extends AppCompatActivity {
    Button btn;
    public static int SEND_SMS_CODE=1;
    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conformation);
        String num=number;
        btn=findViewById(R.id.btnBackToMain);
        date=getIntent().getStringExtra("date");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConformationActivity.this, MainActivity.class));
            }
        });
        if(checkpermission(Manifest.permission.SEND_SMS))
        {
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(num,null,"Congratulation!, you have successfully Register for the class. your trial starts from " + date ,null,null);
        }
        else
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},SEND_SMS_CODE);
        }
    }
    public boolean checkpermission(String permission)
    {
        int check= ContextCompat.checkSelfPermission(this,permission);
        return (check== PackageManager.PERMISSION_GRANTED);
    }



}
