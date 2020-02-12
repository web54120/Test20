package com.ctnphrae.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ed_Name: EditText? = null
        var ed_Age: EditText? = null
        var ed_Phone: EditText? = null
        var ed_Email: EditText? = null
        var ed_pm: EditText? = null
        var ed_nickname: EditText? = null
        var button: Button? = null

        ed_Name = findViewById(R.id.ed_name) as EditText
        ed_Age = findViewById(R.id.ed_age) as EditText

        ed_Email = findViewById(R.id.ed_email1) as EditText
        button = findViewById(R.id.btn_sender) as Button

        btn_sender!!.setOnClickListener {
            var intent = Intent(this, test3::class.java)
            intent.putExtra("NAME",""+ tv_name!!.getText().toString())
            intent.putExtra("AGE",""+ tv_age!!.getText().toString())
            intent.putExtra("PHONE",""+ tv_phone!!.getText().toString())
            intent.putExtra("EMAIL",""+ tv_email!!.getText().toString())
            intent.putExtra("Department ",""+ tv_pm!!.getText().toString())
            intent.putExtra("Nickname ",""+ tv_nickname!!.getText().toString())
            startActivity(intent)
        }
        btn_close!!.setOnClickListener {
            moveTaskToBack(true);
            exitProcess(-1)
        }
    }

}
