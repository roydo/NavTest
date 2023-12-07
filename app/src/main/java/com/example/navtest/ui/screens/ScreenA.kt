package com.example.navtest.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenA(
    modifier: Modifier = Modifier,
    toHome: () -> Unit
) {
    CommonScreen(
        screenName = "ScreenA",
        screenColor = Color.Red,
        toHome = toHome
    )
}