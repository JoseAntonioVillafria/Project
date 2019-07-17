package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends Activity {

    EditText txtFname, txtLname, txtBday, txtHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        txtFname = findViewById(R.id.etFname);
        txtLname = findViewById(R.id.etLname);
        txtBday = findViewById(R.id.etBday);
        txtHobby = findViewById(R.id.etHobby);
        SharedPreferences sp =  getSharedPreferences("userInfo2", Context.MODE_PRIVATE);
        txtFname.setText(sp.getString("Fname", ""));
        txtLname.setText(sp.getString("Lname", ""));
        txtBday.setText(sp.getString("Bday", ""));
        txtHobby.setText(sp.getString("Hobby", ""));
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity5.class);
        startActivity(i);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }
}
