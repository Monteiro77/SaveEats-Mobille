package br.senai.sp.jandira.ordercomponents.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun Header(
    titulo: String,
    navController: NavController,
    navigation: String
) {

    Column (modifier = Modifier.fillMaxWidth()){

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {

            Icone(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                descricao = "",
                corIcone = colorResource(id = R.color.green_41),
                modifier = Modifier
                    .size(25.dp)
                    .clickable { navController.navigate(navigation) }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {


                TextoComTodosAtributos(
                    value = titulo,
                    corTexto = colorResource(id = R.color.green_41),
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .height(2.dp)
                .width(400.dp)
                .background(colorResource(id = R.color.green_41))
                .clip(RoundedCornerShape(100))
        ) {

        }

    }

    
}

@Preview
@Composable
fun HeaderPreview() {
    
}