package com.example.listviewcustom

import android.content.Context
import android.widget.ArrayAdapter

class ItemListAdapter(context: Context) :
    ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, values) {
    companion object {
        val values = arrayOf(
            "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile"
        )
    }
}

//class ItemListAdapter(context: Context?) :
//    ArrayAdapter<String?>(context!!, R.layout.simple_list_item_1, values) {
//    companion object {
//        val values = arrayOf(
//            "Android", "iPhone", "WindowsMobile",
//            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
//            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
//            "Android", "iPhone", "WindowsMobile"
//        )
//    }
//}

