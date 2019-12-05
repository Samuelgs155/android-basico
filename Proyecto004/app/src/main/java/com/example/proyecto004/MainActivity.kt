package com.example.proyecto004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.ArrayAdapter
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv1: TextView? = null
    private var spinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1) as EditText
        et2 = findViewById(R.id.et2) as EditText
        tv1 = findViewById(R.id.tv1) as TextView
        spinner = findViewById(R.id.spinner) as Spinner

        val opciones = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        spinner?.setAdapter(adapter)

    }

    fun operar(view: View) {
        val valor1 = et1?.getText().toString()
        val valor2 = et2?.getText().toString()
        val nro1 = Integer.parseInt(valor1)
        val nro2 = Integer.parseInt(valor2)
        val selec = spinner?.getSelectedItem().toString()
        if (selec == "sumar") {
            val suma = nro1 + nro2
            val resu = suma.toString()
            tv1?.setText(resu)
        } else if (selec == "restar") {
            val resta = nro1 - nro2
            val resu = resta.toString()
            tv1?.setText(resu)
        } else if (selec == "multiplicar") {
            val multi = nro1 * nro2
            val resu = multi.toString()
            tv1?.setText(resu)
        } else if (selec == "dividir") {
            val divi = nro1 / nro2
            val resu = divi.toString()
            tv1?.setText(resu)
        }
    }
}
