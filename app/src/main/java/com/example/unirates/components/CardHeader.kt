package com.example.unirates.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unirates.helpers.Scale
import com.example.unirates.helpers.ThemeMode
import com.example.unirates.ui.theme.IBMFonts
import com.example.unirates.ui.theme.PrimaryLight
import com.example.unirates.ui.theme.SecondaryLight

@Composable
fun CardHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            backgroundColor = SecondaryLight,
            elevation = 0.dp,
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.width(160.dp)
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                TextContent(
                    heading = "Dun Laoghaire Institute",
                    fontColor = ThemeMode(light = Color.White, dark = PrimaryLight),
                    fontSize = Scale().fontSizeScale(fontSize = 14.0),
                    modifier = Modifier.padding(
                        horizontal = 15.dp,
                        vertical = 8.dp
                    )
                )
            }
        }

        StackedIcon(
            outerColor = SecondaryLight,
            icon = Icons.Outlined.MoreVert,
            iconSize = 20.dp,
            iconTint = ThemeMode(light = Color.White, dark = PrimaryLight),
            shapeHeight = 35.dp,
            shapeWidth = 35.dp,
            shapeRadius = 40.dp,
            )
    }
}