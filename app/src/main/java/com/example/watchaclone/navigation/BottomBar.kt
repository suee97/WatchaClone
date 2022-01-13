package com.example.watchaclone.navigation


import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.watchaclone.data.SharedViewModel

@Composable
fun BottomNavigationBar(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    val items = listOf(
        BottomNavItem.HomeButton,
        BottomNavItem.SearchButton,
        BottomNavItem.RateButton,
        BottomNavItem.NewsButton,
        BottomNavItem.ProfileButton
    )

    BottomNavigation(
        backgroundColor = Color.White,
        elevation = 12.dp
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.label)},
                label = { Text(text = item.label)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.LightGray,
                alwaysShowLabel = true,
                selected = (checkingNavigation(item, currentRoute)),
                onClick = {
                    navController.navigate(item.route[0]) {
                        popUpTo("${item.route[0]}")
                    }
                }
            )
        }
    }
}

fun checkingNavigation(
    item: BottomNavItem,
    currentRoute: String?
): Boolean {
    for(i in 1..item.route.size) {
        if(currentRoute == item.route[i-1]) {
            return true
        }
    }
    return false
}