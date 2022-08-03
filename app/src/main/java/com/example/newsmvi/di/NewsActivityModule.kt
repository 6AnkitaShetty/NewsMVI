package com.example.newsmvi.di

import com.bumptech.glide.RequestManager
import com.example.newsmvi.ui.MainRecyclerAdapter
import com.example.newsmvi.util.TopSpacingItemDecoration
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object NewsActivityModule {

    @NewsScope
    @Provides
    fun provideMainAdapter(requestManager: RequestManager) : MainRecyclerAdapter {
        return MainRecyclerAdapter(requestManager)
    }

    //Added in news scope only for testing
    @NewsScope
    @Provides
    fun provideItemDecoration() : TopSpacingItemDecoration {
        return TopSpacingItemDecoration(30)
    }

}