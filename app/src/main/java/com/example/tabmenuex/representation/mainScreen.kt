package com.example.tabmenuex.representation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Screen(){

    Scaffold(
        bottomBar = NavigationBar {
            NavigationBarItem(selected = , onClick = { /*TODO*/ }, icon = { /*TODO*/ })
        }
    ) {
       contentPadding->
        Column (
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
                Text(
                    text = "content",
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )
        }
    }
}