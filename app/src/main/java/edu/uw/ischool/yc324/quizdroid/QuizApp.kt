package edu.uw.ischool.yc324.quizdroid

import android.app.Application

class QuizApp : Application() {

    companion object {
        private var INSTANCE: QuizApp? = null
        val instance: QuizApp?
            get() {
                if (INSTANCE == null) {
                    INSTANCE = QuizApp()
                }
                return INSTANCE
            }
    }
    override fun onCreate() {
        super.onCreate()
    }
}