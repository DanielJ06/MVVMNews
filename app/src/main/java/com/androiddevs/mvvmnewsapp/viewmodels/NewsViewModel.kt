package com.androiddevs.mvvmnewsapp.viewmodels

import androidx.lifecycle.ViewModel

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}