package com.example.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        List<Dog> dogList = (List) intent.getSerializableExtra(MainActivity.EXTRA_DOGS);

        TextView textView = (TextView) findViewById(R.id.output);
        textView.setText(dogList.get(0).toString());
    }
}
