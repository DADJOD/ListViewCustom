package com.example.listviewcustom

import android.content.Context
import android.util.AttributeSet
import android.widget.AdapterView.OnItemClickListener
import android.widget.ListView


class ItemListView(context: Context?, attrs: AttributeSet?) : ListView(context, attrs) {
    override fun onFinishInflate() {
        super.onFinishInflate()
        val myAdapter = ItemListAdapter(context)
        adapter = myAdapter
        onItemClickListener =
            OnItemClickListener { parent, view, position, id ->
                val item = adapter.getItem(position)
                val activity = context as MainActivity
                val container = activity.getContainer()
                container.showItem(item as String)
            }
    }
}

//class ItemListView(context: Context?, attrs: AttributeSet?) :
//    ListView(context, attrs) {
//    override fun onFinishInflate() {
//        super.onFinishInflate()
//        val adapter = ItemListAdapter(context)
//        setAdapter(adapter)
//        onItemClickListener =
//            OnItemClickListener { parent, view, position, id ->
//                val item = adapter.getItem(position)
//                val activity = context as MainActivity
//                val container = activity.getContainer()
//                container.showItem(item!!)
//            }
//    }
//}