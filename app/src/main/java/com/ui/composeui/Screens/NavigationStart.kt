package com.ui.composeui.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ui.composeui.BottomNavigation.NavigationItem
import com.ui.composeui.Routes.Routes
import androidx.navigation.NavHost as NavHost1

@Composable
fun NavigationStart() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Login.routes,)
    {

        composable(route = Routes.Login.routes) {
            LoginPage(navController)
        }
        composable(route = Routes.Dashboard.routes) {
            Dashboard(navController)
        }
    }
}