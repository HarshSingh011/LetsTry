package com.example.letstry.domain.repository

import com.example.letstry.domain.model.Model
import kotlinx.coroutines.flow.Flow

interface ModelRepository {
    suspend fun generate3DModels(imagePath: String): List<Model>
    fun getFavoriteModels(): Flow<List<Model>>
    suspend fun toggleFavorite(modelId: String)
}