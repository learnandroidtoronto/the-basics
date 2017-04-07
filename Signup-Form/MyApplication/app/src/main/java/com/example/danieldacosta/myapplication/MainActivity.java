package com.example.danieldacosta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        ImageView picofblikaImageView = (ImageView) findViewById(R.id.picofblika);
        Human Blika = new Human(0, "Blika");
        title.setText(Blika.getName());
        picofblikaImageView.setImageResource(R.drawable.Piana);
        EditText edittextname = (EditText) findViewById(R.id.edittextname);




    }
}
