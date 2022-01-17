package com.example.watchaclone.ui.screens.home

import com.example.watchaclone.R

sealed class MovieItem(
    val title: String,
    val posterResource: Int
) {
    object SpiderMan1: MovieItem("스파이더맨: 노 웨이 홈", R.drawable.spiderman)
    object SpiderMan2: MovieItem("해적: 도깨비 깃발", R.drawable.spiderman)
    object SpiderMan3: MovieItem("씽2게더", R.drawable.spiderman)
    object SpiderMan4: MovieItem("특송", R.drawable.spiderman)
    object SpiderMan5: MovieItem("웨스트 사이드 스토리", R.drawable.spiderman)
}