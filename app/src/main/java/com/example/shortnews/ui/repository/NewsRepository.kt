package com.example.shortnews.ui.repository

import com.example.shortnews.data.entity.NewsResponse
import com.example.shortnews.datasource.NewsDataSource
import com.example.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsDataSource: NewsDataSource) {
//    suspend fun getHeadLine(country: String): Response<NewsResponse> {
//        return newsDataSource.getNewsHeadline(country)
//    }

    suspend fun getNewsHeadlines(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newsDataSource.getNewsHeadline(country)

            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                emit(ResourceState.Error("No internet"));

            }
        }.catch { e ->
            emit(ResourceState.Error(e.localizedMessage ?: "Error occurred"))
        }
    }
}