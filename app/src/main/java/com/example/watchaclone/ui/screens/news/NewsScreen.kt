package com.example.watchaclone.ui.screens.news

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EventAvailable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.utils.Constants.TOP_BAR_FONT_SIZE
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun NewsScreen(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Scaffold(
        topBar = {
            NewsScreenTopBar(navController = navController)
        },
        content = {
            var tabIndex by remember { mutableStateOf(0) }
            val tabTitles = listOf("내 소식", "친구소식")
            val pagerState = rememberPagerState()

            Column {
                TabRow(
                    selectedTabIndex = tabIndex,
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            Modifier.pagerTabIndicatorOffset(
                                pagerState,
                                tabPositions
                            )
                        )
                    }
                ) {
                    tabTitles.forEachIndexed { i, title ->
                        Tab(
                            selected = tabIndex == i,
                            onClick = { tabIndex = i },
                            text = { Text(text = title) }
                        )
                    }
                }
                HorizontalPager(
                    count = tabTitles.size,
                    state = pagerState
                ) { tabIndex ->
                    Text(
                        tabIndex.toString(),
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Green)
                    )
                }
            }
        }
    )
}

@Composable
fun NewsScreenTopBar(
    navController: NavHostController
) {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 0.dp,
        title = {
            Text(
                text = "소식",
                fontWeight = FontWeight.Bold,
                fontSize = TOP_BAR_FONT_SIZE
            )
        },
        actions = {
            IconButton(onClick = {
                navController.navigate("news/event")
            }) {
                Icon(
                    imageVector = Icons.Filled.EventAvailable,
                    contentDescription = "Event Available"
                )
            }
        }
    )
}