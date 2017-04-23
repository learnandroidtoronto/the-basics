package com.example.owner.signupformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText password_Text;
    private EditText login_Text;
    private User userStorage = new User( " " , " ");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createButton = (Button) findViewById(R.id.createButton);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        password_Text = (EditText) findViewById(R.id.password_Text);
        login_Text = (EditText) findViewById(R.id.login_Text);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        };
        createButton.setOnClickListener(listener);

    }


    public void createUser() {
        User user1 = new User(login_Text.getText().toString(), password_Text.getText().toString());

        if (user1.getEmail().equals(userStorage.getEmail()))
        {
            Toast.makeText(this, "Already In Use", Toast.LENGTH_LONG).show();

        }
        else {
            userStorage=user1;
            Toast.makeText(this, "UserName: " + user1.getEmail() + "\nPassword: " + user1.getPassword(), Toast.LENGTH_LONG).show();
        }



    }
}
