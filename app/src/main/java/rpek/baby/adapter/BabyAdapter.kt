package rpek.baby.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.item_baby.view.*
import rpek.baby.PersonDetailActivity
import rpek.baby.R
import rpek.baby.model.Baby

/**
 * Created by r.pek on 07.10.2017.
 */
class BabyAdapter:BaseAdapter{
    var listOfbaby:ArrayList<Baby>
    var mContext:Context?=null

    constructor(listOfBabys:ArrayList<Baby>, mContext: Context):super(){
        this.listOfbaby=listOfBabys
        this.mContext=mContext

    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
      val baby= this.listOfbaby!![p0]
        var view = LayoutInflater.from(mContext).inflate(R.layout.item_baby, p2, false)
        view.tvName.text=baby.name!!
        view.tvDesc.text=baby.desc!!
        view.ivPerson.setImageResource(baby.image!!)

      //  view.ivPerson.setOnClickListener() { v -> Toast.makeText(mContext, "Item "+p0, Toast.LENGTH_SHORT).show() }

        view.setOnClickListener{
            val intent = Intent(mContext, PersonDetailActivity::class.java)
            intent.putExtra("name", baby.name)
            intent.putExtra("desc", baby.desc)
            intent.putExtra("image", baby.image!!)
            mContext!!.startActivity(intent!!)
            Toast.makeText(mContext, "Item "+p0, Toast.LENGTH_SHORT).show()
            Log.e("rtk", "hello")
        }
        return view
    }

    override fun getItem(p0: Int): Any {
       return this.listOfbaby[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return this.listOfbaby.size
    }

}