package com.liashan.hydrationhavenapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var waterIntake = 0
    private lateinit var intakeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var intakeTextVew = finViewById(R.id.intake_text_view)
        val logButton: Button = findViewById(R.id.button)

        logButton.setOnClickListener{
            waterIntake += 250 //asuming each log is 250ml of water
            updateIntakeTextView()

        }
        updateIntakeTextView()

    }

    private fun finViewById(intakeTextView: Any): Any {

    }

    private fun updateIntakeTextView(){
        intakeTextView.text = "Total water intake: $waterIntake ml"
    }
}