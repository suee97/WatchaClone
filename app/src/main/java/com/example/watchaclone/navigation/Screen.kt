package com.example.watchaclone.navigation

sealed class Screen(val route: String) {
    object Home: Screen(route = "home")
    object Search: Screen(route = "search")
    object Rate: Screen(route = "rate")
    object News: Screen(route = "news")
    object Profile: Screen(route = "profile")
}