package com.example.unirates.screens.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.unirates.components.StackedIcon
import com.example.unirates.helpers.Scale
import com.example.unirates.helpers.ThemeMode
import com.example.unirates.ui.theme.BottomNavDarkIcons
import com.example.unirates.ui.theme.PrimaryDark
import com.example.unirates.ui.theme.SecondaryDark

@Composable
    fun Categories() {
    val themedValue = ThemeMode(light = PrimaryDark, dark = SecondaryDark)

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                Scale().widthScale(width = 15.0).dp
            ),
            modifier = Modifier.padding(
                top = 20.dp
            )
        ) {
            StackedIcon(
                outerColor = themedValue,
                icon = Icons.Outlined.FavoriteBorder,
            )

            StackedIcon(
                outerColor = Color.Transparent,
                icon = Icons.Outlined.ExitToApp,
                iconTint = ThemeMode(light = PrimaryDark, dark = BottomNavDarkIcons)
            )
        }
    }