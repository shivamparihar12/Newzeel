package com.example.shortnews.di

import com.example.shortnews.data.AppConstants
import com.example.shortnews.data.api.ApiService
import com.example.shortnews.datasource.NewsDataSource
import com.example.shortnews.datasource.NewsDataSourceImplementation
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun getRetrofit(): Retrofit {
        val httpLoggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
        val httpClient = OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
            .readTimeout(60, TimeUnit.SECONDS)
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        return Retrofit.Builder().baseUrl(AppConstants.BASE_URL).client(httpClient.build())
            .addConverterFactory(MoshiConverterFactory.create(moshi)).build()
    }

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun providesNewsDataSource(apiService: ApiService): NewsDataSource {
        return NewsDataSourceImplementation(apiService)
    }
}