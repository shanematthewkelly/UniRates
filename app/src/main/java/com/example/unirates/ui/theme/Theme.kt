    package com.example.unirates.ui.theme

    import android.annotation.SuppressLint
    import androidx.compose.foundation.isSystemInDarkTheme
    import androidx.compose.material.MaterialTheme
    import androidx.compose.material.darkColors
    import androidx.compose.material.lightColors
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.graphics.Color

    private val LightColorPalette = lightColors(

        // Paints
        surface = CanvasLight,
        primary = PrimaryLight,
        secondary = SecondaryLight,

        // Texts & Icons
        primaryVariant = HeadingLight,
        secondaryVariant = SubHeadingLight,

        // Bottom Navigation Icons
        onPrimary = BottomNavLightIcons
    )

    @SuppressLint("ConflictingOnColor")
    private val DarkColorPalette = darkColors(

        // Paints
        surface = CanvasDark,
        primary = PrimaryDark,
        secondary = SecondaryDark,

        // Texts & Icons
        primaryVariant = HeadingDark,
        secondaryVariant = SubHeadingDark,

        // Bottom Navigation Icons
        onPrimary = BottomNavDarkIcons
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