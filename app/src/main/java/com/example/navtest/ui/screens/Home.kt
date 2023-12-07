package com.example.navtest.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Home(
    toScreenA: () -> Unit,
    toScreenB: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Button(onClick = toScreenA ) {
            Text(text = "To ScreenA")
        }
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = toScreenB ) {
            Text(text = "To ScreenB")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Home(toScreenA = {}, toScreenB = {})
}