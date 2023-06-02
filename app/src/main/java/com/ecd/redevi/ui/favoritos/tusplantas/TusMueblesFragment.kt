package com.ecd.redevi.ui.favoritos.tusplantas



import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.drawToBitmap
import androidx.fragment.app.Fragment
import com.ecd.redevi.Mueble
import com.ecd.redevi.R


class TusMueblesFragment : Fragment() {
    private lateinit var mBitmap: Bitmap
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_tusmuebles, container, false)

        val fav1 = root.findViewById<ImageView>(R.id.fav1)
        val fav2 = root.findViewById<ImageView>(R.id.fav2)
        val fav3 = root.findViewById<ImageView>(R.id.fav3)
        fav1.setImageResource(R.drawable.mesa)
        fav2.setImageResource(R.drawable.silla)
        fav3.setImageResource(R.drawable.sofa)

        fav1.setOnClickListener{
            val myIntent = Intent(this.activity, Mueble::class.java)
            var plantaN = "Mesa madera"
            var foto = fav1.drawable
            mBitmap = fav1.drawToBitmap()
            myIntent.putExtra("mueble", plantaN)
            myIntent.putExtra("foto", mBitmap)

            this.activity!!.startActivity(myIntent)
        }

        fav2.setOnClickListener{
            val myIntent = Intent(this.activity, Mueble::class.java)
            var plantaN = "Silla madera"
            mBitmap = fav2.drawToBitmap()
            myIntent.putExtra("muebleN", plantaN)
            myIntent.putExtra("foto", mBitmap)

            this.activity!!.startActivity(myIntent)
        }
        return root
    }

}