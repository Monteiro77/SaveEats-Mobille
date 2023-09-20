package br.senai.sp.jandira

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.senai.sp.jandira.historicocomponents.screen.HistoricoScreen
import br.senai.sp.jandira.homecomponents.screen.HomeScreen
import br.senai.sp.jandira.menucomponents.menu.screen.MenuScreen
import br.senai.sp.jandira.menucomponents.selecteditem.screen.MenuInfoProductScreen
import br.senai.sp.jandira.profilecomponents.screen.ProfileScreen
import br.senai.sp.jandira.receitascomponents.screen.ReceitasScreen
import br.senai.sp.jandira.restaurantprofilecomponent.screen.RestaurantProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route

    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController = navController)
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
        composable("menu_screen"){
            MenuScreen(navController = navController)
        }
        composable("product_screen"){
            MenuInfoProductScreen(navController = navController)
        }
        composable("restaurant_profile_screen"){
            RestaurantProfileScreen(navController = navController)
        }





    }

}