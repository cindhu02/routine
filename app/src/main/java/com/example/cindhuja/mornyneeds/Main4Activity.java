package com.example.cindhuja.mornyneeds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main4Activity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb1,rb2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        rb1= (RadioButton) findViewById(R.id.rb1);
        rb2= (RadioButton) findViewById(R.id.rb2);
        rg= (RadioGroup) findViewById(R.id.rg);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(i2);

            }
        });
    }
}
