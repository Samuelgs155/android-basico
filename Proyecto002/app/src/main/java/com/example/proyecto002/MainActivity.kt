package com.example.proyecto002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv1: TextView? = null
    private var r1: RadioButton? = null
    private var r2: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1) as EditText
        et2 = findViewById(R.id.et2) as EditText
        tv1 = findViewById(R.id.tv1) as TextView
        r1 = findViewById(R.id.rb1) as RadioButton
        r2 = findViewById(R.id.rb2) as RadioButton
    }

    //Este método se ejecutará cuando se presione el botón
    fun operar(view: View) {
        val valor1 = et1.toString()
        val valor2 = et2.toString()
        val nro1 = Integer.parseInt(valor1)
        val nro2 = Integer.parseInt(valor2)


        if (r1?.isChecked == true) {
            val suma = nro1 + nro2
            val resu = suma.toString()
            tv1?.setText(resu)
        } else if (r2?.isChecked == true) {
            val resta = nro1 - nro2
            val resu = resta.toString()
            tv1?.setText(resu)
        }
    }
}
