package com.example.nontonslur_tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class signup extends AppCompatActivity {
    private Button SignIn;
    private Button LogIn;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        checkBox = (CheckBox) findViewById(R.id.checkbox);
        
        LogIn = (Button) findViewById(R.id.confirm_button4);
        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });

        SignIn = (Button) findViewById(R.id.confirm_button3);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()){
                    openpayment();
                }
            }
        });

    }

    public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void openpayment(){
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

}