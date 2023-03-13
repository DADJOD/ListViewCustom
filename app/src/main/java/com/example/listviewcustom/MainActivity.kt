package com.example.listviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val detailView = findViewById<DetailView>(R.id.detail)
        detailView.showItem("wow!")
    }
}