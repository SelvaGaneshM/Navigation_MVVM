package com.learning.navigationsample.network

import com.learning.navigationsample.model.response.UserObjectResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<ArrayList<UserObjectResponse>>
}