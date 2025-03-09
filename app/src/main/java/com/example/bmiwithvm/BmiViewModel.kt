package com.example.bmiwithvm

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class BMIViewModel : ViewModel() {
    var height by mutableStateOf("")
    var weight by mutableStateOf("")


    val bmi: String
        get() {
            val h = parseNumber(height) ?: 0f
            val w = parseNumber(weight) ?: 0f
            return if (h <= 0f || w <= 0f) ""
            else "%.1f".format(w / (h * h))
        }

    private fun parseNumber(input: String): Float? {
        return input
            .replace(',', '.')
            .toFloatOrNull()
    }

    fun updateHeight(newHeight: String) {
        height = newHeight
    }

    fun updateWeight(newWeight: String) {
        weight = newWeight
    }
}