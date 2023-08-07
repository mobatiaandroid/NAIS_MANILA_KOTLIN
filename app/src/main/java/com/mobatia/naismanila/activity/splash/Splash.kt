package com.mobatia.naismanila.activity.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.mobatia.naismanila.R
import com.mobatia.naismanila.activity.home.Home
import com.mobatia.naismanila.activity.login.Login
import com.mobatia.naismanila.activity.tutorial.Tutorial
import com.mobatia.naismanila.constant.PreferenceManager

class Splash : AppCompatActivity() {
    lateinit var context: Context
    private val SPLASH_TIME_OUT:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        context = this
        Handler().postDelayed({

            if (PreferenceManager.getIsFirstTime(context).equals(""))
            {
                val intent = Intent(context, Tutorial::class.java)
                PreferenceManager.setIsFirstTime(context,"First")
                startActivity(intent)
                finish()
            }
            else{
                if (PreferenceManager.getAccessToken(context).equals(""))
                {
                    startActivity(Intent(this, Login::class.java))
                    finish()

                }
                else
                {
                    startActivity(Intent(this, Home::class.java))
                    finish()

                }
            }




        }, SPLASH_TIME_OUT)
    }
}