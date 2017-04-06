package com.example.owner.myworkoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titleTextView = (TextView) findViewById(R.id.Title);
        TextView descriptionTextView = (TextView) findViewById(R.id.Description);
        ImageView pictureImageView = (ImageView) findViewById(R.id.Picture);
        Human Jason = new Human(175, 150, "Portuguese", "Jason", 20000);
        titleTextView.setText(Jason.getName());
        pictureImageView.setImageResource(R.drawable.logo);

    }
}
