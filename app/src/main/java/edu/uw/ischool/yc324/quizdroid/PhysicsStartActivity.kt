package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhysicsStartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics_start)

        findViewById<Button>(R.id.bt_start).setOnClickListener {

            val intent= Intent(this,PhysicsActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}