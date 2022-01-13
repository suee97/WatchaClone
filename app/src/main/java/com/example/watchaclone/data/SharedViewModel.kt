package com.example.watchaclone.data

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor() : ViewModel(){

    // profile
    var userName = mutableStateOf("오승언")
    var userIntro = mutableStateOf("소개를 추가해주세요")
    var userFollower = mutableStateOf(12)
    var userFollowing = mutableStateOf(29)
    var userRating = mutableStateOf(410)
    var userComment = mutableStateOf(74)

}