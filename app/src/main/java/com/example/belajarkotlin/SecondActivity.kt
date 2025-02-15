package com.example.belajarkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.belajarkotlin.fragment.FirstFragment

class SecondActivity : AppCompatActivity() {

    private var dataString : String = "ini teks untuk data nya"
    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val ambilTeks: TextView = findViewById(R.id.teks)
//        if(intent.hasExtra("text")){
//            ambilTeks.text = intent.getStringExtra("text")
//        } else {
//            Toast.makeText( applicationContext,"Data tidak ada", Toast.LENGTH_SHORT).show()
//        }
//

        val transaction = supportFragmentManager.beginTransaction()
        val firstFragment = FirstFragment.sendData(dataString)

        transaction.replace(R.id.testFragment, firstFragment)
        transaction.commit()
    }
}