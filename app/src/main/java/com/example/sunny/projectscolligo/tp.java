package com.example.sunny.projectscolligo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tp extends AppCompatActivity implements View.OnClickListener {
     Button bt_login,bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp);
        bt_login = (Button)findViewById(R.id.bt_login);
        bt_register = (Button)findViewById(R.id.bt_register);

        bt_login.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.bt_login){
            startActivity(new Intent(this, login.class));
        }
        if(v.getId()== R.id.bt_register){
            startActivity(new Intent(this, register.class));

        }
    }
}
