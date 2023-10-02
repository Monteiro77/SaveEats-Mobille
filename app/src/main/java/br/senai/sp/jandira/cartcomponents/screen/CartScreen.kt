package br.senai.sp.jandira.cartcomponents.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.cartcomponents.component.Header
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier

@Composable
fun CartScreen(navController: NavHostController) {

    var unidadeState by remember {
        mutableStateOf(1)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))

    ) {



        Column {
            Header(
                navController = navController, navigation = "home_screen"
            )
            LazyColumn() {
                items(7) {
                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth()
                            .padding(12.dp)
                            .shadow(
                                elevation = 2.dp,
                                spotColor = Color(0xFF000000),
                                ambientColor = Color(0xFF000000),
                                shape = RoundedCornerShape(10.dp)
                            ), colors = CardDefaults.cardColors(
                            colorResource(id = R.color.card_cart_background)
                        ), shape = RoundedCornerShape(10.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                                    .padding(5.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Imagem(
                                    painter = painterResource(id = R.drawable.coxinha),
                                    descricao = "",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(100))
                                )
                                Column(modifier = Modifier.absoluteOffset(x = -80.dp)) {
                                    TextoComTodosAtributos(
                                        value = "Coxinha",
                                        corTexto = colorResource(id = R.color.black),
                                        fontWeight = FontWeight(400),
                                        fontSize = 18.sp
                                    )
                                    TextoComTodosAtributos(
                                        value = "3 unidades - R$4,50",
                                        corTexto = colorResource(id = R.color.black),
                                        fontWeight = FontWeight(300),
                                        fontSize = 12.sp
                                    )
                                }

                                Icone(
                                    painter = painterResource(id = R.drawable.outline_delete_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.black),
                                    modifier = Modifier.size(25.dp)
                                )

                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(3.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Row(
                                    modifier = Modifier
                                        .height(30.dp)
                                        .width(75.dp)
                                        .background(
                                            colorResource(id = R.color.greenTextField),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(5.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween

                                ) {
                                    Icone(painter = painterResource(id = R.drawable.baseline_remove_24),
                                        descricao = "",
                                        corIcone = colorResource(R.color.white),
                                        modifier = Modifier
                                            .clickable { unidadeState-- }
                                            .size(17.dp))

                                    TextoComTodosAtributos(
                                        value = "${unidadeState}",
                                        corTexto = colorResource(id = R.color.white),
                                        fontWeight = null,
                                        fontSize = 15.sp
                                    )
                                    Icone(painter = painterResource(id = R.drawable.baseline_add_24),
                                        descricao = "",
                                        corIcone = colorResource(id = R.color.white),
                                        modifier = Modifier
                                            .clickable { unidadeState++ }
                                            .size(17.dp))

                                }
                            }
                        }
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .absoluteOffset(y = 660.dp)
                .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                .background(Color(255, 255, 255, 255)),

            ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    TextoComTodosAtributos(
                        value = "Resumo de valores",
                        corTexto = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(600),
                        fontSize = 15.sp
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Column(
                    modifier = Modifier.height(60.dp),
                    verticalArrangement = Arrangement.SpaceBetween

                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TextoComTodosAtributos(
                            value = "SubTotal",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(300),
                            fontSize = 12.sp
                        )

                        TextoComTodosAtributos(
                            value = "R$ 30,00",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(600),
                            fontSize = 12.sp
                        )

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        TextoComTodosAtributos(
                            value = "Taxa de Entrega",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(300),
                            fontSize = 12.sp
                        )

                        TextoComTodosAtributos(
                            value = "Gratis",
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 12.sp
                        )

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        TextoComTodosAtributos(
                            value = "Total",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(300),
                            fontSize = 12.sp
                        )

                        TextoComTodosAtributos(
                            value = "R$ 30,00",
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 12.sp
                        )

                    }
                }

                Button(
                    onClick = {
                              navController.navigate("finish_order_screen")
                    }, colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.green_button)
                    )
                ) {
                    TextoComTodosAtributos(
                        value = "Continuar",
                        corTexto = colorResource(id = R.color.white),
                        fontWeight = null,
                        fontSize = 15.sp
                    )

                }
            }

        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CartScreenPreview() {
//
//    CartScreen()
//
//}

