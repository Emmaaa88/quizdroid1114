package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MathResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_result)
        var correct=0;

        val selectOne = intent.getIntExtra("selectOne",-1);
        val selectTwo = intent.getIntExtra("selectTwo",-1);
        val selectThree = intent.getIntExtra("selectThree",-1);
        val selectFour = intent.getIntExtra("selectFour",-1);
        if (selectOne==2){
            correct=correct+1
        }

        if (selectTwo==2){
            correct=correct+1
        }
        if (selectThree==4){
            correct=correct+1
        }
        if (selectFour==3){
            correct=correct+1
        }
        findViewById<TextView>(R.id.tv_result).setText("You have $correct out of 4 correct")
        findViewById<Button>(R.id.bt_finish).setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}