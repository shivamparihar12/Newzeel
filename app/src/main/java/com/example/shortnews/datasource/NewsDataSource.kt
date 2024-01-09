package com.example.shortnews.datasource

import com.example.shortnews.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.Query

interface NewsDataSource {
    fun getHeadline(country: String): Response<NewsResponse>
}