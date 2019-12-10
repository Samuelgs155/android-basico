package com.example.proyecto011

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE)
        et1.setText(preferencias.getString("mail", ""))
        btn1.setOnClickListener {
            val editor = preferencias.edit()
            editor.putString("mail", et1.text.toString())
            editor.commit()
            finish()
        }
    }
}
