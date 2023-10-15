package br.senai.sp.jandira.menucomponents.selecteditem.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.menucomponents.selecteditem.components.Form
import br.senai.sp.jandira.menucomponents.selecteditem.components.Header

@Composable
fun MenuInfoProductScreen(
    navController: NavHostController,
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()

    ){
        Column (){
            Header(navController)
            Form()
        }
    }
}
