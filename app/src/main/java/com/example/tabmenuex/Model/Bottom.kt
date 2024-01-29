package com.example.tabmenuex.Model

import androidx.compose.ui.graphics.vector.ImageVector

data class Bottom (
    val title:String,
    val selectedIcon:ImageVector,
    val unSelectedIcon:ImageVector,
    val hasBadge:Boolean,
    val badgeNum:Int
)