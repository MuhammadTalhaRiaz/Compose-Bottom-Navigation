package com.ui.composeui.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ui.composeui.BottomNavigation.BottomNavigationBar
import com.ui.composeui.BottomNavigation.BottomNavigationRoute
import com.ui.composeui.R
import com.ui.composeui.Utils.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(navHostController: NavHostController) {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar(navController) },
        content = { padding -> // We have to pass the scaffold inner padding to our content. That's why we use Box.
            Box(modifier = Modifier.padding(padding)) {
                BottomNavigationRoute(navController = navController)
            }
        },
        containerColor = colorResource(R.color.white) // Set background color to avoid the white flashing when you switch between screens
    )
}

