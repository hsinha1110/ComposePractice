package com.himanshusinha.composepractice.changepassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBarChange(navController: NavHostController) {

    CenterAlignedTopAppBar(

        title = {
            Text(
                text = "Change Password",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF060923),
            titleContentColor = Color.White
        ),

        navigationIcon = {

            IconButton(
                onClick = {
                    navController.popBackStack()
                }
            ) {

                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF11162C)),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Back",
                        tint = Color.White
                    )

                }

            }

        }

    )

}