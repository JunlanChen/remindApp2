package com.pattersonhs.jchen.myapplication2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scheduleActivity extends AppCompatActivity {
    Button lunchASchedule;
    Button lunchBSchedule;
    Button halfDay;
    Button clipperWednesdayALunch;
    Button clipperWednesdayBLunch;
    Button twoHourDelay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        lunchASchedule = (Button) findViewById(R.id.lunchASchedule);
        lunchBSchedule = (Button) findViewById(R.id.lunchBSchedule);
        halfDay = (Button) findViewById(R.id.halfDay);
        clipperWednesdayALunch = (Button) findViewById(R.id.clipperWednesdayALunch);
        clipperWednesdayBLunch = (Button) findViewById(R.id.clipperWednesdayBLunch);
        twoHourDelay = (Button) findViewById(R.id.twoHourDelay);


        lunchASchedule.setOnClickListener(new View.OnClickListener() {
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
                intent2.putExtra(AlarmClock.EXTRA_MINUTES,58);
                if (intent2 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
                Intent intent3 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent3.putExtra(AlarmClock.EXTRA_MESSAGE,"3rd Period Alarm");
                intent3.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent3.putExtra(AlarmClock.EXTRA_MINUTES,21);
                if (intent3 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
                Intent intent4 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent4.putExtra(AlarmClock.EXTRA_MESSAGE,"4th Period Alarm");
                intent4.putExtra(AlarmClock.EXTRA_HOUR,13);
                intent4.putExtra(AlarmClock.EXTRA_MINUTES,12);
                if (intent4 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent4);
                }
                Intent intent5 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent5.putExtra(AlarmClock.EXTRA_MESSAGE,"5th Period Alarm");
                intent5.putExtra(AlarmClock.EXTRA_HOUR,14);
                intent5.putExtra(AlarmClock.EXTRA_MINUTES,25);
                if (intent5 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent5);
                }
            }
        });

        lunchBSchedule.setOnClickListener(new View.OnClickListener() {
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
                intent2.putExtra(AlarmClock.EXTRA_MINUTES,58);
                if (intent2 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
                Intent intent3 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent3.putExtra(AlarmClock.EXTRA_MESSAGE,"3rd Period Alarm");
                intent3.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent3.putExtra(AlarmClock.EXTRA_MINUTES,21);
                if (intent3 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
                Intent intent4 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent4.putExtra(AlarmClock.EXTRA_MESSAGE,"4th Period Alarm");
                intent4.putExtra(AlarmClock.EXTRA_HOUR,13);
                intent4.putExtra(AlarmClock.EXTRA_MINUTES,47);
                if (intent4 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent4);
                }
                Intent intent5 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent5.putExtra(AlarmClock.EXTRA_MESSAGE,"5th Period Alarm");
                intent5.putExtra(AlarmClock.EXTRA_HOUR,14);
                intent5.putExtra(AlarmClock.EXTRA_MINUTES,25);
                if (intent5 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent5);
                }
            }
        });
        clipperWednesdayALunch.setOnClickListener(new View.OnClickListener() {
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
                Intent intent6 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent6.putExtra(AlarmClock.EXTRA_MESSAGE,"Block 1");
                intent6.putExtra(AlarmClock.EXTRA_HOUR,13);
                intent6.putExtra(AlarmClock.EXTRA_MINUTES,00);
                if (intent6 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent6);
                }
                Intent intent7 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent7.putExtra(AlarmClock.EXTRA_MESSAGE,"Block 2");
                intent7.putExtra(AlarmClock.EXTRA_HOUR,14);
                intent7.putExtra(AlarmClock.EXTRA_MINUTES,15);
                if (intent7 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent7);
                }
            }
        });
        clipperWednesdayBLunch.setOnClickListener(new View.OnClickListener() {
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
                Intent intent6 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent6.putExtra(AlarmClock.EXTRA_MESSAGE,"Block 1");
                intent6.putExtra(AlarmClock.EXTRA_HOUR,12);
                intent6.putExtra(AlarmClock.EXTRA_MINUTES,30);
                if (intent6 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent6);
                }
                Intent intent7 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent7.putExtra(AlarmClock.EXTRA_MESSAGE,"Block 2");
                intent7.putExtra(AlarmClock.EXTRA_HOUR,14);
                intent7.putExtra(AlarmClock.EXTRA_MINUTES,15);
                if (intent7 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent7);
                }
            }
        });
        halfDay.setOnClickListener(new View.OnClickListener() {
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
        twoHourDelay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent1.putExtra(AlarmClock.EXTRA_MESSAGE,"Start School Alarm");
                intent1.putExtra(AlarmClock.EXTRA_HOUR,10);
                intent1.putExtra(AlarmClock.EXTRA_MINUTES,45);
                if (intent1 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent1);
                }
                Intent intent2 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent2.putExtra(AlarmClock.EXTRA_MESSAGE,"2nd Period Start");
                intent2.putExtra(AlarmClock.EXTRA_HOUR,11);
                intent2.putExtra(AlarmClock.EXTRA_MINUTES,36);
                if (intent2 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
                Intent intent3 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent3.putExtra(AlarmClock.EXTRA_MESSAGE,"3rd Period Alarm");
                intent3.putExtra(AlarmClock.EXTRA_HOUR,12);
                intent3.putExtra(AlarmClock.EXTRA_MINUTES,37);
                if (intent3 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent3);
                }
                Intent intent4 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent4.putExtra(AlarmClock.EXTRA_MESSAGE,"4th Period Alarm");
                intent4.putExtra(AlarmClock.EXTRA_HOUR,13);
                intent4.putExtra(AlarmClock.EXTRA_MINUTES,56);
                if (intent4 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent4);
                }
                Intent intent5 = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent5.putExtra(AlarmClock.EXTRA_MESSAGE,"5th Period Alarm");
                intent5.putExtra(AlarmClock.EXTRA_HOUR,14);
                intent5.putExtra(AlarmClock.EXTRA_MINUTES,47);
                if (intent5 .resolveActivity(getPackageManager()) != null) {
                    startActivity(intent5);
                }
            }

        });
    }

}
