package com.web0zz.weatherapp.data

import com.web0zz.weatherapp.R

data class WeatherData(
    val state: Int,
    val state_text: String,
    val city: String,
    val country: String,
    val degree: String,
    val wind: String,
    val humidity: String,
    val precipitation: String,
    val hour: String,
    val date: String,
)

val dummyData = listOf(
    WeatherData(
        state = R.drawable.ic_partly_cloudy_day_drizzle,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "30°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "12:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_day_drizzle,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "31°",
        wind = "14 km/j",
        humidity = "26%",
        precipitation = "82%",
        hour = "13:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_day_snow,
        state_text = "Partly Cloudy Snow",
        city = "Istanbul",
        country = "Turkey",
        degree = "32°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "14:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_day_snow,
        state_text = "Partly Cloudy Snow",
        city = "Istanbul",
        country = "Turkey",
        degree = "32°",
        wind = "11 km/j",
        humidity = "26%",
        precipitation = "86%",
        hour = "15:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_day_snow,
        state_text = "Partly Cloudy Snow",
        city = "Istanbul",
        country = "Turkey",
        degree = "31°",
        wind = "15 km/j",
        humidity = "21%",
        precipitation = "81%",
        hour = "16:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_night_rain,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "17:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_partly_cloudy_night_rain,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "18:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_rain,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "28°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "19:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.ic_thunderstorms_night,
        state_text = "Rain Thunderstorms",
        city = "Istanbul",
        country = "Turkey",
        degree = "27°",
        wind = "13 km/j",
        humidity = "24%",
        precipitation = "87%",
        hour = "20:00",
        date = "27, Feb 2021"
    )
)
