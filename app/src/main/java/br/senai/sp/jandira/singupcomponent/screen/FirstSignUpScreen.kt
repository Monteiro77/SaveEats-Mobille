package br.senai.sp.jandira.singupcomponent.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem

@Composable
fun SingUpScreen() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(120,120,120,0))
        ) {
            Icon(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "",
                tint = colorResource(id = R.color.green_41)

            )
            
        }

        Column (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            ){
            Imagem(
                painter = painterResource(id = R.drawable.logo),
                descricao = "",
                modifier = Modifier
                    .size(220.dp))

            Box (){

                Imagem(
                    painter = painterResource(id = R.drawable.hamburguer),
                    descricao = "",
                    modifier = Modifier
                        .absoluteOffset(x = -210.dp, y = 60.dp)
                        .size(350.dp)
                )

                Imagem(
                    painter = painterResource(id = R.drawable.pao),
                    descricao = "",
                    modifier = Modifier
                        .size(400.dp)
                        .absoluteOffset(x = 80.dp, y = -200.dp)
                )

                Imagem(
                    painter = painterResource(id = R.drawable.prato),
                    descricao = "",
                    modifier = Modifier
                        .absoluteOffset(x = 330.dp, y = 400.dp)
                )


                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .absoluteOffset(y = -10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    br.senai.sp.jandira.singupcomponent.components.Form()
                }
            }


        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SingUpScreenPreview() {
    SingUpScreen()
}