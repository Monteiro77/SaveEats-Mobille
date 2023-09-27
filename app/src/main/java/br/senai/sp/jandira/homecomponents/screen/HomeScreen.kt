package br.senai.sp.jandira.homecomponents.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.homecomponents.components.Form
import br.senai.sp.jandira.homecomponents.components.Header

@Composable
fun HomeScreen(
    navController: NavHostController,
    navController2: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header(navController, navController2)
        Form(navController = navController, navController2)


    }
}

@Preview(showSystemUi = true )
@Composable
fun HomeScreenPreview() {
}