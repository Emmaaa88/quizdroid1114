package edu.uw.ischool.yc324.quizdroid

import android.content.Context

class TopicRepository : BaseRepository {
    private var select:Int=-1;
    override fun saveSelect(result: Int, content: Context) {
        select=result
    }

    override fun getSelect(): Int {
        return select
    }


    companion object {
        private var INSTANCE: TopicRepository? = null
        val instance: TopicRepository?
            get() {
                if (INSTANCE == null) {
                    INSTANCE = TopicRepository()
                }
                return INSTANCE
            }
    }
}