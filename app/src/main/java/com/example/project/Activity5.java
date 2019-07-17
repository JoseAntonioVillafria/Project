package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity5 extends Activity {

    TextView txtFname, txtLname, txtBday, txtHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        txtFname = findViewById(R.id.tvFname);
        txtLname = findViewById(R.id.tvLname);
        txtBday = findViewById(R.id.tvBday);
        txtHobby = findViewById(R.id.tvHobby);
        SharedPreferences sp =  getSharedPreferences("userInfo2", Context.MODE_PRIVATE);
        txtFname.setText(sp.getString("Fname", ""));
        txtLname.setText(sp.getString("Lname", ""));
        txtBday.setText(sp.getString("Bday", ""));
        txtHobby.setText(sp.getString("Hobby", ""));
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }
}
