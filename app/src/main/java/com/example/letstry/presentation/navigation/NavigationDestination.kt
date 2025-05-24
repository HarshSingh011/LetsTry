package com.example.letstry.presentation.navigation

import com.example.letstry.R

sealed class NavigationDestination(val route: String, val title: String, val iconId: Int) {
    object Person : NavigationDestination("person", "Person", R.drawable.ic_person)
    object Upload : NavigationDestination("upload", "Upload", R.drawable.ic_upload)
    object Favorite : NavigationDestination("favorite", "Favorite", R.drawable.ic_favorite)
}