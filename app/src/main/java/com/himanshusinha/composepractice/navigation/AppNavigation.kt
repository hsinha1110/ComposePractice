package com.himanshusinha.composepractice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.himanshusinha.composepractice.settings.Settings
import com.himanshusinha.composepractice.changepassword.ChangePassword
import com.himanshusinha.firstapp.jetpackcompose.c10_navigation.MyNavRoutes

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.SettingsScreen
    ) {

        composable<MyNavRoutes.SettingsScreen> {
            Settings(navController)
        }

        composable<MyNavRoutes.ChangePasswordScreen> {
            ChangePassword(navController)
        }

    }

}