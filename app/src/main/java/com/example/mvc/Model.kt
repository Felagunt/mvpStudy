package com.example.mvc

import android.os.Handler
import android.os.Looper

class Model : Contract.Model {

    private val courses = listOf(
        Item(
            R.drawable.ic_launcher_foreground,
            "DSA Self Paced: Master the basics of Data Structures and Algorithms to solve complex problems efficiently. "
        ),
        Item(
            R.drawable.ic_launcher_foreground,
            "Placement 100: This course will guide you for placement with theory,lecture videos, weekly assignments "
        ),
        Item(R.drawable.ic_launcher_foreground, "contests and doubt assistance. "),
        Item(
            R.drawable.ic_launcher_foreground,
            "Amazon SDE Test Series: Test your skill & give the final touch to your preparation before applying for "
        ),
        Item(
            R.drawable.ic_launcher_foreground,
            "product based against like Amazon, Microsoft, etc. "
        ),
        Item(
            R.drawable.ic_launcher_foreground,
            "Complete Interview Preparation: Cover all the important concepts and topics required for the interviews."
        ),
        Item(R.drawable.ic_launcher_foreground, "Get placement ready before the interviews begin"),
        Item(
            R.drawable.ic_launcher_foreground,
            "Low Level Design for SDE 1 Interview: Learn Object-oriented Analysis and Design to prepare for "
        ),
        Item(R.drawable.ic_launcher_foreground, "SDE 1 Interviews in top companies")
    )

    override fun getNextCourse(onFinishedListener: Contract.Model.OnFinishedListener?) {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                onFinishedListener!!.onFinished(courses)
            },
            1000
        )
    }
}