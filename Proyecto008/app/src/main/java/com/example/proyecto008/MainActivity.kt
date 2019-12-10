package com.example.proyecto008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null
    private var et2: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
    }

    fun verificar(v: View) {
        val clave = et2?.getText().toString()
        if (clave.length == 0) {
            val notificacion =
                Toast.makeText(this, "La clave no puede quedar vacía", Toast.LENGTH_LONG)
            notificacion.show()
        }
    }
}
