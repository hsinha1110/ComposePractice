package com.himanshusinha.composepractice.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.himanshusinha.firstapp.jetpackcompose.c10_navigation.MyNavRoutes

@Composable
fun Settings(navController: NavHostController) {

    val settingsItems = listOf(
        "Language",
        "My Profile",
        "Contact Us",
        "Security",
        "Change Password",
        "Privacy Policy"
    )

    Scaffold(
        topBar = { AppTopBarSettings(navController) }
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF060923))
                .padding(paddingValues)
        ) {

            LazyColumn {

                items(settingsItems) { item ->

                    SettingsItem(
                        title = item,
                        onClick = {
                            if (item == "Change Password") {
                                navController.navigate(
                                    MyNavRoutes.ChangePasswordScreen
                                )
                            }
                        }
                    )

                }

            }

        }

    }

}

@Composable
fun SettingsItem(title: String, onClick: () -> Unit) {

    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick() }
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = title,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )

            Box(
                modifier = Modifier
                    .size(45.dp)
                    .clip(CircleShape)
                    .background(Color(0xFF11162C)),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Next",
                    tint = Color.White
                )

            }

        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp),
            thickness = DividerDefaults.Thickness,
            color = Color(0xFF1F2A44)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {

    val navController = rememberNavController()

    Settings(navController)

}