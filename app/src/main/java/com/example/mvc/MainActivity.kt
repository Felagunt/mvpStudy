package com.example.mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvc.view.list.Recycler

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Mvc)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(savedInstanceState == null) {
            val fragment = Recycler()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }

}