package com.phongnt.se1502_groupseminar_androidhardware;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToSensor(View view) {
        Intent intent = new Intent(this, MySensorsActivity.class);
        startActivity(intent);
    }
}