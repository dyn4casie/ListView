package com.example.funfact

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class FactAdapter(context: Context,facts:List<Factmodel>) :ArrayAdapter<Factmodel>(context,0,facts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}