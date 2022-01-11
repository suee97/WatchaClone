package com.example.watchaclone.ui.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.watchaclone.ui.theme.LightGrey
import com.example.watchaclone.ui.theme.MediumGrey
import com.example.watchaclone.ui.theme.Purple200
import com.example.watchaclone.ui.theme.Purple500
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun HomeScreen() {
    HomeTabBar()
}

@ExperimentalPagerApi
@Composable
fun HomeTabBar() {
    val pagerState = rememberPagerState()
    var tabIndex by remember { mutableStateOf(0) }
    val tabList = listOf("영화", "TV", "책", "웹툰")

    Column(
    ) {
        TabRow(
            modifier = Modifier
                .fillMaxWidth(.8f),
            selectedTabIndex = tabIndex,
            backgroundColor = Color.White,
            indicator = {},
            divider = {}
        ) {
            tabList.forEachIndexed { index, title ->
                Tab(
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(vertical = 4.dp)
                        .background(Purple200),
                    text = {
                        Text(
                            modifier = Modifier.border(1.dp, Color.Black),
                            text = title,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.ExtraBold
                        )
                    },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    selectedContentColor = Color.Black,
                    unselectedContentColor = LightGrey
                )
                Text("|")
            }
        }
    }
}

