package com.example.unirates.helpers

import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// Review[fontSizeScale()]: This function is scaling texts good, but not precisely.

    private val screenHeight: Double = Resources.getSystem().displayMetrics.heightPixels.toDouble()
    private val screenWidth: Double = Resources.getSystem().displayMetrics.widthPixels.toDouble()

    @Composable
    fun heightScale(height: Double): Double {
        val screenHeight: Double = screenHeight

        val localHeightDensity: Double = with(LocalDensity.current) { (height / density) }
        return (localHeightDensity / 896.0) * screenHeight

    }

    @Composable
    fun widthScale(width: Double): Double {
        val screenWidth: Double = screenWidth

        val localWidthDensity: Double = with(LocalDensity.current) { (width / density) }
        return (localWidthDensity / 414.0) * screenWidth
    }

    @Composable
    fun fontSizeScale(fontSize: Double): TextUnit {
        return with(LocalDensity.current) { (fontSize / fontScale).sp }
    }