package com.example.belajarkotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {


    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


     //   val editText : EditText = findViewById(R.id.editTeks)
        val btnClick : Button = findViewById(R.id.tombol)
    val btnClickAplikasi : Button = findViewById(R.id.tombol2)

        btnClick.setOnClickListener{
            //explicit intent
        val pakeIntentExplicit = Intent(this,SecondActivity::class.java)
            pakeIntentExplicit.putExtra("text","")
            startActivity(pakeIntentExplicit)


//            val teks: String = editText.text.toString()
//           Toast.makeText(applicationContext, teks, Toast.LENGTH_LONG).show()
//      Snackbar.make(mainLayout, teks, Snackbar.LENGTH_LONG).show()
//        val builder = AlertDialog.Builder(this)
//            builder.setTitle("My Aplikasi")
//            builder.setMessage(teks)
//            builder.setPositiveButton("Tutup"){
//                dialog, which ->
//                dialog.dismiss()
//            }
//            val dialog = builder.create()
//            dialog.show()
        }

        btnClickAplikasi.setOnClickListener{
            //implicint intent
//            val kirimAplikasi = Intent(Intent.ACTION_VIEW).apply { Uri.parse("https://www.instagram.com") }
//
//            if (kirimAplikasi.resolveActivity(packageManager) != null) {
//                startActivity(kirimAplikasi) // Jika ada, buka URL
//            }else{
//                Toast.makeText(applicationContext,"Data Tidak ada yang Dikirim", Toast.LENGTH_SHORT).show()
//            }




            val kirimData = Intent().apply {
                action= Intent.ACTION_SEND
                type= "text/plain"
            }


            kirimData.putExtra(Intent.EXTRA_TEXT, "WOI DECEH")
            if (kirimData.resolveActivity(packageManager) != null) {
                startActivity(kirimData) // Jika ada, buka URL
            }else{
                Toast.makeText(applicationContext,"Data Tidak ada yang Dikirim", Toast.LENGTH_SHORT).show()
            }
        }




    }
}