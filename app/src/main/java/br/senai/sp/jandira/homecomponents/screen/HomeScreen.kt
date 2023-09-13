package br.senai.sp.jandira.homecomponents.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.homecomponents.components.Form
import br.senai.sp.jandira.homecomponents.components.Header

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
        Form()


    }
}

@Preview(showSystemUi = true )
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}