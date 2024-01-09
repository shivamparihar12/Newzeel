package com.example.shortnews.data.api

import com.example.shortnews.data.AppConstants
import com.example.shortnews.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    fun getHeadline(
        @Query("country") country: String,
        @Query("apikey") apikey: String = AppConstants.API_KEY
    ): Response<NewsResponse>
}