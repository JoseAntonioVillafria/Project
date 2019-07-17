package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends Activity {

    EditText txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtEmail = findViewById(R.id.etEmail);
        txtPassword = findViewById(R.id.etPassword);
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void displayUser(View v) {
        SharedPreferences sp =  getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtEmail.setText(sp.getString("user", ""));
        txtPassword.setText(sp.getString("pwd", ""));
    }
}
