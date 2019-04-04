package com.pattersonhs.jchen.myapplication2;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    EditText wakeUpTimeEdit;
    EditText travelTimeEdit;
    Button alarmSubmitButton;
    Button textSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wakeUpTimeEdit = (EditText) findViewById(R.id.wakeUpTime);
        travelTimeEdit = (EditText) findViewById(R.id.travelTime);
        alarmSubmitButton = (Button) findViewById(R.id.alarmSubmitButton);
        textSubmitButton = (Button) findViewById(R.id.textSubmitButton);

        //int time = parseInt(wakeUpTimeEdit.getText().toString());

        alarmSubmitButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Intent1 = new Intent(MainActivity.this, scheduleActivity.class);
                        startActivity(Intent1);
                    }

        });

        // textSubmitButton.setOnClickListener(new View.OnClickListener() {
        // @Override
        // public void onClick(View v) {
        //SmsManager smsManager = SmsManager.getDefault();
        //smsManager.sendTextMessage("DESTINATION NUMBER", null, "Your Message Text", null, null);
        // }
        //});
    }

}