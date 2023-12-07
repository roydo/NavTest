package com.example.navtest.ui.screens

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Screens {
    HOME,
    SCREEN_A,
    SCREEN_B
}

@Composable
fun Root(modifier: Modifier = Modifier) {
    // Create NavController
    val navController = rememberNavController()

    // Create NavHost
    NavHost(
        navController = navController,
        startDestination = Screens.HOME.name
    ) {
        composable(Screens.HOME.name) {
            Home(
                toScreenA = { navController.navigate(Screens.SCREEN_A.name) },
                toScreenB = { navController.navigate(Screens.SCREEN_B.name) },
                modifier = modifier
            )
        }

        composable(Screens.SCREEN_A.name) {
            ScreenA(toHome = { navController.navigate(Screens.HOME.name)})
        }

        composable(
            Screens.SCREEN_B.name,
            enterTransition = {
                fadeIn(
                    animationSpec = tween(300)
                ) + slideIntoContainer(
                    animationSpec = tween(300),
                    towards = AnimatedContentTransitionScope.SlideDirection.Start
                )
            }
        ) {
            ScreenB(toHome = {navController.navigate(Screens.HOME.name)})
        }
    }
}