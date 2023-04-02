package com.example.simplebmicalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var weightEditText : EditText
    private lateinit var heightEditText : EditText
    private lateinit var calculateButton : Button
    private lateinit var resultTextView : TextView

    fun initComponents() {
        weightEditText = findViewById<EditText>(R.id.weight_edittext)
        heightEditText = findViewById<EditText>(R.id.height_edittext)
        calculateButton = findViewById<Button>(R.id.calculate_button)
        resultTextView = findViewById<TextView>(R.id.result_textview)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.main_activity)

        initComponents()

        val height = heightEditText.text
        val weight = weightEditText.text
        var result = 0.00

        calculateButton.setOnClickListener {
            result = weight.toString().toDouble()/(height.toString().toDouble()/100).pow(2)
            resultTextView.text = String.format("%.2f", result)
        }
    }
}