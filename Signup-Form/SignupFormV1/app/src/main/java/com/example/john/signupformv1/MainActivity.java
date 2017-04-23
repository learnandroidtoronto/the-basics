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
    private User userDatabase = new User("", "");

    //___ ArrayList<User> userList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        };

        emailEditText = (EditText)findViewById(R.id.email_editText);
        passwordEditText = (EditText)findViewById(R.id.password_editText);

        Button createButton = (Button)findViewById(R.id.create_button);
        Button loginButton = (Button)findViewById(R.id.login_button);

        createButton.setOnClickListener(listener);




    }
    // == != > < >= <=
    public void createUser(){
        User profileUser = new User(emailEditText.getText().toString(), passwordEditText.getText().toString());
        if (!profileUser.getEmail().equals(userDatabase.getEmail())) {
            userDatabase = profileUser;
            Toast.makeText(this, "Email: " + profileUser.getEmail() + "\nPassword: " + profileUser.getPassword(), Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "This account already exists, go away", Toast.LENGTH_LONG).show();
        }

    }
}
