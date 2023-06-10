package com.example.jadid

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun login(navController: NavHostController) {
    Column() {
        Text(text = "login")
        Button(onClick = { navController.navigate(Welcome.route) }) {
            Text(text = "Login")
        }
    }
}