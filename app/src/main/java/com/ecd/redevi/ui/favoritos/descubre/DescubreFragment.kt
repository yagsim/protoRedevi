package com.ecd.redevi.ui.favoritos.descubre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.ecd.redevi.R


class DescubreFragment : Fragment(){

    lateinit var mPager: ViewPager
    var path: IntArray = intArrayOf(R.drawable.muebles3,R.drawable.mueble4,R.drawable.muebles_convertibles,R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.muebletv,R.drawable.sancal_mosaico_sofa_yonoh,R.drawable.mueble4,R.drawable.sofa)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_descubre, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mPager = view.findViewById(R.id.view1) as ViewPager
        var adapter: PagerAdapter = PageView(context!!,path)
        mPager.adapter = adapter
        mPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int){

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int){

            }
            override fun onPageSelected(position: Int) {

            }

        })
    }






    }


