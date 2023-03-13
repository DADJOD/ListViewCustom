package com.example.listviewcustom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
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

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (myContainer.onBackPressed()) return
        super.onBackPressed()
    }
}