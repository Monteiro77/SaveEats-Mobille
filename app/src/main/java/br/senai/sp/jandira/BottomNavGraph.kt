package br.senai.sp.jandira

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.senai.sp.jandira.historicocomponents.screen.HistoricoScreen
import br.senai.sp.jandira.homecomponents.screen.HomeScreen
import br.senai.sp.jandira.profilecomponents.screen.ProfileScreen
import br.senai.sp.jandira.receitascomponents.screen.ReceitasScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route

    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Historico.route){
            HistoricoScreen()
        }
        composable(route = BottomBarScreen.Receitas.route){
            ReceitasScreen()
        }
        composable(route = BottomBarScreen.Perfil.route){
            ProfileScreen()
        }
    }

}