package com.example.homework_aktivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {

    private val telephone : TextView by lazy { findViewById(R.id.tel) }
    private val btn : Button by lazy { findViewById(R.id.btnCall) }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val phone: String ="+7"+intent.getStringExtra("phone").toString()
        telephone.text = phone

        btn.setOnClickListener {
            val intent = Intent (Intent.ACTION_DIAL)
            intent.data = Uri.parse ("tel:$phone")
            startActivity (intent)
        }
    }
}