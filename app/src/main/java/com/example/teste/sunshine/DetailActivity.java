package com.example.teste.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DetailActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String forecast = intent.getStringExtra("forecast");

        TextView textView = new TextView(this);
        textView.setText(forecast);

        setContentView(textView);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
