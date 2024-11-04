package com.example.aamchimumbai

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.aamchimumbai.data.Category
import com.example.aamchimumbai.data.Place
import com.example.aamchimumbai.ui.CityViewModel

@Composable
fun CityScreen(
    viewModel: CityViewModel
) {
    val uiState by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {

        CategoryList(
        categories = uiState.categories,
        onCategorySelected = { category -> viewModel.updateCurrentCategory(category)},
        selectedCategory = uiState.currentCategory
        )

        Spacer(modifier = Modifier.height(8.dp))

        PlaceList(
            places = uiState.currentCategory?.list ?: emptyList(),
            onPlaceSelected = { place -> viewModel.updateCurrentPlace(place) }
        )
    }
}

    @Composable
    fun CategoryList(
        categories: List<Category>,
        onCategorySelected: (Category) -> Unit,
        selectedCategory: Category?
    ) {
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(categories) { category ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable { onCategorySelected(category) }
                ) {
                    Icon(
                        painter = painterResource(id = category.icon),
                        contentDescription = category.name,
                        tint = if (category == selectedCategory) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = category.name,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }

@Composable
fun PlaceList(
    places: List<Place>,
    onPlaceSelected: (Place) -> Unit
) {
    LazyColumn (
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(places) { place ->
            PlaceItem(
                place = place,
                onClick = { onPlaceSelected(place) }
            )
        }
    }
}

@Composable
fun PlaceItem(
    place: Place,
    onClick: () -> Unit,
) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row (modifier = Modifier.padding(16.dp)) {
            Icon(
                painter = painterResource(id = place.photo),
                contentDescription = stringResource(id = place.name),
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = stringResource(id = place.name),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = stringResource(id = place.description),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = stringResource(id = place.address),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}




