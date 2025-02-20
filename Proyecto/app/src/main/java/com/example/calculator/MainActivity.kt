package com.example.calculator

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val plus = "+"
    val minus = "-"
    val division = "/"
    val multiplier = "*"
    val percent = "%"

    var operation = ""

    var firstNumber:Double = Double.NaN
    var secondNumber:Double = Double.NaN

    lateinit var txtvTemp:TextView
    lateinit var txtvResult:TextView

    lateinit var formatoDecimal:DecimalFormat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        formatoDecimal = DecimalFormat("#.##########")
        txtvTemp = findViewById(R.id.txtvStorage)
        txtvResult = findViewById(R.id.txtvResult)
    }

}