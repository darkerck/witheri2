package com.example.witheri

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.witheri.adapters.WeatherModel

class MainVewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}