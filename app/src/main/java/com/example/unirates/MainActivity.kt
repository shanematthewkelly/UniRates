package com.example.unirates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unirates.screens.Home
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
            color = MaterialTheme.colors.background)
            {
                Home(Modifier)
            }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UniRatesTheme {
        Home(Modifier)
    }
}