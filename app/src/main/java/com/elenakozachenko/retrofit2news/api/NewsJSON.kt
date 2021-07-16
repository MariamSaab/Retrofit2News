package com.elenakozachenko.retrofit2news.api

data class NewsJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)