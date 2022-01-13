package com.example.watchaclone.navigation.graph

import android.util.Log
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.ui.screens.profile.ProfileScreen
import com.example.watchaclone.ui.screens.profile.editProfile.EditProfileScreen
import com.example.watchaclone.ui.screens.profile.settings.ProfileSettingScreen

fun NavGraphBuilder.profileNavGraph(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    navigation(
        startDestination = "profile",
        route = "profile_root"
    ) {
        composable(route = "profile") {
            ProfileScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = "profile/editProfile") {
            EditProfileScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = "profile/setting") {
            ProfileSettingScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}