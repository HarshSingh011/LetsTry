package com.example.letstry.domain.usecase

import com.example.letstry.domain.model.Model
import com.example.letstry.domain.repository.ModelRepository
import javax.inject.Inject

class Generate3DModelUseCase @Inject constructor(
    private val repository: ModelRepository
) {
    suspend operator fun invoke(imagePath: String): List<Model> {
        return repository.generate3DModels(imagePath)
    }
}