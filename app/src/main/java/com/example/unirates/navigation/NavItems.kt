package com.example.unirates.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val name: String,
    val routeName: String,
    val icon: ImageVector,
) {
    object Home: NavItem(
        name = "Home",
        routeName = "home",
        icon = Icons.Default.Home
    )
    object Page2: NavItem(
        name = "Page2",
        routeName = "page2",
        icon = Icons.Default.Edit
    )
    object Page3: NavItem(
        name = "Page3",
        routeName = "page3",
        icon = Icons.Default.PlayArrow
    )
    object Page4: NavItem(
        name = "Page4",
        routeName = "page4",
        icon = Icons.Default.Person
    )
}