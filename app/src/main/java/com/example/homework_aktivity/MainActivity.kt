package com.example.homework_aktivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val tel: EditText by lazy { findViewById(R.id.Start) }
    private val btn: Button by lazy { findViewById(R.id.btnStart) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(){
            if (tel.text.toString().trim()=="" || tel.text.toString().length<10 || tel.text.toString().length >10)
                Toast.makeText(this, "Введите коректно номер!", Toast.LENGTH_SHORT).show()
            else{
                val phone = tel.text.toString()
                val intent = Intent(this, SecondActivity::class.java)
                Intent(intent)
                intent.putExtra("phone", phone)
                startActivity(intent);
            }

        }
    }
}