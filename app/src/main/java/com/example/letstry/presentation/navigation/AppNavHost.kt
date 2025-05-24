package com.example.letstry.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.letstry.presentation.favorite.FavoriteScreen
import com.example.letstry.presentation.person.PersonScreen
import com.example.letstry.presentation.upload.UploadScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavigationDestination.Person.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavigationDestination.Person.route) {
                PersonScreen()
            }
            composable(NavigationDestination.Upload.route) {
                UploadScreen()
            }
            composable(NavigationDestination.Favorite.route) {
                FavoriteScreen()
            }
        }
    }
}