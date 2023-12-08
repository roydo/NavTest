package com.example.navtest.ui.screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenA(
    modifier: Modifier = Modifier,
    toHome: () -> Unit
) {
    CommonScreen(
        modifier = modifier,
        screenName = "ScreenA",
        screenColor = MaterialTheme.colorScheme.primary,
        toHome = toHome
    )
}