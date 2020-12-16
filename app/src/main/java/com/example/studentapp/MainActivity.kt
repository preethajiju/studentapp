package com.example.studentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginevent(view: View) {
      var getUname=findViewById<EditText>(R.id.uname)
        var getPass=findViewById<EditText>(R.id.pass)
        var getNum=findViewById<EditText>(R.id.mob)
        Toast.makeText(this,getUname.text.toString()+" "+getPass.text.toString()+" "+
                getNum.text.toString(),Toast.LENGTH_LONG).show()
//        Toast.makeText(this,getPass.text.toString(),Toast.LENGTH_LONG).show()
//        Toast.makeText(this,getNum.text.toString(),Toast.LENGTH_LONG).show()



    }

    fun buttonclickevent(view: View) {
        intent= Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}