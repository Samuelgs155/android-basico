package com.example.proyecto001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1) as EditText
        et2 = findViewById(R.id.et2) as EditText
        tv1 = findViewById(R.id.tv1) as TextView
    }

    fun sumar(view: View) {
        val valor1 = et1.toString()
        val valor2 = et2.toString()
        val nro1 = Integer.parseInt(valor1)
        val nro2 = Integer.parseInt(valor2)
        val suma = nro1 + nro2
        val resu = suma.toString()
        tv1?.setText(resu)
    }
}
