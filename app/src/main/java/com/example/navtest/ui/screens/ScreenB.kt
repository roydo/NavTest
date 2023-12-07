package com.example.navtest.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenB(
    modifier: Modifier = Modifier,
    toHome: () -> Unit
) {
    CommonScreen(
        screenName = "ScreenB",
        screenColor = Color.Blue,
        toHome = toHome
    )
}