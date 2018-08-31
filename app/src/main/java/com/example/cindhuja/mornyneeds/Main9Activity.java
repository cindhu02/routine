package com.example.cindhuja.mornyneeds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main9Activity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main9Activity.this,"Starts", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
