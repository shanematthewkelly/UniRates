package com.example.unirates.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.unirates.screens.home.Home
import com.example.unirates.screens.testPages.Page2
import com.example.unirates.screens.testPages.Page3
import com.example.unirates.screens.testPages.Page4

@Composable
fun NavController(controller: NavHostController) {
    NavHost(
        navController = controller,
        startDestination = NavItem.Home.routeName)
    {
        composable(NavItem.Home.routeName) { Home(Modifier) }
        composable(NavItem.Page2.routeName) { Page2(Modifier) }
        composable(NavItem.Page3.routeName) { Page3(Modifier) }
        composable(NavItem.Page4.routeName) { Page4(Modifier) }
    }
}