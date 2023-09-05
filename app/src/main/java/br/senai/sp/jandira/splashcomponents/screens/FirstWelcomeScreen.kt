package br.senai.sp.jandira.splashcomponents.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Botao
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.LinearGradient


@Composable
fun FirstWelcomeScreen() {



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LinearGradient()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Imagem(
                painter = painterResource(id = R.drawable.img_mulher),
                descricao = "",
                modifier = Modifier
                    .size(300.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )

            Text(
                modifier = Modifier
                    .width(320.dp)
                    .height(100.dp),
                text = stringResource(id = R.string.welcome_text_1),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )

            Spacer(
                modifier = Modifier
                    .height(100.dp)
            )

            Row {
                Card(
                    Modifier
                        .padding(1.dp)
                        .width(8.dp)
                        .height(8.dp),
                    colors = CardDefaults.cardColors(
                        colorResource(id = R.color.green_41)
                    )
                ) {}

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )
                Card(
                    Modifier
                        .padding(1.dp)
                        .width(8.dp)
                        .height(8.dp),
                    colors = CardDefaults.cardColors(
                        colorResource(id = R.color.white)
                    )
                ) {}

                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )
                Card(
                    Modifier
                        .padding(1.dp)
                        .width(8.dp)
                        .height(8.dp),
                    colors = CardDefaults.cardColors(
                        colorResource(id = R.color.white)
                    )
                ) {}
            }

            Spacer(
                modifier = Modifier
                    .height(30.dp)
            )

            Botao(
                aoClick = {},
                texto = stringResource(id = R.string.next),
                corBotao = colorResource(id = R.color.green_splash),
                modifier = Modifier
                    .padding(0.dp)
                    .width(150.dp)
                    .height(45.dp),
                fontSize = 16.sp)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FirstWelcomeScreenPreview() {
    FirstWelcomeScreen()
}