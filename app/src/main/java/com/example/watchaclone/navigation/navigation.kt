package com.example.watchaclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.watchaclone.ui.screens.home.HomeScreen
import com.example.watchaclone.ui.screens.news.NewsScreen
import com.example.watchaclone.ui.screens.profile.ProfileScreen
import com.example.watchaclone.ui.screens.rate.RateScreen
import com.example.watchaclone.ui.screens.search.SearchScren
import com.example.watchaclone.utils.Constants.HOME_BASE_URL
import com.example.watchaclone.utils.Constants.NEWS_BASE_URL
import com.example.watchaclone.utils.Constants.PROFILE_BASE_URL
import com.example.watchaclone.utils.Constants.RATE_BASE_URL
import com.example.watchaclone.utils.Constants.SEARCH_BASE_URL

@Composable
fun setUpNavigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_BASE_URL
    ) {
        composable(route = HOME_BASE_URL) {
            HomeScreen()
        }
        composable(route = SEARCH_BASE_URL) {
            SearchScren()
        }
        composable(route = RATE_BASE_URL) {
            RateScreen()
        }
        composable(route = NEWS_BASE_URL) {
            NewsScreen()
        }
        composable(route = PROFILE_BASE_URL) {
            ProfileScreen()
        }
    }
}