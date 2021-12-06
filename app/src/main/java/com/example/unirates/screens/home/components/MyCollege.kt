package com.example.unirates.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.unirates.R
import com.example.unirates.components.CardHeader
import com.example.unirates.components.TextContent
import com.example.unirates.helpers.fontSizeScale
import com.example.unirates.helpers.heightScale

@Composable
fun MyCollege() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(
                vertical = heightScale(height = 30.0).dp
            ),
        horizontalAlignment = Alignment.Start
    ) {
        TextContent(
            heading = "My College",
            fontSize = fontSizeScale(fontSize = 18.0),
            fontWeight = FontWeight.Bold

        )

        Card(
            backgroundColor = MaterialTheme.colors.primary,
            elevation = 12.dp,
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(200.dp)
                .padding(top = 10.dp)
        ) {
            Box {
                // ExperimentalMaterialApi is stopping from image showing up
                Image(
                    painter = painterResource(id = R.drawable.iadt),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                CardHeader()
            }
        }
    }
}