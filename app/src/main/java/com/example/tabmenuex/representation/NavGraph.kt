package com.example.tabmenuex.representation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav(){
   val nav= rememberNavController()
    NavHost(navController = nav, startDestination = "A" ){
        composable(route="A"){
            ScreenA(nav)
        }
        composable(route="B"){
            ScreenB(nav)
        }
        composable(route="C"){
            ScreenC(nav)
        }


    }
}