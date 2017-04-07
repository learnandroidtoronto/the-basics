 package com.example.daniel.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstance = State);
        setContentView(R.layout.activity_main);



        TextView titleTextView = (TextView) findViewById(R.id.title);

        TextView descriptionTextView = (TextView) findViewById(R.id.description);

        ImageView _imageViewImageView = (ImageView) findViewById(R.id._imageView);

        Button setUpTextButtonbutton = (Button) findViewById(R.id.setUpTextButton);

        EditText userInput_EditTextEditText = (EditText) findViewById(R.id.userInput_EditText);

        Human Daniel = new Human("Daniel");
        titleTextView.setText(Daniel.getName());

        _imageViewImageView.setImageResource(R.drawable.logo_bar_brothers);

    }



 }


