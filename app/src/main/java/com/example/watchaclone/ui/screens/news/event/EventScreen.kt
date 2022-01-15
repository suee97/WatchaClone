package com.example.watchaclone.ui.screens.news.event

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.watchaclone.utils.Constants.TOP_BAR_FONT_SIZE

@Composable
fun EventScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            EventTopAppBar(navController = navController)
        },
        content = {
            Text(text = "이벤트 화면")
        }
    )
}

@Composable
fun EventTopAppBar(
    navController: NavHostController
) {
    TopAppBar(
        backgroundColor = Color.White,
        title = {
            Text(
                text = "이벤트",
                fontSize = TOP_BAR_FONT_SIZE,
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                navController.navigate("news") {
                    popUpTo("news") { inclusive = true }
                }
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Arrow Back"
                )
            }
        }
    )
}