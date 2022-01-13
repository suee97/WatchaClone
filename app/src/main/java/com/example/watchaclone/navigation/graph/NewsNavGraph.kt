package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel

fun NavGraphBuilder.newsNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "news",
        route = "news_root"
    ) {
        composable(
            route = "news"
        ) {
            Text("news !!")
        }
    }
}