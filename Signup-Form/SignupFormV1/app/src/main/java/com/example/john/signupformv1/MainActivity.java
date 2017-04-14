package com.example.john.signupformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailEditText = (EditText)findViewById(R.id.email_editText);
        EditText passwordEditText = (EditText)findViewById(R.id.password_editText);

        Button createButton = (Button)findViewById(R.id.create_button);
        Button loginButton = (Button)findViewById(R.id.login_button);
    }
}
