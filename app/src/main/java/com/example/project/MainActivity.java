package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmail = findViewById(R.id.etEmail);
        txtPassword = findViewById(R.id.etPassword);
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void saveInfo(View v){
        SharedPreferences sp =  getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user", txtEmail.getText().toString());
        editor.putString("pwd", txtPassword.getText().toString());
        editor.commit();
        Toast.makeText(this, "Registration complete.", Toast.LENGTH_LONG).show();
    }

}
