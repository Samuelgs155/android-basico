package com.example.proyecto005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.view.View
import android.widget.AdapterView






class MainActivity : AppCompatActivity() {

    private val paises = arrayOf(
        "Argentina",
        "Chile",
        "Paraguay",
        "Bolivia",
        "Peru",
        "Ecuador",
        "Brasil",
        "Colombia",
        "Venezuela",
        "Uruguay"
    )
    private val habitantes = arrayOf(
        "40000000",
        "17000000",
        "6500000",
        "10000000",
        "30000000",
        "14000000",
        "183000000",
        "44000000",
        "29000000",
        "3500000"
    )
    private var tv1: TextView? = null
    private var lv1: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1) as TextView
        lv1 = findViewById(R.id.list1)

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)
        lv1?.setAdapter(adapter)
        lv1?.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                tv1?.setText("Población de " + lv1?.getItemAtPosition(i) + " es " + habitantes[i])
            }
        })
    }
}
