package com.test.weatherapp.ui.weather.future.list

import com.test.weatherapp.data.internal.lazyDeferred
import com.test.weatherapp.data.provider.UnitProvider
import com.test.weatherapp.data.repository.WeatherRepository
import com.test.weatherapp.ui.base.WeatherViewModel

class FutureWeatherViewModel(
    private val repository: WeatherRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(repository = repository, unitProvider = unitProvider) {
    val weather by lazyDeferred {
        repository.getCurrentWeather(isMetric = super.isMetricUnit)
    }
}
