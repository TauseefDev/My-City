package com.example.aamchimumbai.data
import com.example.mumbai.R


object DataSource {

    private val restaurantsCategory = Category (
        name = "Restaurants",
        icon = R.drawable.restaurant_icon,
        list = listOf(
               Place(
                     name = R.string.cafeholiday_title,
                     description = R.string.cafe_desc,
                     address = R.string.cafe_add,
                     photo = R.drawable.cafeholiday
                    ),
            Place(
                    name = R.string.gulshan_title,
                    description = R.string.gulshan_desc,
                    address = R.string.gulshan_add,
                    photo = R.drawable.gulshaneiran
            ),
            Place(
                    name = R.string.usmaniya_title,
                    description = R.string.usmaniya_desc,
                    address = R.string.usmaniya_add,
                    photo = R.drawable.usmaniyahotel
            ),
            Place(
                    name = R.string.metro_title,
                    description = R.string.metro_desc,
                    address = R.string.metro_add,
                    photo = R.drawable.cafemetro
            )
        )
    )

    private val beachesCategory = Category (
        name = "Beaches",
        icon = R.drawable.beach_icon,
        list = listOf(
            Place(
                name = R.string.chow_title,
                description = R.string.chow_desc,
                address = R.string.chow_add,
                photo = R.drawable.chowpaty
            ),
            Place(
                name = R.string.juhu_title,
                description = R.string.juhu_desc,
                address = R.string.juhu_add,
                photo = R.drawable.juhubeach
            ),
            Place(
                name = R.string.vers_title,
                description = R.string.vers_desc,
                address = R.string.vers_add,
                photo = R.drawable.versovabeach
        ),
            Place(
                name = R.string.aksa_title,
                description = R.string.aksa_desc,
                address = R.string.aksa_add,
                photo = R.drawable.aksabeach
            )
    )
)

    private val shoppingCategory = Category (
        name = "Shopping",
        icon = R.drawable.shopping_icon,
        list = listOf(
            Place(
                name = R.string.linking_title,
                description = R.string.linking_desc,
                address = R.string.linking_add,
                photo = R.drawable.linkingroad
            ),
            Place(
                name = R.string.colaba_title,
                description = R.string.colaba_desc,
                address = R.string.colaba_add,
                photo = R.drawable.colabacauseway
            ),
            Place(
                name = R.string.crawford_title,
                description = R.string.crawford_desc,
                address = R.string.crawford_add,
                photo = R.drawable.crawfordmarket
            ),
            Place(
                name = R.string.phoenix_title,
                description = R.string.phoenix_desc,
                address = R.string.phoenix_add,
                photo = R.drawable.phoenix
            )
        )
    )

    private val othersCategory = Category(
        name = "Others",
        icon = R.drawable.others,
        list = listOf(
            Place(
            name = R.string.marine_title,
            description = R.string.marine_desc,
            address = R.string.marine_add,
            photo = R.drawable.marine
        ),
            Place(
                name = R.string.asiatic_title,
                description = R.string.asiatic_desc,
                address = R.string.asiatic_add,
                photo = R.drawable.asiatic
        ),
            Place(
                name = R.string.flora_title,
                description = R.string.flora_desc,
                address = R.string.flora_add,
                photo = R.drawable.flora
            )
    )
)
val listOfCategories = listOf(
    restaurantsCategory,
    beachesCategory,
    shoppingCategory,
    othersCategory
)

}


