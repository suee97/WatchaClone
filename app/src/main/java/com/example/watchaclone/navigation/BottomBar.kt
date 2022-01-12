package com.example.watchaclone.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationBar(
    navController: NavHostController
) {
    BottomAppBar(
        backgroundColor = Color.White,
        elevation = 8.dp,
        modifier = Modifier
            .fillMaxWidth(),
        content = {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                BottomNavigationBarUnit(
                    onClicked = { /*TODO*/ },
                    navIcon = Icons.Filled.Home,
                    navTitle = "홈"
                )
                BottomNavigationBarUnit(
                    onClicked = { /*TODO*/ },
                    navIcon = Icons.Filled.Search,
                    navTitle = "검색"
                )
                BottomNavigationBarUnit(
                    onClicked = { /*TODO*/ },
                    navIcon = Icons.Filled.Star,
                    navTitle = "평가"
                )
                BottomNavigationBarUnit(
                    onClicked = { /*TODO*/ },
                    navIcon = Icons.Filled.Message,
                    navTitle = "소식"
                )
                BottomNavigationBarUnit(
                    onClicked = { /*TODO*/ },
                    navIcon = Icons.Filled.Person,
                    navTitle = "나의 왓챠"
                )
            }
        }
    )
}

@Composable
fun BottomNavigationBarUnit(
    onClicked: () -> Unit,
    navIcon: ImageVector,
    navTitle: String
) {
    IconButton(
        modifier = Modifier.padding(horizontal = 4.dp),
        onClick = {
            onClicked()
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .size(32.dp),
                imageVector = navIcon,
                contentDescription = "${navIcon}"
            )
            Text(
                text = navTitle,
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarUnitPreview() {

}