package com.example.belajarkotlin

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


     var nilai: Int = 1
    fun hasil (){
        nilai += 1
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textViewKu: TextView = findViewById(R.id.textku)
        val buttonKu: Button = findViewById(R.id.tombol)

        buttonKu.setOnClickListener{
            hasil()
            textViewKu.text = nilai.toString()
        }



    }
}