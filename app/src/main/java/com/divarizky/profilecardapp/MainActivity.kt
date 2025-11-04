package com.divarizky.profilecardapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var isFollowing = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnFollow = findViewById<Button>(R.id.btnFollow)
        val btnMessage = findViewById<Button>(R.id.btnMessage)
        val textName = findViewById<TextView>(R.id.fullName)

        // merubah kondisi tombol "Follow" ketika di tekan
        btnFollow.setOnClickListener {
            isFollowing = !isFollowing
            btnFollow.text = if (isFollowing) "Following" else "Follow"
        }

        // menampilkan pesan pop-up terkirim ketika tombol "Message" di tekan
        btnMessage.setOnClickListener {
            Toast.makeText(this, "Pesan terkirim ke ${textName.text}", Toast.LENGTH_SHORT).show()
        }
    }
}