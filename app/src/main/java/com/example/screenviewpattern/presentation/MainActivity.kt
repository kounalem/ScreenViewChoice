package com.example.screenviewpattern.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.screenviewpattern.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.p_container, MainFragment())
            .commitNow()
    }

}
