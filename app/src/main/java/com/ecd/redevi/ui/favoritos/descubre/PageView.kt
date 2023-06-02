package com.ecd.redevi.ui.favoritos.descubre

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import com.ecd.redevi.R

class PageView : PagerAdapter {
    var con: Context
    var path: IntArray
    lateinit var inflator: LayoutInflater

    constructor(con: Context, path: IntArray): super(){
        this.con = con
        this.path = path
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as RelativeLayout
    }

    override fun getCount(): Int {
        return path.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var img: ImageView
        inflator = con.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var rv: View = inflator.inflate(R.layout.swipe_fragment, container, false)
        img = rv.findViewById(R.id.img) as ImageView
        img.setImageResource(path[(0..8).shuffled().first()])
        container!!.addView(rv)
        return rv
        }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container!!.removeView(`object` as RelativeLayout)
    }
    }
