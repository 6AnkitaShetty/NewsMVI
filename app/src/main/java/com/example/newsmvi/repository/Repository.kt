package com.example.newsmvi.repository

import androidx.lifecycle.LiveData
import com.example.newsmvi.model.NewsModel
import com.example.newsmvi.network.ApiService
import com.example.newsmvi.ui.state.MainViewState
import com.example.newsmvi.util.ApiSuccessResponse
import com.example.newsmvi.util.DataState
import com.example.newsmvi.util.GenericApiResponse
import javax.inject.Inject

class Repository @Inject constructor(val apiService: ApiService) {
    fun getBlogPosts(): LiveData<DataState<MainViewState>> {
        return object : NetworkBoundResource<NewsModel, MainViewState>() {

            override fun handleApiSuccessResponse(response: ApiSuccessResponse<NewsModel>) {
                result.value = DataState.data(
                    null,
                    MainViewState(
                        newsModel = response.body
                    )
                )
            }

            override fun createCall(): LiveData<GenericApiResponse<NewsModel>> {
                return apiService.getNewsArticles()
            }

        }.asLiveData()
    }
}