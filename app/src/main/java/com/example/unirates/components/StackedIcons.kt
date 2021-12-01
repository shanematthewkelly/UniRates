package com.example.unirates.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.unirates.helpers.ThemeMode
import com.example.unirates.ui.theme.PrimaryDark
import com.example.unirates.ui.theme.PrimaryLight

@Composable
fun StackedIcon(
    outerColor: Color,
    icon: ImageVector,
    iconSize: Dp = 28.dp,
    iconTint: Color = ThemeMode(light = Color.White, dark = PrimaryLight),
    shapeWidth: Dp = 62.dp,
    shapeHeight: Dp = 60.dp,
    shapeRadius: Dp = 20.dp,
    onIconClicked: (Offset) -> Unit = {}
) {

    Box(contentAlignment = Alignment.Center) {
        Card(
            backgroundColor = outerColor,
            border = BorderStroke(
                width = 1.dp,
                color = PrimaryDark
            ),
            elevation = 0.dp,
            shape = RoundedCornerShape(shapeRadius),
            modifier = Modifier
                .height(shapeHeight)
                .width(shapeWidth),

            content = {},
        )
        Icon(
            icon,
            tint = iconTint,
            modifier = Modifier
                .size(iconSize)
                .pointerInput(Unit) {
                   detectTapGestures(
                       onTap = onIconClicked,
                   )
                },

            contentDescription = null,
        )
    }
}