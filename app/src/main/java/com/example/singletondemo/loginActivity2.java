package com.example.singletondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class loginActivity2 extends AppCompatActivity {
    TextView txtf , textl ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        txtf = findViewById(R.id.first);
        textl = findViewById(R.id.last);

        txtf.setText("Welcome\n" +SingletonSession.Instance().getUsername());
        textl.setText("\n" +SingletonSession.Instance().getLastname());
    }
}