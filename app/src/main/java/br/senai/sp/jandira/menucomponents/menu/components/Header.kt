package br.senai.sp.jandira.menucomponents.menu.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier

@Composable
fun Header(navController: NavController) {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Imagem(
            painter = painterResource(id = R.drawable.breadslogo),
            descricao = "",
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)

        )
        Column (
            modifier = Modifier
                .absoluteOffset(x = -80.dp)

        ){
            TextoComTodosAtributos(
                value = "Name Restaurant",
                corTexto = Color(29,34,27),
                fontWeight = FontWeight(600),
                fontSize = 15.sp
            )

            TextoComTodosAtributosEModifier(
                value = "Categorie - Times",
                corTexto = Color(85,85,85),
                fontWeight = FontWeight(300),
                fontSize = 10.sp,
                modifier = Modifier
                    .clickable {  }
            )

            Text(
                text = "Resutant profile",
                modifier = Modifier
                    .clickable {
                        navController.navigate("restaurant_profile_screen")
                    },
                color = colorResource(id = R.color.green_41),
                fontWeight = FontWeight(600),
                fontSize = 10.sp
            )
        }

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.
            padding(top = 30.dp)

        ){
            Icone(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "",
                corIcone = colorResource(id = R.color.star_rate),
                modifier = Modifier
                    .size(25.dp)
            )
            TextoComTodosAtributos(
                value = "4,5",
                corTexto = colorResource(id = R.color.star_rate),
                fontWeight = FontWeight(500),
                fontSize = 10.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {

}