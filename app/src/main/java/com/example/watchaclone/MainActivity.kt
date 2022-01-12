package com.example.watchaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.watchaclone.navigation.BottomNavigationBar
import com.example.watchaclone.navigation.setUpNavigation
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()

            Scaffold(
                content = {
                    setUpNavigation(navController = navController)
                },
                bottomBar = {
                    BottomNavigationBar(navController = navController)
                }
            )
        }
    }
}
