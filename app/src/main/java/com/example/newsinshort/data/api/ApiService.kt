package com.example.newsinshort.data.api

import com.example.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "a55ba47d755b4007be43e5cd4127bb5a"
    ) : Response<NewsResponse>

}

//GET https://newsapi.org/v2/top-headlines?country=us&apiKey=YOUR_API_KEY