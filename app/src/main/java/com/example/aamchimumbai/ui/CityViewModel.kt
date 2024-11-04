package com.example.aamchimumbai.ui

import androidx.lifecycle.ViewModel
import com.example.aamchimumbai.data.Category
import com.example.aamchimumbai.data.DataSource
import com.example.aamchimumbai.data.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CityViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState

    init {
        initialzeUiState()
    }

    private fun initialzeUiState() {
        _uiState.value = MyCityUiState(
            categories = DataSource.listOfCategories,
        )
    }

    fun updateCurrentCategory(category: Category) {
        _uiState.update {
            it.copy(
                currentCategory = category
            )
        }
    }

    fun updateCurrentPlace(place: Place?) {
        _uiState.update {
            it.copy(
                currentPlace = place
            )
        }
    }
}