package com.example.mvc.view.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvc.Contract
import com.example.mvc.Item
import com.example.mvc.R
import com.example.mvc.view.PresenterFactory

class Recycler : Fragment(), Contract.View {

    private lateinit var presenter: Contract.Presenter
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter = PresenterFactory.providePresenter(this)

        recyclerView = view.findViewById(R.id.recyclerview)
        adapter = Adapter(emptyList())
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        presenter.onButtonClick()
    }

    override fun showProgress() {
//        progressBar.visibility = View.VISIBLE
//        textView.visibility = View.VISIBLE
    }

    override fun hidProgress() {
//        progressBar.visibility = View.GONE
//        textView.visibility = View.VISIBLE
    }

    override fun displayCourses(courses: List<Item>) {
        adapter = Adapter(courses)
        recyclerView.adapter = adapter
    }

}