package com.example.owner.signupformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button createButton = (Button)findViewById(R.id.createButton);
    Button loginButton = (Button)findViewById(R.id.loginButton);
    EditText password_Text = (EditText)findViewById(R.id.password_Text);
    EditText login_Text = (EditText)findViewById(R.id.login_Text);
}
