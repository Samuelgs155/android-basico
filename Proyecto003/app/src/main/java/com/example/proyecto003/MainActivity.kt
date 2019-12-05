package com.example.proyecto003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null
    private var et2: EditText? = null
    private var tv1: TextView? = null
    private var chk1: CheckBox? = null
    private var chk2: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1) as EditText
        et2 = findViewById(R.id.et2) as EditText
        tv1 = findViewById(R.id.tv1) as TextView
        chk1 = findViewById(R.id.chk1) as CheckBox
        chk2 = findViewById(R.id.chk2) as CheckBox
    }

    //Este método se ejecutará cuando se presione el botón
    fun operar(view: View) {
        val valor1 = et1?.getText().toString()
        val valor2 = et2?.getText().toString()
        val nro1 = Integer.parseInt(valor1)
        val nro2 = Integer.parseInt(valor2)
        var resu = ""
        if (chk1?.isChecked() === true) {
            val suma = nro1 + nro2
            resu = "La suma es: $suma"
        }
        if (chk2?.isChecked() === true) {
            val resta = nro1 - nro2
            resu = "$resu La resta es: $resta"
        }
        tv1?.setText(resu)
    }
}
