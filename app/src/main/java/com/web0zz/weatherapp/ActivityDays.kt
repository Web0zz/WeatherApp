package com.web0zz.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.web0zz.weatherapp.adapter.WeatherByDayAdapter
import com.web0zz.weatherapp.data.dayList
import com.web0zz.weatherapp.databinding.ActivityWeatherByDayBinding

class ActivityDays : AppCompatActivity() {
    private var _binding: ActivityWeatherByDayBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityWeatherByDayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extra: Bundle? = intent.extras

        val locationCity = extra?.getString("CITY")
        val locationCountry = extra?.getString("COUNTRY")

        binding.locationCityTextView.text = locationCity
        binding.locationCountryTextView.text = locationCountry

        binding.backImageButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.daysRecyclerView.adapter = WeatherByDayAdapter(
            dayList,
            WeatherByDayAdapter.DayClickListener {
                onClickDay(it)
            }
        )
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun onClickDay(date: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("DATE", date)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}