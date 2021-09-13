package com.web0zz.weatherapp.data

import com.web0zz.weatherapp.R

data class WeatherByDay(
    val state: Int,
    val state_text: String,
    val city: String,
    val country: String,
    val degree: String,
    val date: String,
)

val dayList = listOf(
    WeatherByDay(
        state = R.drawable.ic_partly_cloudy_day_drizzle,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        date = "28, Feb 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_partly_cloudy_day_drizzle,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "31",
        date = "29, Feb 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_rain,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "32",
        date = "30, Feb 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_rain,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "32",
        date = "31, Feb 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_partly_cloudy_day_snow,
        state_text = "Partly Cloudy Snow",
        city = "Istanbul",
        country = "Turkey",
        degree = "31",
        date = "01, Sep 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_partly_cloudy_night_rain,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        date = "02, Sep 2021"
    ),
    WeatherByDay(
        state = R.drawable.ic_partly_cloudy_night_rain,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        date = "03, Sep 2021"
    )
)