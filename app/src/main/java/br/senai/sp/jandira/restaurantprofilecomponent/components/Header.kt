package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.ImagemRedonda
import br.senai.sp.jandira.componentes.NavigationRow
import br.senai.sp.jandira.componentes.TextoComTodosAtributos


@Composable
fun Header () {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ){
            Column {
                TextoComTodosAtributos(
                    value = "Restaurant's Name",
                    corTexto = colorResource(R.color.black),
                    fontWeight = FontWeight(600),
                    fontSize =  25.sp
                )
                TextoComTodosAtributos(
                    value = "Categories - Schedule",
                    corTexto = colorResource(R.color.black),
                    fontWeight = FontWeight(300),
                    fontSize =  12.sp
                )
            }

            ImagemRedonda(
                painter = painterResource(id = R.drawable.breadslogo),
                descricao = "",
                size = 70.dp
            )

            }
        Row {

            TextoComTodosAtributos(
                value = "4,0",
                corTexto = colorResource(id = R.color.star_rate),
                fontWeight = FontWeight(400),
                fontSize = 15.sp
            )

            Icon(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                contentDescription = "",
                tint = colorResource(id = R.color.star_rate)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                contentDescription = "",
                tint = colorResource(id = R.color.star_rate)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                contentDescription = "",
                tint = colorResource(id = R.color.star_rate)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                contentDescription = "",
                tint = colorResource(id = R.color.star_rate)
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_star_border_24),
                contentDescription = ""
            )
        }

        TextoComTodosAtributos(
            value = "355 avaliações",
            corTexto = colorResource(id = R.color.black),
            fontWeight = FontWeight(300),
            fontSize = 14.sp
        )
    }

}
@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}