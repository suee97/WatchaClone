package com.example.watchaclone.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val label: String,
    val icon: ImageVector
) {
    object HomeButton: BottomNavItem("홈", Icons.Filled.Home)
    object SearchButton: BottomNavItem("검색", Icons.Filled.Search)
    object RateButton: BottomNavItem("평가", Icons.Filled.Star)
    object NewsButton: BottomNavItem("소식", Icons.Filled.Sms)
    object ProfileButton: BottomNavItem("나의 왓챠", Icons.Filled.Person)
}