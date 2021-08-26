package com.web0zz.weatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.weatherapp.data.WeatherData
import com.web0zz.weatherapp.databinding.WeatherByHourBinding

class WeatherByHourAdapter(
    private val hoursList: List<WeatherData>,
    private val onClickListener: WeatherClickListener
): RecyclerView.Adapter<WeatherByHourAdapter.WeatherByHourViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherByHourViewHolder {
        val binding = WeatherByHourBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return WeatherByHourViewHolder(binding)
    }

    override fun getItemCount() = hoursList.size

    override fun onBindViewHolder(holder: WeatherByHourViewHolder, position: Int) {
        with(holder){
            with(hoursList[position]){
                binding.hoursWeatherCardView.setOnClickListener {
                    onClickListener.onClick(this)
                }
                binding.hourTextView.text = hour
                binding.hourDegreeTextView.text = degree
                binding.hourWeatherStateIconImageView.setImageResource(state)
            }
        }
    }

    inner class WeatherByHourViewHolder(val binding: WeatherByHourBinding)
        :RecyclerView.ViewHolder(binding.root)

    class WeatherClickListener(val clickListener: (weather: WeatherData) -> Unit) {
        fun onClick(weather: WeatherData) = clickListener(weather)
    }
}