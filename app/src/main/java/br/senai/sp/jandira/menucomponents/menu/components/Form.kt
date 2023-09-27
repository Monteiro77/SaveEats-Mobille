package br.senai.sp.jandira.menucomponents.menu.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier

@Composable
fun Form(
    navController2: NavHostController
) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 15.dp)
    ) {

        TextoComTodosAtributosEModifier(
            value = "Menu",
            corTexto = colorResource(id = R.color.green_41),
            fontWeight = FontWeight(800),
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()


        )

        Spacer(
            modifier = Modifier
                .height(30.dp)
        )

        LazyColumn() {
            items(10) {
                Card(
                    modifier = Modifier
                        .height(110.dp)
                        .clickable {
                            navController2.navigate("product_screen")
                        }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20))
                                .height(80.dp)
                                .width(80.dp)
                                .shadow(
                                    elevation = 4.dp,
                                    spotColor = Color(0x40000000),
                                    ambientColor = Color(0x40000000)
                                )


                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.coxinha),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(80.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(15.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(130.dp)
                        ) {
                            TextoComTodosAtributos(
                                value = "Baguette tradicional",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(400),
                                fontSize = 15.sp
                            )

                            Text(
                                text = "Baguette tradicional de massa folhada, aproximadamente 25 cm, bem assada e fresquinha :)",
                                fontWeight = FontWeight(300),
                                letterSpacing = 1.sp
                            )
                            TextoComTodosAtributos(
                                value = "R$5,90",
                                corTexto = colorResource(id = R.color.green_41),
                                fontWeight = FontWeight(600),
                                fontSize = 15.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {

}