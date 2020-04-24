package com.example.careerhub;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends Activity {

    private EditText userName,userPassword,userEmail,userSurname;
    private Button RegButton;
    private TextView userLogin;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        userName = (EditText) findViewById(R.id.etRegName);
        userPassword = (EditText)findViewById(R.id.etRegPassword);
        userSurname = (EditText)findViewById(R.id.etRegSurname);
        userEmail = (EditText)findViewById(R.id.etRegEmail);
        RegButton = (Button)findViewById(R.id.button);
        userLogin = (TextView)findViewById(R.id.tvLogin);

        firebaseAuth = firebaseAuth.getInstance();
        RegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    //Complete the Database
                    String user_email= userEmail.getText().toString().trim();
                    String user_password= userPassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(RegisterActivity.this, "registration Succeddful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(RegisterActivity.this, MainActivity.class));

                            }
                            else{
                                Toast.makeText(RegisterActivity.this, "registration Unsuccessful", Toast.LENGTH_SHORT).show();

                            }
                        }

                    });


                }
            }
        });

        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }



    //@RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    private boolean validate(){
        Boolean result= false;

        String name = userName.getText().toString();
        String surname = userSurname.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();

        if(name.isEmpty() && surname.isEmpty() && password.isEmpty() && email.isEmpty())
        {

            Toast.makeText(this, "Please Enter All Details" ,Toast.LENGTH_SHORT).show();

        }
        else{
            result= true;
        }
        return result;
    }
}