package com.example.daniel.sign_upformv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView EmailEditTextTextview = (TextView) findViewById(R.id.EmailEditText);

    TextView PasswordEditTextTextview = (TextView) findViewById(R.id.PasswordEditText);

    Button CreateButtonButton = (Button) findViewById(R.id.CreateButton);

    Button LoginButtonButton = (Button) findViewById(R.id.LoginButton);
}
