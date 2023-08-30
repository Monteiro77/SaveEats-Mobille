package br.senai.sp.jandira.logincomponent.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.logincomponent.components.Form

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {


                Imagem(
                    modifier = Modifier
                        .size(190.dp)
                        .absoluteOffset(x = -64.dp, y = -46.dp),
                    painter = painterResource(id = R.drawable.prato),
                    descricao = "",

                    )

                Column (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Imagem(
                        modifier = Modifier
                            .size(300.dp)
                            .absoluteOffset(y = -80.dp),
                        painter = painterResource(id = R.drawable.logo),
                        descricao = ""
                    )


                    Box (){

                            Imagem(
                                painter = painterResource(id = R.drawable.hamburguer),
                                descricao = "",
                                modifier = Modifier
                                    .absoluteOffset(x = -200.dp, y = 30.dp)
                                    .size(400.dp)
                            )

                        Imagem(
                            painter = painterResource(id = R.drawable.pao),
                            descricao = "",
                            modifier = Modifier
                                .size(400.dp)
                                .absoluteOffset(x = 80.dp, y = -200.dp)
                        )

                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .absoluteOffset(y = -100.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Form()
                        }
                    }







                }

            }



        }
    }
}




@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}