    package com.example.unirates.ui.theme

    import androidx.compose.foundation.isSystemInDarkTheme
    import androidx.compose.material.MaterialTheme
    import androidx.compose.material.darkColors
    import androidx.compose.material.lightColors
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.graphics.Color

    // Light Theme
    private val LightColorPalette = lightColors(
        surface = CanvasLight,
        primary = PrimaryLight,
        secondary = SecondaryLight,
        secondaryVariant = SubHeadingLight
    )

    // Dark Theme
    private val DarkColorPalette = darkColors(
        surface = CanvasDark,
        primary = PrimaryDark,
        secondary = SecondaryDark,
        secondaryVariant = SubHeadingDark
    )

    @Composable
    fun UniRatesTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
        val colors = if (darkTheme) {
            DarkColorPalette
        } else {
            LightColorPalette
        }

        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }