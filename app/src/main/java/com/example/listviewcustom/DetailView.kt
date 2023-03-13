package com.example.listviewcustom

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView

class DetailView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {
    private lateinit var itemView: TextView

    override fun onFinishInflate() {
        super.onFinishInflate()

        itemView = findViewById(R.id.info)
    }

    fun showItem(item: String) {
        itemView.text = item
    }
}