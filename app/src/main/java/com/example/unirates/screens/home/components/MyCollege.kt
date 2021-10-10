package com.example.unirates.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyCollege() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(vertical = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            backgroundColor = MaterialTheme.colors.primary,
            elevation = 8.dp,
            shape = RoundedCornerShape(12.dp),
            content = {},
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(160.dp)
        )
    }
}