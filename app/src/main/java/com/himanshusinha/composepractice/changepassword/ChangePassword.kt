package com.himanshusinha.composepractice.changepassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.himanshusinha.composepractice.settings.Settings

@Composable
fun ChangePassword(navController: NavHostController) {

    var currentPassword by remember { mutableStateOf("") }
    var newPassword by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Scaffold(
        topBar = { AppTopBarChange(navController) }
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF060923))
                .padding(paddingValues)
        ) {

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {

                item {

                    Spacer(modifier = Modifier.height(20.dp))

                    PasswordInput(
                        label = "Current Password",
                        value = currentPassword
                    ) {
                        currentPassword = it
                    }

                }

                item {

                    PasswordInput(
                        label = "New Password",
                        value = newPassword
                    ) {
                        newPassword = it
                    }
                }
                item {
                    PasswordInput(
                        label = "Confirm Password",
                        value = confirmPassword
                    ) {
                        confirmPassword = it
                    }

                }
                item {

                    Spacer(modifier = Modifier.height(25.dp))

                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF3B6BBE)
                        )
                    ) {

                        Text(
                            text = "Change Password",
                            color = Color.White,
                            fontSize = 16.sp
                        )

                    }

                }

            }

        }

    }
}
@Composable
fun PasswordInput(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {

    Column(
        modifier = Modifier.padding(vertical = 10.dp)
    ) {

        Text(
            text = label,
            color = Color.LightGray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(6.dp))

        TextField(
            value = value,
            onValueChange = onValueChange,
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(label, color = Color.Gray)
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock Icon", tint = Color.White)
            },

            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFF060923),
                unfocusedContainerColor = Color(0xFF060923),
                focusedIndicatorColor = Color(0xFF11162C),
                unfocusedIndicatorColor = Color(0xFF060923),
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White
            )
        )

    }

}
@Preview(showBackground = true)
@Composable
fun ChangePasswordPreview() {

    val navController = rememberNavController()

    ChangePassword(navController)

}