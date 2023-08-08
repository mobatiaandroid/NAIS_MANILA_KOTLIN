package com.mobatia.naismanila.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.mobatia.naismanila.MainActivity2
import com.mobatia.naismanila.R

class MainActivity : AppCompatActivity() {
    lateinit var paymentRel: RelativeLayout
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        paymentRel = findViewById(R.id.paymentRelative)
        paymentRel.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}