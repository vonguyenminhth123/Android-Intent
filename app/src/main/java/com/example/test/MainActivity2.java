package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1 = (TextView) findViewById(R.id.tv1);

        Intent i = getIntent();
        /*String value1 = i.getStringExtra("key1");
        int value2 = i.getIntExtra("key2", 0);*/
        Bundle bundle = i.getExtras();
        /*String value1 = b.getString("key1");
        int value2 = b.getInt("key2", 0);*/

        int a = bundle.getInt("numbera");
        int b = bundle.getInt("numberb");
        int sum = a + b;

        tv1.setText("Sum of number a and b is: " + sum);
    }
}