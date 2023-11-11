package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private  var selectOne=-1;
    private  var topicRepository: TopicRepository? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        topicRepository= TopicRepository.instance
        findViewById<RadioGroup>(R.id.rg_1).setOnCheckedChangeListener { p0, p1 ->
            if (p1 == R.id.rb_1a) {
                selectOne = 1;
            }
            if (p1 == R.id.rb_1b) {

                selectOne = 2;
            }
            if (p1 == R.id.rb_1c) {

                selectOne = 3;
            }
            if (p1 == R.id.rb_1d) {
                selectOne = 4;

            }
        }

        findViewById<Button>(R.id.bt_submit).setOnClickListener {
            if (selectOne==-1){
                Toast.makeText(this,"Please select the answer", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            topicRepository?.saveSelect(selectOne,this)

            val intent= Intent(this,PhysicsResultActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}