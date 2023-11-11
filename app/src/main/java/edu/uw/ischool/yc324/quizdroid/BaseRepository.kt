package edu.uw.ischool.yc324.quizdroid

import android.content.Context

interface BaseRepository {
    fun saveSelect(result: Int,content: Context)
    fun getSelect():Int
}