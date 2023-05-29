package com.ui.composeui.BottomNavigation

import com.ui.composeui.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.baseline_home_24, "Home")
    object List : NavigationItem("list", R.drawable.baseline_format_list_bulleted_24, "List")
//    object Movies : NavigationItem("movies", R.drawable.ic_movie, "Movies")
//    object Books : NavigationItem("books", R.drawable.ic_book, "Books")
//    object Profile : NavigationItem("profile", R.drawable.ic_profile, "Profile")
}