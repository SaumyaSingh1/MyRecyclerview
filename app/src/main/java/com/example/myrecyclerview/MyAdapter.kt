package com.example.myrecyclerview

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.myrow.view.*

class  MyAdapter( val achievelist: ArrayList<MyArray> ,val context: Context) : RecyclerView.Adapter<MyAdapter.MyHolder>()
{

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {
        val  inflatedview=LayoutInflater.from(context).inflate(R.layout.myrow,p0,false)
        return MyHolder(inflatedview)
    }

    override fun getItemCount(): Int {
       return achievelist.size
    }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {
        val current=achievelist[p1]
        with(p0.itemView){
            name.text=current.name
            desp.text=current.description
            year.text=current.year
        }

    }

    class MyHolder( itemView: View) :RecyclerView.ViewHolder(itemView){
    }

}