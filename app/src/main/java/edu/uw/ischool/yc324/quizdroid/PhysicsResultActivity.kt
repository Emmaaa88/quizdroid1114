package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PhysicsResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics_result)

        var correct=0;

        val selectOne = intent.getIntExtra("selectOne",-1);
        val select=TopicRepository.instance!!.getSelect()

        if (select==3){
            correct=correct+1
        }

        findViewById<TextView>(R.id.tv_result).setText("You have $correct out of 1 correct")
        findViewById<Button>(R.id.bt_finish).setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}