package com.example.watchaclone.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.watchaclone.data.SharedViewModel
import com.example.watchaclone.R
import com.example.watchaclone.ui.theme.VeryLightGrey
import com.example.watchaclone.utils.Constants.CONTENT_HORIZONTAL_PADDING
import com.example.watchaclone.utils.Constants.SEMI_TITLE

@Composable
fun ProfileScreen(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Scaffold(
        topBar = {
            ProfileScreenTopBar()
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(VeryLightGrey)
            ) {
                ProfileBasic(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        },
    )
}

@Composable
fun ProfileScreenTopBar() {
    TopAppBar(
        title = {},
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    imageVector = Icons.Filled.PersonAdd,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        },
        backgroundColor = Color.Transparent,
        elevation = 0.dp
    )
}

@Composable
fun ProfileBasic(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = CONTENT_HORIZONTAL_PADDING)
        ) {
            Text(
                text = viewModel.userName.value,
                fontSize = SEMI_TITLE,
                fontWeight = FontWeight.Bold
            )
            Row(){
                Text(text = "팔로워")
                Text(text = viewModel.userFollower.value.toString())
                Text(text = "팔로잉")
                Text(text = viewModel.userFollowing.value.toString())
            }
            Text(text = viewModel.userIntro.value)
            EditProfileButton(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}

@Composable
fun EditProfileButton(
    navController: NavHostController,
    viewModel: SharedViewModel
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, Color.Black)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier.padding(vertical = 8.dp),
                text = "프로필 수정",
                fontSize = 20.sp
            )
        }
    }
}