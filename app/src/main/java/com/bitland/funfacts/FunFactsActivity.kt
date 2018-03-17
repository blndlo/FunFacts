package com.bitland.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class FunFactsActivity : AppCompatActivity() {

    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    // Declare our View variables
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        // Assign the Views from the layout file to the corresponding variables
        relativeLayout = findViewById(R.id.layout)
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        showFactButton!!.setOnClickListener {

            val fact = factBook.getFact()
            factTextView!!.text = fact

            val color = colorWheel.getColor()
            relativeLayout!!.setBackgroundColor(color)

            showFactButton!!.setTextColor(color)
        }
    }
}
