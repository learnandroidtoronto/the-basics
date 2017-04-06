 package com.example.daniel.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView titleTextView = (TextView) findViewById(R.id.title);

        TextView descriptionTextView = (TextView) findViewById(R.id.description);

        ImageView _imageViewImageView = (ImageView) findViewById(R.id._imageView);

        Human Daniel = new Human("Daniel");
        titleTextView.setText(Human.getName());


    }



 }


