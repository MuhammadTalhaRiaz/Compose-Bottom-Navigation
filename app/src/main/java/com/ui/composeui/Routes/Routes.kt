package com.ui.composeui.Routes

sealed class Routes(val routes: String){
    object Login : Routes("Login")
    object Dashboard : Routes("Dashboard")
}