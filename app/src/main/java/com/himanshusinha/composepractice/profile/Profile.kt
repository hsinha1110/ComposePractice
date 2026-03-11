package com.himanshusinha.composepractice.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Profile(navController: NavHostController) {

    var userName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var dob by remember { mutableStateOf("") }

    Scaffold(
        topBar = { AppTopBar() }
    ) { paddingValues ->

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(bottom = 20.dp)
        ) {

            TextField(
                value = userName,
                onValueChange = { userName = it },
                placeholder = {
                    Text("Enter your name")
                },
                label = { Text("Username") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.LightGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color.Gray

                )
            )
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                placeholder = {
                    Text("Enter your email")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.LightGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color.Gray

                )
            )
            TextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text("Phone") },
                placeholder = {
                    Text("Enter your phone")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.LightGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color.Gray

                )
            )
            TextField(
                value = gender,
                onValueChange = { gender = it },
                label = { Text("Gender") },
                placeholder = {
                    Text("Enter your gender")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.LightGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color.Gray

                )

            )
            TextField(
                value = dob,
                onValueChange = { dob = it },
                label = { Text("Date of Birth") },
                placeholder = {
                    Text("Enter your dob")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 20.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.LightGray,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedLabelColor = Color.Gray
                )
            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview() {

    val navController = rememberNavController()

    Profile(navController)

}