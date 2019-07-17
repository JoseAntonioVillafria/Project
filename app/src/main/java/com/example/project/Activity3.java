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

public class Activity3 extends Activity {

    EditText txtFname, txtLname, txtBday, txtHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        txtFname = findViewById(R.id.etFname);
        txtLname = findViewById(R.id.etLname);
        txtBday = findViewById(R.id.etBday);
        txtHobby = findViewById(R.id.etHobby);
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
        SharedPreferences sp =  getSharedPreferences("userInfo2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Fname", txtFname.getText().toString());
        editor.putString("Lname", txtLname.getText().toString());
        editor.putString("Bday", txtBday.getText().toString());
        editor.putString("Hobby", txtHobby.getText().toString());
        editor.commit();
        Toast.makeText(this, "Registration complete.", Toast.LENGTH_LONG).show();
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}
