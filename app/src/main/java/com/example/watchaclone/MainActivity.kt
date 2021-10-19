package com.example.watchaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.watchaclone.navigation.BottomIcon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    val navController = rememberNavController()

    Scaffold(

        content = {
            NavHost(navController = navController, startDestination = "HomeScreen") {
                composable("HomeScreen") {
                    Text("홈 화면 !", fontSize = 30.sp)
                }
                composable("SearchScreen") {
                    Text("검색 화면 !", fontSize = 30.sp)
                }
                composable("RatingScreen") {
                    Text("평가 화면 !", fontSize = 30.sp)
                }
                composable("NewsScreen") {
                    Text("소식 화면 !", fontSize = 30.sp)
                }
                composable("MyWatchaScreen") {
                    Text("나의 왓챠 화면 !", fontSize = 30.sp)
                }
            }
        },

        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                BottomIcon(
                    modifier = Modifier.weight(.2f),
                    navController = navController,
                    iconName = Icons.Default.Home,
                    route = "HomeScreen",
                    title = "홈"
                )
                BottomIcon(
                    modifier = Modifier.weight(.2f),
                    navController = navController,
                    iconName = Icons.Outlined.Search,
                    route = "SearchScreen",
                    title = "검색"
                )
                BottomIcon(
                    modifier = Modifier.weight(.2f),
                    navController = navController,
                    iconName = Icons.Default.Star,
                    route = "RatingScreen",
                    title = "평가"
                )
                BottomIcon(
                    modifier = Modifier.weight(.2f),
                    navController = navController,
                    iconName = Icons.Default.Textsms,
                    route = "NewsScreen",
                    title = "소식"
                )
                BottomIcon(
                    modifier = Modifier.weight(.2f),
                    navController = navController,
                    iconName = Icons.Default.Person,
                    route = "MyWatchaScreen",
                    title = "나의 왓챠"
                )
            }
        })
}