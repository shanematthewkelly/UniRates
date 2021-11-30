package com.example.unirates.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unirates.components.CustomAppBar
import com.example.unirates.helpers.Scale
import com.example.unirates.screens.home.components.MyCollege
import com.example.unirates.ui.theme.IBMFonts

@Composable
fun Home(modifier: Modifier) {
    Scaffold(backgroundColor = MaterialTheme.colors.surface) {
        Column() {
            CustomAppBar(
                menuItem1 = Icons.Default.Notifications,
            )
            Column(
                modifier
                    .fillMaxWidth(1f)
                    .padding(vertical = 25.dp, horizontal = 20.dp))
            {
                Text(
                    text = "Welcome",
                    color = MaterialTheme.colors.secondaryVariant,
                    fontSize = 21.sp,
                    fontFamily = IBMFonts,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Shane Matthew Kelly",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colors.secondary,
                    fontSize = Scale().fontSizeScale(fontSize = 27.0),
                    fontFamily = IBMFonts,
                    fontWeight = FontWeight.Bold
                )
                MyCollege()
            }
        }
    }
}