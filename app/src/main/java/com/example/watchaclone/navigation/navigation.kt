package com.example.watchaclone.navigation


import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.navigation.graph.*
import com.example.watchaclone.navigation.graph.searchNavGraph
import com.example.watchaclone.utils.Constants.ROOT_ROUTE

@Composable
fun setUpNavigation(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    NavHost(
        navController = navController,
        startDestination = "home_root"
    ) {
        homeNavGraph(
            navController = navController,
            viewModel = viewModel
        )
        searchNavGraph(
            navController = navController,
            viewModel = viewModel
        )
        rateNavGraph(
            navController = navController,
            viewModel = viewModel
        )
        newsNavGraph(
            navController = navController,
            viewModel = viewModel
        )
        profileNavGraph(
            navController = navController,
            viewModel = viewModel
        )
    }
}