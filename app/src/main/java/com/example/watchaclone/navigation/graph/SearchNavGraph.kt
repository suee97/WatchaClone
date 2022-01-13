package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel

fun NavGraphBuilder.searchNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "search",
        route = "search_root"
    ) {
        composable(
            route = "search"
        ) {
            Text("서치 !!")
        }
    }
}