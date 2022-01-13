package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel

fun NavGraphBuilder.rateNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "rate",
        route = "rate_root"
    ) {
        composable(
            route = "rate"
        ) {
            Text("rate !!")
        }
    }
}