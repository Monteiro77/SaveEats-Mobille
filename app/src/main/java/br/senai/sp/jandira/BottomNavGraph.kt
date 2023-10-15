package br.senai.sp.jandira

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.senai.sp.jandira.cartcomponents.screen.CartScreen
import br.senai.sp.jandira.historicocomponents.screen.HistoricoScreen
import br.senai.sp.jandira.homecomponents.screen.HomeScreen
import br.senai.sp.jandira.menucomponents.menu.screen.MenuScreen
import br.senai.sp.jandira.menucomponents.selecteditem.screen.MenuInfoProductScreen
import br.senai.sp.jandira.profilecomponents.screen.ProfileScreen
import br.senai.sp.jandira.receitascomponents.screen.ReceitasScreen
import br.senai.sp.jandira.restaurantprofilecomponent.screen.RestaurantProfileScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController,
    navController2: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route

    ){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController = navController, navController2)
        }
        composable(route = BottomBarScreen.Historico.route){
            HistoricoScreen(navController, navController2)
        }
        composable(route = BottomBarScreen.Receitas.route){
            ReceitasScreen()
        }
        composable(route = BottomBarScreen.Perfil.route){
            ProfileScreen()
        }
        composable("restaurant_profile_screen"){
            RestaurantProfileScreen(navController = navController)
        }
        composable("product_screen"){
            MenuInfoProductScreen(navController = navController)
        }
    }

}