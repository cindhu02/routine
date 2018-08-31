package com.example.cindhuja.mornyneeds;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class Main8Activity extends AppCompatActivity {
CalendarView calendarView;
Button bt;
Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (month+1) + "/" + dayOfMonth + "/" + year;
            }
        });
        bt = (Button) findViewById(R.id.btm);
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i6=new Intent(Main8Activity.this, Main9Activity.class);
               startActivity(i6);
               button5 = (Button) findViewById(R.id.button5);
               button5.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent i9=new Intent (Main8Activity.this,Main9Activity.class);
                       startActivity(i9);
                   }
               });
}    });
    }
}