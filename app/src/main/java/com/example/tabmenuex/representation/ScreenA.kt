package com.example.tabmenuex.representation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ScreenA(nav: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally) {
        
        Text(text = "Screen A")
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = {
              nav.navigate(route = "B")
        }) {
            Text(text = "Go to Screen B")
        }
    }
}