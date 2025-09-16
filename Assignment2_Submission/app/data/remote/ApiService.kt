package com.example.assignment2.data.remote

import retrofit2.http.*

data class KeypassDto(val keypass: String)
data class DashboardDto(val entities: List<Entity>, val entityTotal: Int)

data class Entity(val property1: String, val property2: String, val description: String)

interface ApiService {
    @POST("{campus}/auth")
    suspend fun login(@Path("campus") campus: String, @Body body: Map<String, String>): KeypassDto

    @GET("dashboard/{keypass}")
    suspend fun getDashboard(@Path("keypass") keypass: String): DashboardDto
}
