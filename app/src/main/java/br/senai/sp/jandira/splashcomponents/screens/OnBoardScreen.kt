package br.senai.sp.jandira.splashcomponents.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem

@Composable
fun OnBoardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.green_splash)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {30
        Imagem(
            painter = painterResource(id = R.drawable.logo),
            descricao = "",
            modifier = Modifier
                .size(300.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardScreenPreview() {
    OnBoardScreen()
}