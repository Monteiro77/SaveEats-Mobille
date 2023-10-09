package br.senai.sp.jandira.loadingcomponents.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Loading
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun LoadingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Loading(
            circleColor = colorResource(id = R.color.green_41)
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextoComTodosAtributos(
            value = "Aguarde, estamos realizando seu pedido...",
            corTexto = colorResource(id = R.color.orangeButton),
            fontWeight = FontWeight(600),
            fontSize = 18.sp
        )

    }
}