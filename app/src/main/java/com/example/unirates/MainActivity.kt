package com.example.unirates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.unirates.navigation.BottomNav
import com.example.unirates.screens.home.Home
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
        Scaffold() {
            BottomNav()
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
