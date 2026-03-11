package com.himanshusinha.composepractice.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.himanshusinha.composepractice.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppTopBar() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Blue)
    ) {

        CenterAlignedTopAppBar(
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
            },

            actions = {
                Text(
                    text = "Save",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .clickable {
                            // click action
                        }
                )
            },

            title = {
                Text(
                    text = "Edit Profile",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            },

            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color.Blue,
                titleContentColor = Color.White
            )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .offset(x = 6.dp, y = 6.dp)
                        .clip(CircleShape)
                        .background(Color.DarkGray),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.camera),
                        contentDescription = "Camera",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}