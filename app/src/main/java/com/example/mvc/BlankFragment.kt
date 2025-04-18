//package com.example.mvc
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.ProgressBar
//import android.widget.TextView
//import com.example.mvc.view.Presenter
//import com.example.mvc.view.PresenterFactory
//
//class BlankFragment : Fragment(), Contract.View {
//    private lateinit var textView: TextView
//    private lateinit var button: Button
//    private lateinit var progressBar: ProgressBar
//    private lateinit var presenter: Presenter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_blank, container, false)
//        textView = view.findViewById(R.id.textView)
//        button = view.findViewById(R.id.button)
//        progressBar = view.findViewById(R.id.progressBar)
//
//        presenter = PresenterFactory.providePresenter(this) as Presenter
//        button.setOnClickListener {
//            presenter.onButtonClick()
//        }
//
//        return view
//    }
//
//    override fun showProgress() {
//        progressBar.visibility = View.VISIBLE
//        textView.visibility = View.VISIBLE
//    }
//
//    override fun hidProgress() {
//        progressBar.visibility = View.GONE
//        textView.visibility = View.VISIBLE
//    }
//
//    override fun setString(string: String?) {
//        textView.text = string
//    }
//
//
//}