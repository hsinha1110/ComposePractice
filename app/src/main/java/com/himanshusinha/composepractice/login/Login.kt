package com.himanshusinha.composepractice.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.himanshusinha.composepractice.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login() {

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        )

        Text(
            text = "Welcome Back",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Login to your account",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            value = userName,
            label = { Text("Username") },
            onValueChange = { userName = it }
        )

        Spacer(modifier = Modifier.height(16.dp))


        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            visualTransformation =
                if (passwordVisible) VisualTransformation.None
                else PasswordVisualTransformation(),
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(50.dp),
            onClick = { }
        ) {
            Text(
                text = "Login",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Forgot Password?",
            fontSize = 18.sp,
            modifier = Modifier.clickable { }
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Or sign in with",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = "Google Login",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { }
            )

            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = "Facebook Login",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { }
            )

            Image(
                painter = painterResource(R.drawable.twitter),
                contentDescription = "Twitter Login",
                modifier = Modifier
                    .size(50.dp)
                    .clickable { }
            )
        }
    }
}