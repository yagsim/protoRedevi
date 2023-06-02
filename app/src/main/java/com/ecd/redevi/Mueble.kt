package com.ecd.redevi

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_cesta.*
import android.graphics.Bitmap
import android.graphics.Color


import android.graphics.drawable.BitmapDrawable
import android.os.Parcelable
import kotlinx.android.synthetic.main.content_planta.*


class Mueble : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cesta)
        val intent = intent
        if (intent.extras!!.getString("muebleN") == "Mesa"){
            val bitmap = intent.getParcelableExtra<Parcelable>("foto") as Bitmap
            val d = BitmapDrawable(resources, bitmap)

            coll.title= intent.extras!!.getString("muebleN")
            coll.setExpandedTitleColor(Color.WHITE)
            coll.setCollapsedTitleTextColor((Color.WHITE))
            app_bar_image.background = d

            txtVenta.text = "Mesa"
            txtNombre.text = "Mesa comedor color marrón"
            txtTipos.text = "Madera"



        } else if (intent.extras!!.getString("muebleN") == "Callisia fragrans"){
            val bitmap = intent.getParcelableExtra<Parcelable>("foto") as Bitmap
            val d = BitmapDrawable(resources, bitmap)

            coll.title= intent.extras!!.getString("muebleN")
            coll.setExpandedTitleColor(Color.WHITE)
            coll.setCollapsedTitleTextColor((Color.WHITE))
            app_bar_image.background = d

            txtVenta.text = "Silla"
            txtNombre.text = "Silla Blanca de madera"
            txtTipos.text = "Madera-Tapiz"


        }
    }
}
