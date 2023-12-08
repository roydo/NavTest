package com.example.navtest.ui.screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ScreenB(
    modifier: Modifier = Modifier,
    toHome: () -> Unit
) {
    CommonScreen(
        modifier = modifier,
        screenName = "ScreenB",
        screenColor = MaterialTheme.colorScheme.secondary,
        toHome = toHome
    )
}