package com.example.newsmvi.ui

import com.example.newsmvi.util.DataState

interface DataStateListener {

    fun onDataStateChange(dataState: DataState<*>?)
}