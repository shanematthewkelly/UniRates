package com.example.unirates.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home(Modifier)
        }
    }
}

@Composable
fun Home(modifier: Modifier) {
    val primaryColor = MaterialTheme.colors.primary
    val secondaryColor = MaterialTheme.colors.secondary

    Column(
        modifier
            .fillMaxWidth(1f)
            .fillMaxHeight(.4f)
            .padding(top = 40.dp)
    ) {
        Text(
            text = "Welcome",
            color = secondaryColor,
            fontSize = 23.sp
        )
        Text(
            text = "Shane Matthew Kelly",
            color = primaryColor,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
    }
}