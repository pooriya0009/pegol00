package com.example.jadid

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destination {
    val route: String
    val icon: ImageVector
    val title: String
}

object Login : Destination {
    override val route: String = "Login"
    override val icon: ImageVector = Icons.Filled.Home
    override val title: String = "Login"
}

object Welcome : Destination {
    override val route: String = "Welcome"
    override val icon: ImageVector = Icons.Filled.Settings
    override val title: String = "Welcome"
}