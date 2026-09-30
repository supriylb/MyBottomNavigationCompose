package com.example.mybottomnavigationcompose.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mybottomnavigationcompose.R

sealed class Screen(
    val route: String,
    @StringRes val titleRes: Int,
    val icon: ImageVector,
) {
    data object Home : Screen(
        route = "home",
        titleRes = R.string.title_home,
        icon = Icons.Default.Home,
    )

    data object Dashboard : Screen(
        route = "dashboard",
        titleRes = R.string.title_dashboard,
        icon = Icons.Default.Dashboard,
    )

    data object Notifications : Screen(
        route = "notifications",
        titleRes = R.string.title_notifications,
        icon = Icons.Default.Notifications,
    )

    data object Profile : Screen(
        route = "profile",
        titleRes = R.string.title_profile,
        icon = Icons.Default.AccountCircle,
    )

    companion object {
        val items = listOf(
            Home,
            Dashboard,
            Notifications,
            Profile,
        )
    }
}
