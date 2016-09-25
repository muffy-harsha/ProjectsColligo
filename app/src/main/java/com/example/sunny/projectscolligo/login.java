package com.example.sunny.projectscolligo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener {
    Button login_bt;
    EditText login_u,login_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_u = (EditText)findViewById(R.id.login_u);
        login_p = (EditText)findViewById(R.id.login_p);
        login_bt = (Button) findViewById(R.id.login_bt);

        login_bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_bt){


        }

    }
}
