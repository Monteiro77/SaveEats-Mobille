package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.NavigationRow
import br.senai.sp.jandira.componentes.TextoComTodosAtributos


@Composable
fun Header () {

    Column(Modifier.fillMaxWidth()){
        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
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

            Imagem(
                painter = painterResource(id = R.drawable.breadslogo),
                descricao = "",
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(100))
            )

            }
        Row {

        }
    }

}
@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}