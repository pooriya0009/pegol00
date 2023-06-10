package com.example.jadid

import androidx.compose.material3.Icon
import androidx.compose.material3.Text as Text107
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material.*
import androidx.compose.material3.*

@Composable
fun MyBottomNavigation(navController: NavController){
    val destonationList = listOf<Destination>( Login , Welcome)
    val selectedIndex = rememberSaveable{
        mutableStateOf(0)
    }
    BottomNavigation() {
        destonationList.forEachIndexed { index, destinations ->
            BottomNavigationItem(
                label = {Text107(text = destinations.title )},
                icon = { Icon(imageVector = destinations.icon, contentDescription = destinations.title) },
                selected = index==selectedIndex.value ,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destonationList[index].route){
                        popUpTo(Login.route)
                        launchSingleTop = true
                    }
                })
        }
    }
}
