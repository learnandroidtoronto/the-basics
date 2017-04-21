package com.example.john.signupformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText)findViewById(R.id.email_editText);
        passwordEditText = (EditText)findViewById(R.id.password_editText);

        Button createButton = (Button)findViewById(R.id.create_button);
        Button loginButton = (Button)findViewById(R.id.login_button);


    }

    public void createUser(View v){
        User profileUser = new User(emailEditText.getText().toString(), passwordEditText.getText().toString());
        Toast.makeText(this, "Email: " + profileUser.getEmail() + "\nPassword: " + profileUser.getPassword(), Toast.LENGTH_LONG).show();
    }
}
