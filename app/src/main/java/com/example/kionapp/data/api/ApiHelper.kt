package com.example.kionapp.data.api

import com.example.kionapp.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}