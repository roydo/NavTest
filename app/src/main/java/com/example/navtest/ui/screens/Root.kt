package com.example.navtest.ui.screens

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
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

        /* horizontally
        composable(
            Screens.SCREEN_A.name,
            enterTransition = {
                slideInHorizontally(
                    animationSpec = tween(300),
                    initialOffsetX = { -it } // from left
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    animationSpec = tween(300),
                    targetOffsetX = { -it }
                )
            }
        ) {
            ScreenA(toHome = { navController.navigate(Screens.HOME.name) })
        }

        composable(
            Screens.SCREEN_B.name,
            enterTransition = {
                slideInHorizontally(
                    animationSpec = tween(300),
                    initialOffsetX = { it } // from right
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    animationSpec = tween(300),
                    targetOffsetX = { it }
                )
            }
        ) {
            ScreenB(toHome = { navController.navigate(Screens.HOME.name) })
        } */

        // vertically
        composable(
            Screens.SCREEN_A.name,
            enterTransition = {
                slideInVertically(
                    animationSpec = tween(300),
                    initialOffsetY = { -it } // from top
                )
            },
            exitTransition = {
                slideOutVertically(
                    animationSpec = tween(300),
                    targetOffsetY = { -it }
                )
            }
        ) {
            ScreenA(toHome = { navController.navigate(Screens.HOME.name) })
        }

        composable(
            Screens.SCREEN_B.name,
            enterTransition = {
                slideInVertically(
                    animationSpec = tween(300),
                    initialOffsetY = { it } // from bottom
                )
            },
            exitTransition = {
                slideOutVertically(
                    animationSpec = tween(300),
                    targetOffsetY = { it }
                )
            }
        ) {
            ScreenB(toHome = { navController.navigate(Screens.HOME.name) })
        }
    }
}