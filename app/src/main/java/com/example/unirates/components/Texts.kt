package com.example.unirates.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import com.example.unirates.helpers.fontSizeScale
import com.example.unirates.ui.theme.IBMFonts

@Composable
fun TextContent(
    heading: String = "",
    fontColor: Color = MaterialTheme.colors.primaryVariant,
    fontWeight: FontWeight = FontWeight.Light,
    fontSize: TextUnit = fontSizeScale(fontSize = 27.0),
    maxLines: Int = 1,
    modifier: Modifier = Modifier
) {

    Text(
        text = heading,
        fontSize = fontSize,
        color = fontColor,
        fontWeight = fontWeight,
        maxLines = maxLines,
        overflow = TextOverflow.Ellipsis,
        fontFamily = IBMFonts,
        modifier = modifier
        )
}