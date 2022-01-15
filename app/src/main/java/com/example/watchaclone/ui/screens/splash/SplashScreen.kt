package com.example.watchaclone.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.watchaclone.R
import com.example.watchaclone.data.SharedViewModel
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(color = Color.LightGray)

    LaunchedEffect(key1 = true) {
        delay(2000)
        viewModel.bottomBarShown.value = true
        navController.navigate("home_root") {
            popUpTo("splash") { inclusive = true }
        }
    }
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.splash_screen),
            contentDescription = "splash"
        )
    }
}
