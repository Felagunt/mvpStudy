package com.example.mvc

object PresenterFactory {
    fun providePresenter(view: Contract.View): Contract.Presenter {
        val model = Model()
        return Presenter(view, model)
    }
}