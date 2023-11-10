package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MathStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_start)

        findViewById<Button>(R.id.bt_start).setOnClickListener {

            val intent= Intent(this,MathActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}