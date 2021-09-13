package com.web0zz.weatherapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.web0zz.weatherapp.data.WeatherByDay
import com.web0zz.weatherapp.databinding.ViewWeatherByDayBinding

class WeatherByDayAdapter(
    private val daysList: List<WeatherByDay>,
    private val onClickListener: DayClickListener,
) : RecyclerView.Adapter<WeatherByDayAdapter.WeatherByDayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherByDayViewHolder {
        val binding = ViewWeatherByDayBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return WeatherByDayViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WeatherByDayViewHolder, position: Int) {
        with(holder) {
            with(daysList[position]) {
                binding.daysItemConstraintLayout.setOnClickListener {
                    onClickListener.onClick(this)
                }
                val degreeText = "$degree°"

                binding.dayDateTextView.text = date
                binding.dayWeatherStateTextView.text = state_text
                binding.dayDegreeTextView.text = degreeText
                binding.dayWeatherStateImageView.setImageResource(state)
            }
        }
    }

    override fun getItemCount() = daysList.size

    inner class WeatherByDayViewHolder(val binding: ViewWeatherByDayBinding) :
        RecyclerView.ViewHolder(binding.root)

    class DayClickListener(val clickListener: (weatherByDay: WeatherByDay) -> Unit) {
        fun onClick(weatherByDay: WeatherByDay) = clickListener(weatherByDay)
    }
}