package com.web0zz.weatherapp

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.web0zz.weatherapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        object : CountDownTimer(2500, 1000) {
            override fun onTick(p0: Long) {}

            override fun onFinish() {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}