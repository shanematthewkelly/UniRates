package com.example.unirates.screens.testPages

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.example.unirates.helpers.Scale
import com.example.unirates.ui.theme.IBMFonts

@Composable
fun Page3(modifier: Modifier) {
    val primaryColor = MaterialTheme.colors.primaryVariant

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    )
    {
        Text(
            text = "Watch",
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            color = primaryColor,
            fontSize = Scale().fontSizeScale(fontSize = 27.0),
            fontFamily = IBMFonts,
            fontWeight = FontWeight.Bold
        )
    }
}