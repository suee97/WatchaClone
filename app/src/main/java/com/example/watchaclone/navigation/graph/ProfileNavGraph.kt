package com.example.watchaclone.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.ui.screens.profile.ProfileScreen

fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "profile",
        route = "profile_root"
    ) {
        composable(
            route = "profile"
        ) {
            ProfileScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}