package com.example.listviewcustom

interface PaneContainer {
    fun showItem(item: String)

    fun onBackPressed() : Boolean
}