package com.ctnphrae.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test3.*
import kotlinx.android.synthetic.main.activity_test3.btn_close
import kotlin.system.exitProcess

class test3 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test3)

        setTitle("ผลลัพธ์")
        class InformationActivity : AppCompatActivity() {
            var test_name: TextView? = null
            var test_age: TextView? = null
            var test_phone: TextView? = null
            var test_email: TextView? = null
            var test_pm: TextView? = null
            var test_nickname: TextView? = null
            var button: Button? = null
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_test3)
                test_name = findViewById(R.id.ed_name) as TextView
                test_age = findViewById(R.id.ed_age) as TextView
                test_phone = findViewById(R.id.ed_phone) as TextView
                test_email = findViewById(R.id.ed_email1) as TextView
                test_pm = findViewById(R.id.ed_pm1) as TextView
                test_nickname = findViewById(R.id.ed_nickname1) as TextView

                var intent = getIntent()
                test_name!!.setText("" + intent.getStringExtra("NAME"))
                test_age!!.setText("" + intent.getStringExtra("AGE"))
                test_phone!!.setText("" + intent.getStringExtra("PHONE"))
                test_email!!.setText("" + intent.getStringExtra("EMAIL"))
                test_pm!!.setText("" + intent.getStringExtra("Department"))
                test_nickname!!.setText("" + intent.getStringExtra("Nickname"))

            }
        }
        btn_back.setOnClickListener {
            super.onBackPressed()
        }
        btn_close!!.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }
}
