package com.example.tabmenuex.representation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem

import androidx.compose.runtime.Composable

import  androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tabmenuex.Model.Bottom

@Composable
fun Screen(){
 val menu= listOf(
     Bottom(
         title = "Home",
         selectedIcon = Icons.Default.Home,
         unSelectedIcon = Icons.Outlined.Home,
         hasBadge = false,
         badgeNum = 0
     ),
     Bottom(
         title = "Inbox",
         selectedIcon = Icons.Default.Email,
         unSelectedIcon = Icons.Outlined.Email,
        hasBadge = true,
        badgeNum = 10
 ),
     Bottom(
         title = "Account",
         selectedIcon = Icons.Default.Face,
         unSelectedIcon = Icons.Outlined.Face,
         hasBadge = true,
         badgeNum = 0
     )
 )
    var bottomNavState by rememberSaveable{ mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            NavigationBar {
                menu.forEachIndexed { index, bottom ->

                    NavigationBarItem(
                        selected = bottomNavState == index,
                        onClick = { bottomNavState = index },
                        icon = { 
                            Icon(imageVector =if (bottomNavState == index) bottom.selectedIcon else bottom.unSelectedIcon , contentDescription = bottom.title)

                        })

                }
            }
        }
    )

    {
       contentPadding->
        Column (
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
                Text(
                    text = menu[bottomNavState].title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )
        }
    }
}