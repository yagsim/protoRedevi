package com.ecd.redevi.ui.Habitaciones

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HabitacionesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "habitaciones"
    }
    val text: LiveData<String> = _text
}