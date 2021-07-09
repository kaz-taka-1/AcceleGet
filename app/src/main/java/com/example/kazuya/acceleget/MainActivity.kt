package com.example.kazuya.acceleget

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.hardware.SensorManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,SensorEventListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        if(event == null)return
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER){
            txt01.text = "X軸:${event.value[0]}/nY軸:${event.values[1]}/nZ軸:${event.values[2]}"
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        TODO("Not yet implemented")
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("Not yet implemented")
    }
}