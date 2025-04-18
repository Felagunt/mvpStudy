package com.example.mvc

interface Contract {
    interface View {

        fun showProgress()

        fun hidProgress()

        fun displayCourses(course: List<Item>)
    }

    interface Model {
        interface OnFinishedListener {
            fun onFinished(course: List<Item>)
        }
        fun getNextCourse(onFinishedListener: OnFinishedListener?)
    }
    interface Presenter {

        fun onButtonClick()

        fun onDestroy()
    }

}