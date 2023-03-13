package com.example.listviewcustom

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class DualPaneContainer(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) , PaneContainer {
    private lateinit var detailView: DetailView

    override fun onFinishInflate() {
        super.onFinishInflate()

        detailView = findViewById<DetailView>(R.id.detail)
        detailView.showItem("wow!")
    }

    override fun showItem(item: String) {
        detailView.showItem(item)
    }

    override fun onBackPressed(): Boolean {
        return false
    }


}