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
        clipperWednesday = (Button) findViewById(R.id.clipperWednesdayALunch);
        twoHourDelay = (Button) findViewById(R.id.twoHourDelay);

        clipperWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent1.putExtra(AlarmClock.EXTRA_MESSAGE,"Start School Alarm");
                intent1.putExtra(AlarmClock.EXTRA_HOUR,8);
                intent1.putExtra(AlarmClock.EXTRA_MINUTES,40);
                if (intent1 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
                Intent intent2 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent2.putExtra(AlarmClock.EXTRA_MESSAGE,"2nd Period Start");
                intent2.putExtra(AlarmClock.EXTRA_HOUR,9);
                intent2.putExtra(AlarmClock.EXTRA_MINUTES,28);
                if (intent2 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
                Intent intent3 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent3.putExtra(AlarmClock.EXTRA_MESSAGE,"3rd Period Alarm");
                intent3.putExtra(AlarmClock.EXTRA_HOUR,10);
                intent3.putExtra(AlarmClock.EXTRA_MINUTES,21);
                if (intent3 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
                Intent intent4 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent4.putExtra(AlarmClock.EXTRA_MESSAGE,"4th Period Alarm");
                intent4.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent4.putExtra(AlarmClock.EXTRA_MINUTES,04);
                if (intent4 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent4);
                }
                Intent intent5 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent5.putExtra(AlarmClock.EXTRA_MESSAGE,"5th Period Alarm");
                intent5.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent5.putExtra(AlarmClock.EXTRA_MINUTES,47);
                if (intent5 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent5);
                }
            }
        });
    }
}
