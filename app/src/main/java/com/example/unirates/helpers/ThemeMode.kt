package com.example.unirates.helpers

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ThemeMode(light: Color, dark: Color): Color {
    val suppliedThemeColor = if(isSystemInDarkTheme()) {
        dark
    } else {
        light
    }

    return suppliedThemeColor
}