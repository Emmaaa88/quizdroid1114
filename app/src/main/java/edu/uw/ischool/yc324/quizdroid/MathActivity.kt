package edu.uw.ischool.yc324.quizdroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import android.widget.Toast


class MathActivity : AppCompatActivity() {
    private  var selectOne=-1;
    private  var selectTwo=-1;
    private  var selectThree=-1;
    private  var selectFour=-1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math)
        findViewById<RadioGroup>(R.id.rg_1).setOnCheckedChangeListener(object :OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                if (p1==R.id.rb_1a){
                    selectOne=1;
                }
                if (p1==R.id.rb_1b){

                    selectOne=2;
                }
                if (p1==R.id.rb_1c){

                    selectOne=3;
                }
                if (p1==R.id.rb_1d){
                    selectOne=4;

                }

            }

        })
        findViewById<RadioGroup>(R.id.rg_2).setOnCheckedChangeListener(object :OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                if (p1==R.id.rb_2a){
                    selectTwo=1;
                }
                if (p1==R.id.rb_2b){
                    selectTwo=2;
                }
                if (p1==R.id.rb_2c){
                    selectTwo=3;
                }
                if (p1==R.id.rb_2d){
                    selectTwo=4;
                }
            }

        })
        findViewById<RadioGroup>(R.id.rg_3).setOnCheckedChangeListener(object :OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                if (p1==R.id.rb_3a){
                    selectThree=1;
                }
                if (p1==R.id.rb_3b){
                    selectThree=2;
                }
                if (p1==R.id.rb_3c){
                    selectThree=3;
                }
                if (p1==R.id.rb_3d){
                    selectThree=4;
                }
            }

        })
        findViewById<RadioGroup>(R.id.rg_4).setOnCheckedChangeListener(object :OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
                if (p1==R.id.rb_4a){
                    selectFour=1;
                }
                if (p1==R.id.rb_4b){
                    selectFour=2;
                }
                if (p1==R.id.rb_4c){
                    selectFour=3;
                }
                if (p1==R.id.rb_4d){
                    selectFour=4;
                }
            }

        })
        findViewById<Button>(R.id.bt_submit).setOnClickListener {
            if (selectOne==-1||selectTwo==-1||selectThree==-1||selectFour==-1){
                Toast.makeText(this,"Please select the answer",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val intent= Intent(this,MathResultActivity::class.java)
            intent.putExtra("selectOne",selectOne);
            intent.putExtra("selectTwo",selectTwo);
            intent.putExtra("selectThree",selectThree);
            intent.putExtra("selectFour",selectFour);
            startActivity(intent)
            finish()
        }
    }
}