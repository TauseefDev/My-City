package com.example.aamchimumbai.data

import androidx.annotation.DrawableRes

data class Category(
    val name: String,
    @DrawableRes val icon: Int,
    val list: List<Place>

)

