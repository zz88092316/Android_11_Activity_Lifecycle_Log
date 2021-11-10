package com.skypan.android_11_activity_lifecycle_log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("tag", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("tag", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("tag", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "onStop");
    }

    public void Switch(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}