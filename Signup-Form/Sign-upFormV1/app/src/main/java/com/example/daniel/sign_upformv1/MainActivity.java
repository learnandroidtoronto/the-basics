package com.example.daniel.sign_upformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText) findViewById(R.id.EmailEditText);

        passwordEditText = (EditText) findViewById(R.id.PasswordEditText);

        Button createButton = (Button) findViewById(R.id.CreateButton);

        Button loginButton = (Button) findViewById(R.id.LoginButton);
    }

    public void createUser( View v ){
        User profileUser = new User(emailEditText.getText().toString(),passwordEditText.getText().toString());

        Toast.makeText(this,"email: " + profileUser.getEmail()+ "\n" + "password: " + profileUser.getPassword(), Toast.LENGTH_LONG).show();
    }


}