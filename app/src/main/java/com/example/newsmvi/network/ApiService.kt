package com.example.newsmvi.network

import androidx.lifecycle.LiveData
import com.example.newsmvi.BuildConfig
import com.example.newsmvi.model.NewsModel
import com.example.newsmvi.util.GenericApiResponse
import retrofit2.http.GET

interface ApiService {

    @GET("v2/top-headlines?country=in&apiKey=${BuildConfig.API_KEY}")
    fun getNewsArticles(): LiveData<GenericApiResponse<NewsModel>>

}