package com.example.watchaclone.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val label: String,
    val icon: ImageVector,
    val route: List<String>
) {
    object HomeButton: BottomNavItem(
        "홈",
        Icons.Filled.Home,
        listOf("home")
    )
    object SearchButton: BottomNavItem("검색", Icons.Filled.Search, listOf("search"))
    object RateButton: BottomNavItem("평가", Icons.Filled.Star, listOf("rate"))
    object NewsButton: BottomNavItem("소식", Icons.Filled.Sms, listOf("news"))
    object ProfileButton: BottomNavItem(
        "나의 왓챠",
        Icons.Filled.Person,
        listOf("profile", "profile/editProfile", "profile/setting")
    )
}