package br.senai.sp.jandira.singupcomponent.screen

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.singupcomponent.components.Form

@Composable
fun FirstSignUpScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Row (Modifier.height(50.dp)){

            Button(
                onClick = {
                    navController.navigate("login_screen")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(120, 120, 120, 0))
            ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    contentDescription = "",
                    tint = colorResource(id = R.color.green_41)

                )

            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Imagem(
                painter = painterResource(id = R.drawable.logo),
                descricao = "",
                modifier = Modifier.size(180.dp)
            )

            Box() {

                Imagem(
                    modifier = Modifier
                        .size(180.dp)
                        .offset(x = -65.dp, y = 80.dp),
                    painter = painterResource(id = R.drawable.hamburguer),
                    descricao = "Hamburguer"
                )

                Imagem(
                    modifier = Modifier
                        .size(250.dp)
                        .offset(x = 235.dp, y = -180.dp),
                    painter = painterResource(id = R.drawable.pao),
                    descricao = ""
                )

                Imagem(
                    painter = painterResource(id = R.drawable.prato),
                    descricao = "",
                    modifier = Modifier.absoluteOffset(x = 330.dp, y = 400.dp)
                )


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absoluteOffset(y = -10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Form(navController)
                }
            }
        }
    }
}

@Preview
@Composable
fun SignUpScreenPreview() {
    
}