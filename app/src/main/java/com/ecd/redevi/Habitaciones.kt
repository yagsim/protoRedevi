package com.ecd.redevi

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_muebles_identificados.*
import kotlinx.android.synthetic.main.content_muebles.*

class Habitaciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muebles_identificados)
        val intent = intent
        if (intent.extras!!.getString("mueble") == "Mesa"){
            val bitmap = intent.getParcelableExtra<Parcelable>("foto") as Bitmap
            val d = BitmapDrawable(resources, bitmap)

            collf.title= "Mesa"
            collf.setExpandedTitleColor(Color.WHITE)
            collf.setCollapsedTitleTextColor((Color.WHITE))
            app_bar_image.background = d

            txtVenta.text = "Mesa Leroy Merlín madera"
            txtNombre.text = "Mesa comedor color marrón"
            txtTipo.text = "97"
            txtMteriales.text = "Contornos cambiantes de madera"
            txtLugarFabricacion.text = "Madrid"


        } else if (intent.extras!!.getString("enfermedad") == "silla"){
            val bitmap = intent.getParcelableExtra<Parcelable>("foto") as Bitmap
            val d = BitmapDrawable(resources, bitmap)

            collf.title= "Silla"
            collf.setExpandedTitleColor(Color.WHITE)
            collf.setCollapsedTitleTextColor((Color.WHITE))
            app_bar_image.background = d

            txtVenta.text = "Mesa Leroy Merlín madera"
            txtNombre.text = "Silla cocina color blanco madera"
            txtTipo.text = "30"
            txtMteriales.text = "Madera-Tapiz"
            txtLugarFabricacion.text = "Barcelona"
        }
    }
}
