package com.example.aamchimumbai.ui

import com.example.aamchimumbai.data.Category
import com.example.aamchimumbai.data.DataSource
import com.example.aamchimumbai.data.Place

data class MyCityUiState(

    val categories: List<Category> = DataSource.listOfCategories,
    val currentCategory: Category? = null,
    val currentPlace: Place? = null
)
