package com.example.studentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun registerevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getPhn=findViewById<EditText>(R.id.num)
        var getMail=findViewById<EditText>(R.id.mail)
        var getUser=findViewById<EditText>(R.id.user)
        var getPass=findViewById<EditText>(R.id.pass)
        var getCpass=findViewById<EditText>(R.id.cpass)
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPhn.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getMail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getUser.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPass.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getCpass.text.toString(),Toast.LENGTH_LONG).show()

    }

    fun backevent(view: View) {
     intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}