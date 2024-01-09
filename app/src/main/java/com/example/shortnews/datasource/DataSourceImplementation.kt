package com.example.shortnews.datasource

import com.example.shortnews.data.api.ApiService
import com.example.shortnews.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class DataSourceImplementation @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {
    override suspend fun getHeadline(country: String): Response<NewsResponse> {
        return apiService.getHeadline(country)
    }

}