package com.example.listviewcustom

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout

class SinglePaneContainer(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs), PaneContainer {
    private lateinit var listView: View

    override fun onFinishInflate() {
        super.onFinishInflate()

        listView = getChildAt(0)
    }

    override fun showItem(item: String) {
        if (isListAttached()) {
            removeViewAt(0)
            View.inflate(context, R.layout.detail, this)
        }
        val detailView = getChildAt(0) as DetailView
        detailView.showItem(item)

    }

    override fun onBackPressed(): Boolean {
        if (isListAttached()) return false

        removeViewAt(0)
        addView(listView)
        return true
    }

    private fun isListAttached(): Boolean {
        return listView.parent != null
    }
}