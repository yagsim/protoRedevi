package com.ecd.redevi.ui.favoritos

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ecd.redevi.ui.favoritos.descubre.DescubreFragment
import com.ecd.redevi.ui.favoritos.tusplantas.TusMueblesFragment


class SectionsPagerAdapter(fm: FragmentManager?) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {

        return when(position){
            0 -> {TusMueblesFragment()}
            else -> {
                return DescubreFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0-> "Tus diseños"
            else-> {
                return "Descubre otros"
            }
        }
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}