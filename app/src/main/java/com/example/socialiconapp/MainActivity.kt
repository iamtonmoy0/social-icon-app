package com.example.socialiconapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.socialiconapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tonmoy : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        tonmoy = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tonmoy.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tonmoy.fbBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, FbLoginPage::class.java))
        }
    }
}