package com.example.newsmvi.ui.state

sealed class MainStateEvent {

    object FetchNews : MainStateEvent()

    object None: MainStateEvent()
}