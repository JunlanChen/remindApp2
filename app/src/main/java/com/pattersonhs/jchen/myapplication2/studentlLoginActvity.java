package com.pattersonhs.jchen.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class studentlLoginActvity extends AppCompatActivity {
    User user;
    EditText usernameEdit;
    EditText passwordEdit;
    Button loginSubmit;
    int toastMessageID;
    String typedPassword;
    String typedUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_actvity);
        usernameEdit = (EditText) findViewById(R.id.usernameEdit);
        passwordEdit = (EditText) findViewById(R.id.passwordEdit);
        loginSubmit = (Button) findViewById(R.id.loginSubmit);

        //user.setPassword("12345");
        // user.setUsername("stu1");
        typedPassword = passwordEdit.getText().toString().trim();
        typedUsername = usernameEdit.getText().toString().trim();
        toastMessageID = R.string.wrongPassUser;

        loginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usernameEdit.equals("stu1")&& passwordEdit.equals("12345") )
                {
                    Intent Intent1 = new Intent(studentlLoginActvity.this, MainActivity.class);
                    startActivity(Intent1);
                }
                else
                {
                    Toast.makeText(studentlLoginActvity.this,toastMessageID,Toast.LENGTH_SHORT).show();
                    Intent Intent1 = new Intent(studentlLoginActvity.this, MainActivity.class);
                    startActivity(Intent1);
                }

            }
        });
    }

}
