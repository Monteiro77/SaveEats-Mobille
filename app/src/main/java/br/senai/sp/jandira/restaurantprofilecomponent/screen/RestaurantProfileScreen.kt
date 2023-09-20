package br.senai.sp.jandira.restaurantprofilecomponent.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import br.senai.sp.jandira.componentes.NavigationRow
import br.senai.sp.jandira.restaurantprofilecomponent.components.Header

@Composable
fun RestaurantProfileScreen(navController: NavHostController) {

    Surface {
        Column {
            NavigationRow(navController = navController, navigation = "menu_screen")
            Header()
        }
    }
}

@Preview
@Composable
fun RestaurantProfileScreenPreview() {

}