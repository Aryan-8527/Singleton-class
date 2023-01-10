package com.example.singletondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edtfname , edtpass , edtlname;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.btn_login);
        edtfname = findViewById(R.id.edt_fname);
        edtpass = findViewById(R.id.edt_pass);
        edtlname = findViewById(R.id.edt_lname);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtfname.getText().toString().isEmpty()){
                    edtfname.setError("Please Enter Your Name");
                }
                else if (edtlname.getText().toString().isEmpty()){
                    edtlname.setError("Please Enter Last Name");
                }
                else if (edtpass.getText().toString().isEmpty()) {
                    edtpass.setError("Please fill Password After Click Login");
                }
                else{
                    SingletonSession.Instance().setUsername(edtfname.getText().toString());
                    SingletonSession.Instance().setLastname(edtlname.getText().toString());
                    Intent i = new Intent(MainActivity.this , loginActivity2.class);
                    Toast.makeText(MainActivity.this, "Welcome " +SingletonSession.Instance().getUsername() + " " + SingletonSession.Instance().getLastname(), Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            }
        });
    }
}