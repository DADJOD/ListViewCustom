package com.example.listviewcustom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var myContainer: PaneContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myContainer = findViewById(R.id.dualPaneContainer)
    }

    fun getContainer() : PaneContainer {
        return myContainer
    }
}