package br.senai.sp.jandira.homecomponents.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.CaixaDeTexto
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun Header() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Imagem(
                painter = painterResource(id = R.drawable.logo),
                descricao = "",
                modifier = Modifier
                    .size(70.dp)
            )

            Row (verticalAlignment = Alignment.CenterVertically){
                Icon(
                    modifier = Modifier
                        .size(25.dp),
                    painter = painterResource(id = R.drawable.baseline_place_24),
                    contentDescription = "",
                    tint = colorResource(id = R.color.green_splash)
                )
                Text(
                    text = "Rua Elton Silva 95, Jandira",
                    fontFamily = fontFamily,
                    fontSize = 17.sp

                )
            }

            Icon(
                modifier = Modifier
                    .size(30.dp),
                painter = painterResource(id = R.drawable.outline_shopping_cart_24),
                contentDescription = "",
                tint = colorResource(id = R.color.green_splash)
            )
        }

        CaixaDeTexto(
            value = "",
            aoMudar = {},
            corBorda = colorResource(id = R.color.black),
            shape = RoundedCornerShape(10.dp),
            icon = painterResource(id = R.drawable.baseline_search_24),
            iconDescricao = "",
            label = "",
            modifier = Modifier
                .height(40.dp)
                .width(300.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun HeaderPreview() {
    Header()
}