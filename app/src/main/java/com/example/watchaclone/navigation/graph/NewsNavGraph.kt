package com.example.watchaclone.navigation.graph

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.ui.screens.news.NewsScreen
import com.example.watchaclone.ui.screens.news.event.EventScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
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
            NewsScreen(navController = navController, viewModel = viewModel)
        }
        composable(
            route = "news/event"
        ) {
            EventScreen(navController = navController)
        }
    }
}