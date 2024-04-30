package com.example.fooddeleveryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash1)

        Handler().postDelayed(
            {val intent= Intent(this,Splash2::class.java)
                startActivity(intent)
                finish()},3000

        )

    }

}