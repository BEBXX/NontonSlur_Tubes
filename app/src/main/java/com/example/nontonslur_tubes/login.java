package com.example.nontonslur_tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    private Button LogIn;
    private Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SignUp = (Button) findViewById(R.id.confirm_button2);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignup();
            }
        });

        LogIn = (Button) findViewById(R.id.confirm_button1);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openprofile();
            }
        });
    }

    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void openprofile(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}