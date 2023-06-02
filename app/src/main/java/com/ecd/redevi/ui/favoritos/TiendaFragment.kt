package com.ecd.redevi.ui.favoritos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager

import com.ecd.redevi.R
import com.google.android.material.tabs.TabLayout


class TiendaFragment : Fragment() {

    private lateinit var tiendaViewModel: TiendaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tiendaViewModel = ViewModelProviders.of(this).get(TiendaViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tiendaViewModel =
            ViewModelProviders.of(this).get(tiendaViewModel::class.java)
        val root = inflater.inflate(R.layout.viewpage_tienda, container, false)

        val vp = root.findViewById<ViewPager>(R.id.view_pager)
        val tabs = root.findViewById<TabLayout>(R.id.tabs)
        val fragmentAdapter = SectionsPagerAdapter(childFragmentManager)
        vp.adapter = fragmentAdapter

        tabs.setupWithViewPager(vp)


      //  val tab = tabs.getTabAt(1)
      //  tab?.select()

       // val textView: TextView = root.findViewById(R.id.text_notifications)
       // favoritosViewModel.text.observe(this, Observer {
       //     textView.text = it
      //  })
        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): TiendaFragment{
            return TiendaFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}