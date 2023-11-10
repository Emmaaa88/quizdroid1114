package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bt_math).setOnClickListener {

            val intent=Intent(this,MathStartActivity::class.java)
            startActivity(intent)

        }
        findViewById<Button>(R.id.bt_Physics).setOnClickListener {
            val intent=Intent(this,PhysicsStartActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.bt_Marvel_Super_Heroes).setOnClickListener {
            val intent=Intent(this,MarvelSuperHeroesStartActivity::class.java)
            startActivity(intent)

        }

    }
}