package com.example.unirates.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.unirates.components.CustomAppBar
import com.example.unirates.components.TextContent
import com.example.unirates.helpers.ThemeMode
import com.example.unirates.helpers.fontSizeScale
import com.example.unirates.helpers.heightScale
import com.example.unirates.helpers.widthScale
import com.example.unirates.screens.home.components.Categories
import com.example.unirates.screens.home.components.MyCollege
import com.example.unirates.ui.theme.PrimaryLight
import com.example.unirates.ui.theme.SubHeadingLight

@Composable
fun Home(modifier: Modifier) {
    Scaffold(backgroundColor = MaterialTheme.colors.surface) {
        Column {
            CustomAppBar(
                menuItem1 = Icons.Outlined.Notifications,
            )
            Column(
                modifier
                    .fillMaxWidth(1f)
                    .padding(
                        vertical = heightScale(height = 25.0).dp,
                        horizontal = widthScale(width = 20.0).dp
                    ))
            {
                TextContent(
                    heading = "Welcome",
                    fontColor = ThemeMode(light = SubHeadingLight, dark = PrimaryLight),
                    fontSize = fontSizeScale(fontSize = 21.0)
                )

                TextContent(
                    heading = "Shane Kelly",
                    fontWeight = FontWeight.Bold,
                )
                Categories()
                MyCollege()
            }
        }
    }
}

