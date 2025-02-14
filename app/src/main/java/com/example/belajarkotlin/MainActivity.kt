package com.example.belajarkotlin

import android.content.Intent
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


        btnClick.setOnClickListener{
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




    }
}