package com.example.unirates.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class GetStarted : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetStarted(Modifier)
        }
    }
}

@Composable
fun GetStarted(modifier: Modifier) {
    // Write here...
}