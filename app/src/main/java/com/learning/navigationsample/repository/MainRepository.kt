package com.learning.navigationsample.repository

import com.learning.navigationsample.network.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() =  apiHelper.getUsers()
}