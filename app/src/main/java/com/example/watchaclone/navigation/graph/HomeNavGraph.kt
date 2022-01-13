package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "home",
        route = "home_root"
    ) {
        composable(
            route = "home"
        ) {
            Text("home !!")
        }
    }
}