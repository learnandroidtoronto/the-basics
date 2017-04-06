package com.example.john.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleTextView = (TextView)findViewById(R.id.title);
        TextView descriptionTextView = (TextView)findViewById(R.id.description);

        ImageView firstImgImageView = (ImageView)findViewById(R.id.firstImg);
        firstImgImageView.setImageResource(R.drawable.wolf);


        Human johnHuman = new Human("john");

        titleTextView.setText(johnHuman.getName());

        /**johnTextView.*/


    }
}
