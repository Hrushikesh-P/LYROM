package com.hrushikesh.lyrom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    String prevStarted = "prevStarted";
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
//        if (!sharedpreferences.getBoolean(prevStarted, false)) {
//            SharedPreferences.Editor editor = sharedpreferences.edit();
//            editor.putBoolean(prevStarted, Boolean.TRUE);
//            editor.apply();
//        }
//        else
//            moveToSecondary();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home_screen(View view) {
        Intent home = new Intent(this, home_screen.class);
        startActivity(home);
    }

//    public void moveToSecondary(){
//        // use an intent to travel from one activity to another.
//        Intent intent = new Intent(this,home_screen.class);
//        startActivity(intent);
//    }
}