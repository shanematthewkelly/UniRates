package com.example.unirates.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.unirates.R
import com.example.unirates.helpers.widthScale

@Composable
fun CustomAppBar(
    title: String = "",
    menuItem1: ImageVector = Icons.Outlined.Notifications,
    menuItem2: ImageVector = Icons.Outlined.MoreVert,
    menuItemColors: Color = MaterialTheme.colors.primaryVariant,
) {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier
            .height(80.dp)
            .padding(start = 15.dp),
        title = { Text(title) },
        elevation = 0.dp,
        actions = {
            AppBarItems(
                menuItem1,
                menuItem2,
                menuItemColors,)
                  },
        navigationIcon = { UserPhoto() }
    )
}

@Composable
fun AppBarItems(
    menuItem1: ImageVector, menuItem2: ImageVector, menuItemColors: Color) {
    IconButton(onClick = { }) {
        Icon(menuItem1,
            tint = menuItemColors,
            modifier = Modifier.size(28.dp),
            contentDescription =  "Item1",
        )
    }
    IconButton(onClick = { }) {
        Icon(menuItem2,
            tint = menuItemColors,
            modifier = Modifier.size(28.dp),
            contentDescription = "Item2",
        )
    }
}

@Composable
fun UserPhoto() {
    Image(
        painter = painterResource(R.drawable.shane),
        contentDescription = "User Photo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(widthScale(width = 45.0).dp)
            .clip(CircleShape)
        )
}