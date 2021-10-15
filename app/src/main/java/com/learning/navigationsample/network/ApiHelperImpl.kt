package com.learning.navigationsample.network

import com.learning.navigationsample.model.response.UserObjectResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): Response<ArrayList<UserObjectResponse>> = apiService.getUsers()
}