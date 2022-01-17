package com.example.watchaclone.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.utils.Constants.CONTENT_HORIZONTAL_PADDING
import com.example.watchaclone.utils.Constants.POSTER_SIZE
import com.example.watchaclone.utils.Constants.SEMI_TITLE
import com.example.watchaclone.utils.Constants.TOP_BAR_FONT_SIZE
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    val movieList = listOf(
        MovieItem.SpiderMan1,
        MovieItem.SpiderMan2,
        MovieItem.SpiderMan3,
        MovieItem.SpiderMan4,
        MovieItem.SpiderMan5
    )

    Scaffold(
        topBar = {},
        content = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                MovieLazyUnit(
                    title = "박스오피스 순위",
                    movieList = movieList
                )
            }
        }
    )
}

@ExperimentalPagerApi
@Composable
fun MovieLazyUnit(
    title: String,
    movieList: List<MovieItem>
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(bottom = 4.dp),
                text = title,
                fontSize = SEMI_TITLE,
                fontWeight = FontWeight.Bold
            )
            Icon(
                modifier = Modifier.size(32.dp),
                imageVector = Icons.Filled.ChevronRight,
                contentDescription = "ChevronRight",
                tint = Color.Gray
            )
        }
        LazyRow {
            items(movieList.size) { i ->
                Column(
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .width(POSTER_SIZE)
                            .clip(RoundedCornerShape(4.dp)),
                        painter = painterResource(id = movieList[i].posterResource),
                        contentDescription = movieList[i].title
                    )
                    Text(
                        modifier = Modifier.width(POSTER_SIZE),
                        text = movieList[i].title
                    )
                }
            }
        }
    }
}