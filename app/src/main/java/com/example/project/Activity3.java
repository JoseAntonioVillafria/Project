package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void goNext(View v){
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
    }

    public void goPrevious(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}
