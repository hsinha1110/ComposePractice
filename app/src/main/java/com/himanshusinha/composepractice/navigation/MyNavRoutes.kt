package com.himanshusinha.firstapp.jetpackcompose.c10_navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoutes {

    @Serializable
    object SettingsScreen : MyNavRoutes()

    @Serializable
    object ChangePasswordScreen : MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String) : MyNavRoutes()

}