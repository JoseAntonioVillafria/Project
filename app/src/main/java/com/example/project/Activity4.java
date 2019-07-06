package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
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
