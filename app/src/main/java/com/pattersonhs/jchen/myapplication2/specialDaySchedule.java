package com.pattersonhs.jchen.myapplication2;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class specialDaySchedule extends AppCompatActivity {
    Button halfDay;
    Button clipperWednesday;
    Button twoHourDelay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_day_schedule);

        halfDay = (Button) findViewById(R.id.halfDay);
        clipperWednesday = (Button) findViewById(R.id.clipperWednesday);
        twoHourDelay = (Button) findViewById(R.id.twoHourDelay);

       
    }
}
