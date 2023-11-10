package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MarvelSuperHeroesResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel_super_heroes_result)
        var correct=0;

        val selectOne = intent.getIntExtra("selectOne",-1);

        if (selectOne==2){
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