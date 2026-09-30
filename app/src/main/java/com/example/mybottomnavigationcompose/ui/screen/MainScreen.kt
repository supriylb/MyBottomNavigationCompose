package com.example.mybottomnavigationcompose.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mybottomnavigationcompose.ui.navigation.Screen

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomBar(
                currentRoute = currentRoute,
                onItemSelect = { screen ->
                    navController.navigateToScreen(screen)
                },
            )
        },
    ) { innerPadding ->
        AppNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding),
        )
    }
}

@Composable
private fun BottomBar(
    currentRoute: String?,
    onItemSelect: (Screen) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
    ) {
        Screen.items.forEach { screen ->
            val label = stringResource(screen.titleRes)
            NavigationBarItem(
                selected = currentRoute == screen.route,
                onClick = { onItemSelect(screen) },
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = label,
                    )
                },
                label = {
                    Text(text = label)
                },
            )
        }
    }
}

@Composable
private fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier,
    ) {
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Dashboard.route) {
            DashboardScreen()
        }
        composable(Screen.Notifications.route) {
            NotificationsScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
    }
}

private fun NavHostController.navigateToScreen(screen: Screen) {
    navigate(screen.route) {
        popUpTo(graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}
