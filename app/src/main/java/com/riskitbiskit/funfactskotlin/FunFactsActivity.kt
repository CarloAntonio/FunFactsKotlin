package com.riskitbiskit.funfactskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class FunFactsActivity : AppCompatActivity() {

    //variables
    private val factBook = FactBook()

    //views
    private var factTextView: TextView? = null
    private var showFactButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)

        //assign view from the layout file to the corresponding varibales
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)

        //button update the fact TextView with a new fact
        showFactButton!!.setOnClickListener {

            //get random fact
            val fact = factBook.getFact()

            //update the screen with new fact
            factTextView!!.text = fact
        }

    }
}
