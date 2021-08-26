package com.web0zz.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.web0zz.weatherapp.adapter.WeatherByHourAdapter
import com.web0zz.weatherapp.data.WeatherData
import com.web0zz.weatherapp.data.dummyData
import com.web0zz.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setCurrentWeather(dummyData[0])
        binding.daysRecyclerView.adapter =
            WeatherByHourAdapter(
                dummyData,
                WeatherByHourAdapter.WeatherClickListener {
                    setCurrentWeather(it)
                }
            )
    }

    private fun setCurrentWeather(weatherData: WeatherData) {
        binding.dateTextView.text = weatherData.date
        binding.locationCityTextView.text = weatherData.city
        binding.locationCountryTextView.text = weatherData.country
        binding.hourTextView.text = weatherData.hour
        binding.weatherStateImageView.setImageResource(weatherData.state)
        binding.weatherStateTextView.text = weatherData.state_text
        binding.degreeTextView.text = weatherData.degree
        binding.windValueTextView.text = weatherData.wind
        binding.humidityValueTextView.text = weatherData.humidity
        binding.chanceOfRainValueTextView.text = weatherData.precipitation
    }
}