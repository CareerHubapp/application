package com.example.careerhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class EnterNumber extends AppCompatActivity {
    private EditText editText, date, name;
     public static String number;
     final  Calendar c= Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_number);

        editText= findViewById(R.id.etNumber);
        date= findViewById(R.id.etDate);
        name= findViewById(R.id.etClsBookName);



        final DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                c.set(Calendar.YEAR, year);
                c.set(Calendar.MONTH, month);
                c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(EnterNumber.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        final String dt=date.getText().toString();
        findViewById(R.id.btnOtp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*if(number.length() < 13){
                    editText.setError(" Valid Number is required");
                    editText.requestFocus();
                    return;
                }*/
                number=editText.getText().toString();
                Intent intent = new Intent(EnterNumber.this, VerificationPhoneActivity.class);
                intent.putExtra("phoneNumber", number);
                intent.putExtra("date", dt);
                startActivity(intent);
            }
        });

    }
    private void updateLabel()
    {
        String format="dd/mm/yy";
        SimpleDateFormat s=new SimpleDateFormat(format, Locale.ENGLISH);
        date.setText(s.format(c.getTime()));
    }
}
