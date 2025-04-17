package com.example.mvc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Contract.View {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Mvc)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        progressBar = findViewById(R.id.progressBar)

        presenter = PresenterFactory.providePresenter(this) as Presenter

        this.button.setOnClickListener {
            presenter.onButtonClick()
        }
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
        textView.visibility = View.VISIBLE
    }

    override fun hidProgress() {
        progressBar.visibility = View.GONE
        textView.visibility = View.VISIBLE
    }

    override fun setString(string: String?) {
        textView.text = string
    }


}

