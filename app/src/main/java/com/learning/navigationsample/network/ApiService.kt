package com.learning.navigationsample.network

import com.learning.navigationsample.model.response.UserObjectResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<ArrayList<UserObjectResponse>>
}