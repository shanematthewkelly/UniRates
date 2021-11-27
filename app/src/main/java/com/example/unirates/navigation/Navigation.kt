package com.example.unirates.navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.unirates.helpers.Scale

@Composable
    fun BottomNav() {
        val navController = rememberNavController()
        Scaffold(
            bottomBar = { BottomNavUI(controller = navController) }
        ) {
            NavController(controller = navController)
        }
    }

    @Composable
    fun BottomNavUI(controller: NavHostController) {
        val screens = listOf(
            // routes
            NavItem.Home,
            NavItem.Page2,
            NavItem.Page3,
            NavItem.Page4,
        )

        val navBackStackEntry by controller.currentBackStackEntryAsState()
        val destination = navBackStackEntry?.destination

            BottomNavigation(
                backgroundColor = Color.Black,
                elevation = 8.dp,
                modifier = Modifier
                    .padding(
                        vertical = Scale().heightScale(height = 20.0).dp,
                        horizontal = Scale().widthScale(width = 40.0).dp
                    )
                    .shadow(
                        elevation = 8.dp,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .clip(RoundedCornerShape(20.dp)),

                ) {
                screens.forEach { screen ->
                    AddItemToNavigation(
                        screen = screen,
                        destination = destination,
                        controller = controller,
                    )
                }
            }
        }

    @Composable
    fun RowScope.AddItemToNavigation(
        screen: NavItem,
        destination: NavDestination?,
        controller: NavHostController
    ) {
        BottomNavigationItem(
            selectedContentColor = Color.White,
            alwaysShowLabel = false,
            icon = {
                Icon(
                    imageVector = screen.icon,
                    contentDescription = "Nav Icon"
                )
            },
            selected = destination?.hierarchy?.any {
                it.route == screen.routeName
            } == true,

            onClick = {
                controller.navigate(screen.routeName) {
                    popUpTo(controller.graph.findStartDestination().id)
                    launchSingleTop = true
                }
                      },
        )
    }