package com.example.navtest.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonScreen(
    modifier: Modifier = Modifier,
    screenName: String,
    screenColor: Color,
    toHome: () -> Unit
) {
    Surface(
        color = screenColor,
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "This screen is $screenName",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
            )
            ElevatedButton(
                onClick = toHome,
                modifier = Modifier
                    .padding(top = 16.dp)
            ) {
                Text(text = "HOME")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CommonScreenPreview() {
    CommonScreen(screenName = "Test", screenColor = MaterialTheme.colorScheme.primary) {

    }
}