package com.example.android.spidert0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 0;

    public void increase(View v) {
        counter = counter + 1;
        TextView CounterView = (TextView) findViewById(R.id.counterTextView);
        CounterView.setText("" + counter);
    }

}
