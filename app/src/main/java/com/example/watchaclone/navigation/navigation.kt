package com.example.watchaclone.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


// Bottom Navigation Button Icons
@Composable
fun BottomIcon(
    navController: NavHostController,
    iconName: ImageVector,
    route: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clickable { navController.navigate(route) }
            .padding(vertical = 4.dp, horizontal = 12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(28.dp),
            imageVector = iconName,
            contentDescription = null,
            tint = Color.LightGray
        )
        Text(
            color = Color.LightGray,
            text = title,
            style = MaterialTheme.typography.body2
        )
    }
}