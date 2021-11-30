package com.example.unirates.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val routeName: String,
    val icon: ImageVector,
) {
    object Home: NavItem(
        routeName = "home",
        icon = Icons.Default.Home
    )
    object Page2: NavItem(
        routeName = "page2",
        icon = Icons.Default.Edit
    )
    object Page3: NavItem(
        routeName = "page3",
        icon = Icons.Default.PlayArrow
    )
    object Page4: NavItem(
        routeName = "page4",
        icon = Icons.Default.Person
    )
}