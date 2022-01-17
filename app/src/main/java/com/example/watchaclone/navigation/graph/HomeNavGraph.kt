package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.ui.screens.home.HomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
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
            HomeScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}