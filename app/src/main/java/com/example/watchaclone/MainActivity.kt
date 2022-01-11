package com.example.watchaclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.painterResource
import com.example.watchaclone.data.models.MoviePoster
import com.example.watchaclone.ui.screens.home.HomeScreen
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val a1 = MoviePoster(
                title = "인셉션",
                img = painterResource(id = R.drawable.inception_poster)
            )

            val a2 = MoviePoster(
                title = "인셉션",
                img = painterResource(id = R.drawable.inception_poster)
            )

            val a3 = MoviePoster(
                title = "인셉션",
                img = painterResource(id = R.drawable.inception_poster)
            )

            val a4 = MoviePoster(
                title = "인셉션",
                img = painterResource(id = R.drawable.inception_poster)
            )

//            MoviePosterSlider(
//                sliderTitle = "박스오피스 순위",
//                MoviePosterSliderList = listOf(a1, a2, a3, a4)
//            )

            HomeScreen()
        }
    }
}
