package com.example.proyecto007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import java.util.concurrent.ThreadLocalRandom
import android.widget.Toast
import android.view.View


class MainActivity : AppCompatActivity() {

    private var tv1: TextView? = null
    private var et1: EditText? = null
    private var num: Int = 0

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1) as EditText

        val random = Random()
        num = random.nextInt(1..100001)
        var cadena = num.toString()
        var notificacion = Toast.makeText(this, cadena, Toast.LENGTH_LONG)
        notificacion.show()

    }

    fun controlar(v: View) {
        val valorIngresado = et1?.getText().toString()
        val valor = Integer.parseInt(valorIngresado)
        if (valor == num) {
            val notificacion =
                Toast.makeText(this, "Muy bien recordaste el número mostrado.", Toast.LENGTH_LONG)
            notificacion.show()
        } else {
            val notificacion = Toast.makeText(
                this,
                "Lo siento pero no es el número que mostré.",
                Toast.LENGTH_LONG
            )
            notificacion.show()
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun Random.nextInt(intRange: IntRange): Int {
        return ThreadLocalRandom.current().nextInt(intRange)
    }
}




