package com.example.watchaclone.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.watchaclone.R
import com.example.watchaclone.data.models.MoviePoster

@Composable
fun MoviePosterSlider(
    sliderTitle: String,
    MoviePosterSliderList: List<MoviePoster>
) {
    Column(
        modifier = Modifier
            .padding(start = 8.dp)
    ) {
        Text(
            modifier = Modifier.padding(4.dp),
            text = sliderTitle,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow() {
            items(MoviePosterSliderList.size) { index ->
                SingleMoviePoster(moviePoster = MoviePosterSliderList[index])
            }
        }
    }
}

@Composable
fun SingleMoviePoster(moviePoster: MoviePoster) {
    Column(
        modifier = Modifier
            .padding(4.dp)
            .width(115.dp)
            .height(200.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(6.dp)),
            painter = moviePoster.img,
            contentDescription = moviePoster.title
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = moviePoster.title,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SingleMoviePosterPreview() {
    SingleMoviePoster(
        moviePoster = MoviePoster(
            title = "인셉션",
            img = painterResource(id = R.drawable.inception_poster)
        )
    )
}