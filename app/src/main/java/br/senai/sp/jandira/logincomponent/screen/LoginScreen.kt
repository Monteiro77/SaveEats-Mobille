package br.senai.sp.jandira.logincomponent.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.logincomponent.components.Form

@Composable
fun LoginScreen(navController: NavHostController) {




    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp), Alignment.BottomCenter
            ) {

                Imagem(
                    modifier = Modifier
                        .size(150.dp)
                        .offset(x = -165.dp, y = -155.dp),
                    painter = painterResource(id = R.drawable.prato),
                    descricao = "Prato de comida"
                )

                Imagem(
                    modifier = Modifier.size(200.dp),
                    painter = painterResource(id = R.drawable.logo),
                    descricao = "Logo",
                )

            }

            Box(
                modifier = Modifier.fillMaxWidth(), Alignment.Center
            ) {

                Imagem(
                    modifier = Modifier
                        .size(180.dp)
                        .offset(x = -180.dp, y = 60.dp),
                    painter = painterResource(id = R.drawable.hamburguer),
                    descricao = "Hamburguer"
                )

                Imagem(
                    modifier = Modifier
                        .size(250.dp)
                        .offset(x = 150.dp, y = -100.dp),
                    painter = painterResource(id = R.drawable.pao),
                    descricao = ""
                )

                Form(navController)

            }

        }

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginPreview() {
    val navController = rememberNavController()

    LoginScreen(navController = navController)
}