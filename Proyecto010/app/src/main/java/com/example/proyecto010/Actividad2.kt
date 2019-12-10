package com.example.proyecto010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.view.View


class Actividad2 : AppCompatActivity() {

    var web1: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        web1=findViewById(R.id.web1)
        var bundle = intent.extras
        val dato = bundle?.getString("direccion")
        web1?.loadUrl("http://${dato}")
    }

    fun finalizar(v: View) {
        finish()
    }
}
