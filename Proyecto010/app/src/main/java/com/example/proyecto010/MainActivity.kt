package com.example.proyecto010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    private var et1: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.et1)
    }

    fun ver(v: View) {
        val i = Intent(this, Actividad2::class.java)
        i.putExtra("direccion", et1?.getText().toString())
        startActivity(i)
    }
}
