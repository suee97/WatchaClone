package com.example.watchaclone.ui.screens.profile.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.utils.Constants.TOP_BAR_FONT_SIZE

@Composable
fun ProfileSettingScreen(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Scaffold(
        topBar = {
            ProfileSettingTopAppBar(navController = navController)
        },
        content = {
            ProfileSettingList(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}

@Composable
fun ProfileSettingTopAppBar(
    navController: NavHostController
) {
    TopAppBar(
        backgroundColor = Color.White,
        title = {
            Text(
                text = "설정",
                fontSize = TOP_BAR_FONT_SIZE,
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                navController.navigate("profile") {
                    popUpTo("profile") { inclusive = true }
                }
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Arrow Back"
                )
            }
        }
    )
}

@Composable
fun ProfileSettingList(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        ProfileSettingListUnit(navController = navController, title = "내 설정")
        ProfileSettingListUnit(navController = navController, title = "공개 범위")
        ProfileSettingListUnit(navController = navController, title = "알림")
        Divider()
        ProfileSettingListUnit(navController = navController, title = "서비스 설정")
        ProfileSettingListUnit(navController = navController, title = "SNS 설정")
        Divider()
        ProfileSettingListUnit(navController = navController, title = "공지사항")
        ProfileSettingListUnit(navController = navController, title = "고객센터")
        ProfileSettingListUnit(navController = navController, title = "왓챠피디아 정보")
    }
}

@Composable
fun ProfileSettingListUnit(
    navController: NavHostController,
    title: String
) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clickable { }) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            text = title,
            fontSize = 18.sp
        )
    }
}