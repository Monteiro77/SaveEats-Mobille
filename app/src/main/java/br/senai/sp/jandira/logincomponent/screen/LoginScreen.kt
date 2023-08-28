package br.senai.sp.jandira.logincomponent.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R

@Composable
fun LoginScreen() {
    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            Image(
                painter = painterResource(id = R.drawable.food1),
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .absoluteOffset(x = -40.dp, y = -32.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(250.dp)
            )

        }
    }

}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}