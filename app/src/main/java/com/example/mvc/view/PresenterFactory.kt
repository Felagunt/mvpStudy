package com.example.mvc.view

import com.example.mvc.Contract
import com.example.mvc.Model

object PresenterFactory {
    fun providePresenter(view: Contract.View): Contract.Presenter {
        val model = Model()
        return Presenter(view, model)
    }
}