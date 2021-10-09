package com.example.unirates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unirates.screens.GetStarted
import com.example.unirates.ui.theme.UniRatesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    UniRatesTheme {
        // Parent Widget
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.padding(
                horizontal = 20.dp)
        ) {
            GetStarted(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UniRatesTheme {
        GetStarted(Modifier)
    }
}