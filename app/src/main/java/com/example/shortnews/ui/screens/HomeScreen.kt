package com.example.shortnews.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shortnews.datasource.NewsDataSource
import com.example.shortnews.ui.repository.NewsRepository
import com.example.shortnews.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState

@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel
) {
    val newsResponse by newsViewModel.news.collectAsState()
    Surface(modifier = Modifier.fillMaxSize()) {
        when (newsResponse) {
            is ResourceState.Loading -> {}
            is ResourceState.Error -> {

            }

            is ResourceState.Success -> {

            }

            else -> {}
        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
//    HomeScreen(NewsViewModel(NewsRepository(NewsDataSource)))
}