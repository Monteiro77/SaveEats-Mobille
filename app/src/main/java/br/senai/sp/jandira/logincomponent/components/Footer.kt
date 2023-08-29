package br.senai.sp.jandira.logincomponent.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.componentes.Botao

@Composable
fun Footer() {
    Botao(
        modifier = Modifier
            .height(80.dp)
            .width(200.dp),
        aoClick = {},
        texto = "Entrar",
        corBotao = Color(255,141,6)
    )
}

@Preview(showBackground = true)
@Composable
fun FooterPreview() {
    Footer()
}