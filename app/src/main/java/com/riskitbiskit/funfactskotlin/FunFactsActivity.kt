package com.riskitbiskit.funfactskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity : AppCompatActivity() {

    //variables
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    //views
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        //assign view from the layout file to the corresponding varibales
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)

        //button update the fact TextView with a new fact
        showFactButton!!.setOnClickListener {

            //get random fact
            val fact = factBook.getFact()
            val color = colorWheel.getColor()

            //update the screen with new fact
            factTextView!!.text = fact
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }

    }
}
