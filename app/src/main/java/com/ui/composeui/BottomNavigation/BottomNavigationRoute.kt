package com.ui.composeui.BottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ui.composeui.Screens.HomeScreen
import com.ui.composeui.Screens.ListScreen

@Composable
fun BottomNavigationRoute(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.List.route) {
            ListScreen()
        }
    }
}