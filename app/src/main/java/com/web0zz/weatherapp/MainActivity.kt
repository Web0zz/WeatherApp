package com.web0zz.weatherapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.web0zz.weatherapp.adapter.WeatherByHourAdapter
import com.web0zz.weatherapp.data.WeatherData
import com.web0zz.weatherapp.data.dummyData
import com.web0zz.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extra: Bundle? = intent.extras

        val date = extra?.getString("DATE")

        setCurrentWeather(dummyData[0].apply { this.date = date ?: this.date })

        binding.byHourRecyclerView.adapter =
            WeatherByHourAdapter(
                dummyData,
                WeatherByHourAdapter.WeatherClickListener {
                    setCurrentWeather(it)
                }
            )

        binding.nextDaysButtonView.setOnClickListener {
            val intent = Intent(this, ActivityDays::class.java)
            intent.putExtra("CITY", dummyData[0].city)
            intent.putExtra("COUNTRY", dummyData[0].country)
            startActivity(intent)
        }
    }

    private fun setCurrentWeather(weatherData: WeatherData) {
        binding.dateTextView.text = weatherData.date
        binding.locationCityTextView.text = weatherData.city
        binding.locationCountryTextView.text = weatherData.country
        binding.hourTextView.text = weatherData.hour
        binding.weatherStateImageView.setImageResource(weatherData.state)
        binding.weatherStateTextView.text = weatherData.state_text
        binding.degreeTextView.text = weatherData.degree
        binding.precipitationValueTextView.text = weatherData.precipitation
        binding.windValueTextView.text = weatherData.wind
        binding.humidityValueTextView.text = weatherData.humidity
        binding.pressureValueTextView.text = weatherData.pressure
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}