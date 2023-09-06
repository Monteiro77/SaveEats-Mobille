package br.senai.sp.jandira

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Historico: BottomBarScreen(
        route = "historico",
        title = "Historico",
        icon = Icons.Default.List
    )
    object Receitas: BottomBarScreen(
        route = "receitas",
        title = "Receitas",
        icon = Icons.Default.DateRange
    )
    object Perfil: BottomBarScreen(
        route = "perfil",
        title = "Perfil",
        icon = Icons.Default.Person
    )
}
