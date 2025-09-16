package com.example.assignment2.repository

import com.example.assignment2.data.remote.ApiService
import com.example.assignment2.data.remote.Entity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val api: ApiService) {
    suspend fun login(campus: String, username: String, password: String): String {
        val key = api.login(campus, mapOf("username" to username, "password" to password))
        return key.keypass
    }

    suspend fun dashboard(keypass: String): List<Entity> = api.getDashboard(keypass).entities
}
