package com.example.syncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowToastmsg(View view) {
        Toast.makeText(this, R.string.message,Toast.LENGTH_SHORT).show();

    }

    public void HelloWorld(View v)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
    }

}