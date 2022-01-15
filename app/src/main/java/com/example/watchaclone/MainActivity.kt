package com.example.watchaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.navigation.BottomNavigationBar
import com.example.watchaclone.navigation.setUpNavigation
import com.example.watchaclone.ui.screens.splash.SplashScreen
import com.example.watchaclone.ui.theme.WatchaCloneTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()

            WatchaCloneTheme {
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            navController = navController,
                            viewModel = sharedViewModel
                        )
                    }
                ) {
                    setUpNavigation(
                        navController = navController,
                        viewModel = sharedViewModel
                    )
                }
            }
        }
    }
}
