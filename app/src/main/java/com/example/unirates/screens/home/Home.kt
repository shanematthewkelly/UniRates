package com.example.unirates.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unirates.components.CustomAppBar
import com.example.unirates.screens.home.components.MyCollege
import com.example.unirates.ui.theme.IBMFonts

@Composable
fun Home(modifier: Modifier) {
    val primaryColor = MaterialTheme.colors.primaryVariant
    val secondaryColor = MaterialTheme.colors.onPrimary

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
                color = secondaryColor,
                fontSize = 21.sp,
                fontFamily = IBMFonts,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Shane Matthew Kelly",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = primaryColor,
                fontSize = 28.sp,
                fontFamily = IBMFonts,
                fontWeight = FontWeight.Bold
            )
            MyCollege()
        }
    }
}