package com.example.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.helloworldapp.MESSAGE";
    public static final String EXTRA_DOGS = "com.example.helloworldapp.LIST";

    private List<Dog> dogList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTap(View view) {
        Intent intent = new Intent(this, MessageActivity.class);

        String inputText = ((TextView) findViewById(R.id.input)).getText().toString();
        intent.putExtra(EXTRA_MESSAGE, inputText);

        Dog d1 = new Dog("Franz", "Husky", 10);
        Dog d2 = new Dog("Franz", "Husky", 20);
        Dog d3 = new Dog("Franz", "Husky", 30);
        Dog d4 = new Dog("Franz", "Husky", 40);
        Dog d5 = new Dog("Franz", "Husky", 50);
        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);
        dogList.add(d4);
        dogList.add(d5);
        intent.putExtra(EXTRA_DOGS, (Serializable) dogList);

        startActivity(intent);
    }
}
