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
    val pressure: String,
    val hour: String,
    val date: String,
)

val dummyData = listOf(
    WeatherData(
        state = R.drawable.small,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "840hPa",
        hour = "12:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Partly Cloudy Drizzle",
        city = "Istanbul",
        country = "Turkey",
        degree = "31",
        wind = "14 km/h",
        humidity = "26%",
        precipitation = "82%",
        pressure = "812hPa",
        hour = "13:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "32",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "810hPa",
        hour = "14:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "32",
        wind = "11 km/h",
        humidity = "26%",
        precipitation = "86%",
        pressure = "822hPa",
        hour = "15:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Partly Cloudy Snow",
        city = "Istanbul",
        country = "Turkey",
        degree = "31",
        wind = "15 km/h",
        humidity = "21%",
        precipitation = "81%",
        pressure = "800hPa",
        hour = "16:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "802hPa",
        hour = "17:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Partly Cloudy Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "30",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "812hPa",
        hour = "18:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Rain",
        city = "Istanbul",
        country = "Turkey",
        degree = "28",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "820hPa",
        hour = "19:00",
        date = "27, Feb 2021"
    ),
    WeatherData(
        state = R.drawable.small,
        state_text = "Rain Thunderstorms",
        city = "Istanbul",
        country = "Turkey",
        degree = "27",
        wind = "13 km/h",
        humidity = "24%",
        precipitation = "87%",
        pressure = "800hPa",
        hour = "20:00",
        date = "27, Feb 2021"
    )
)
