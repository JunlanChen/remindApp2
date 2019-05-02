package com.pattersonhs.jchen.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Start extends AppCompatActivity {
    Button adminLogin;
    Button studentLogin;
    String toastMessageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
         adminLogin = (Button) findViewById(R.id.adminLogin);
         studentLogin = (Button) findViewById(R.id.studentLogin);

         toastMessageID = "Will be inpletement in the future";

        studentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent1 = new Intent(Start.this, scheduleActivity.class);
                startActivity(Intent1);
            }
        });
        adminLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Start.this,toastMessageID,Toast.LENGTH_SHORT).show();
                //Intent Intent1 = new Intent(Start.this, adminLoginActivity.class);
                //startActivity(Intent1);
            }
        });
    }
}
