package com.example.listviewcustom

import android.content.Context
import android.util.AttributeSet
import android.widget.ListView

class ItemListView : ListView {
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    override fun onFinishInflate() {
        super.onFinishInflate()

        var myAdapter = ItemListAdapter(context)
        adapter = myAdapter
    }
}