package com.example.letstry.domain.model

data class Model(
    val id: String,
    val path: String,
    val name: String,
    val isFavorite: Boolean = false
)