package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrederActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oreder);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.msg);
        TextView textView=findViewById(R.id.orderText);
        textView.setText(message);
    }

}