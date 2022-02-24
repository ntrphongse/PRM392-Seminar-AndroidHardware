package com.phongnt.se1502_groupseminar_androidhardware;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ListSensorsActivity extends AppCompatActivity {

    private TextView txtSensors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_sensors);

        txtSensors = (TextView) findViewById(R.id.txtSensors);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder data = new StringBuilder();
        for (Sensor s :
                sensorList) {
            data.append("+ Name: " + s.getName() + "\n");
            data.append("\t- Vendor: " + s.getVendor() + "\n");
            data.append("\t- Version: " + s.getVersion() + "\n");
        }

        txtSensors.setText(data);
    }
}