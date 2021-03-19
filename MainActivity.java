package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
            public static final String msg= "com.ashutosh.MultiScreen.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void placeOrder(View view){
        Intent intent=new Intent(this, OrederActivity.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName);
        EditText editText2=findViewById(R.id.editTextTextPersonName2);
        EditText editText3=findViewById(R.id.editTextTextPersonName3);

        String message=editText1.getText().toString()+ ","+editText2.getText().toString()+ ","+editText3.getText().toString();

        intent.putExtra(msg,message);
        startActivity(intent);
    }
}