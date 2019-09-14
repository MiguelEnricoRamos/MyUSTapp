package com.ramos.myustapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("MyUSTapp", "onCreate() has executed.......");
    }

    protected void onStart() {
        super.onStart();
        Log.d("MyUSTappT", "onStart() has executed........");
    }

    protected void onResume() {
        super.onResume();
        Log.d("MyUSTapp", "onResume() has executed........");
    }

    protected void onPause() {
        super.onPause();
        Log.d("MyUSTapp", "onPause() has executed........");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("MyUSTapp", "onDestroy() has executed........");
    }

    protected void onStop() {
        super.onStop();
        Log.d("MyUSTapp", "onStop() has executed........");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("MyUSTapp", "onRestart() has executed........");
    }

    public void displayWeb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(intent);

    }

    public void displayMyuste(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://myuste.ust.edu.ph"));
        startActivity(intent);

    }

    public void displayBB(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://ust.blackboard.com"));
        startActivity(intent);

    }
}