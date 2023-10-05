package br.senai.sp.jandira.ordercomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ordercomponents.component.Header

@Composable
fun TrackOrderScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Header(
            titulo = "Acompanhar Pedido",
            navController = navController,
            navigation = "finish_order_screen"
        )
        Card(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
                .padding(15.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.background_card_track_order)
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {

                        Icone(
                            painter = painterResource(id = R.drawable.baseline_check_circle_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.green_splash),
                            modifier = Modifier
                                .size(20.dp)
                        )
                    }


                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .width(3.dp)
                            .background(
                                colorResource(id = R.color.green_41),
                                shape = RoundedCornerShape(100)
                            )
                    ) {

                    }
                    Icone(
                        painter = painterResource(id = R.drawable.baseline_check_circle_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.green_splash),
                        modifier = Modifier
                            .size(20.dp)
                    )

                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .width(3.dp)
                            .background(
                                colorResource(id = R.color.green_41),
                                shape = RoundedCornerShape(100)
                            )
                    ) {

                    }
                    Icone(
                        painter = painterResource(id = R.drawable.baseline_check_circle_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.green_splash),
                        modifier = Modifier
                            .size(20.dp)
                    )

                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .width(3.dp)
                            .background(
                                colorResource(id = R.color.gray),
                                shape = RoundedCornerShape(100)
                            )
                    ) {

                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_check_circle_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier
                            .size(20.dp)
                    )

                }

                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        TextoComTodosAtributos(
                            value = "Pedido Realizado",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp
                        )
                        TextoComTodosAtributos(
                            value = "18:25",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }
                    Column {
                        TextoComTodosAtributos(
                            value = "Pedido sendo preparado",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp
                        )
                        TextoComTodosAtributos(
                            value = "18:27",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }

                    Column {
                        TextoComTodosAtributos(
                            value = "Saiu para entrega",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp
                        )
                        TextoComTodosAtributos(
                            value = "18:42",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }

                    Column {
                        TextoComTodosAtributos(
                            value = "Entregue",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp
                        )
                        TextoComTodosAtributos(
                            value = "18:55",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 10.sp
                        )
                    }
                }


                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        TextoComTodosAtributos(
                            value = "Status do Pedido",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(400),
                            fontSize = 15.sp
                        )
                        TextoComTodosAtributos(
                            value = "Despachado",
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 22.sp
                        )
                    }


                    Column (horizontalAlignment = Alignment.End){
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {

                            Icone(
                                painter = painterResource(id = R.drawable.outline_watch_later_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.green_41),
                                modifier = Modifier.size(22.dp)
                            )

                            TextoComTodosAtributos(
                                value = "18:30 - 19:00",
                                corTexto = colorResource(id = R.color.gray),
                                fontWeight = FontWeight(500),
                                fontSize = 15.sp
                            )
                        }

                        TextoComTodosAtributos(
                            value = "Previsão de entrega",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(600),
                            fontSize = 16.sp
                        )
                    }
                }


            }

        }

        Column(
            modifier = Modifier
                .padding(15.dp)
                .height(300.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

           Column {
               TextoComTodosAtributos(
                   value = "Detalhes do Pedido",
                   corTexto = colorResource(id = R.color.green_41),
                   fontWeight = FontWeight(600),
                   fontSize = 22.sp
               )

               Row(
                   modifier = Modifier
                       .fillMaxWidth(),
                   verticalAlignment = Alignment.CenterVertically
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.restaurante),
                       contentDescription = "",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .size(30.dp)
                           .clip(CircleShape)
                   )
                   Spacer(modifier = Modifier.width(15.dp))

                   Column {

                       TextoComTodosAtributos(
                           value = "Name Restaurant",
                           corTexto = colorResource(id = R.color.black),
                           fontWeight = FontWeight(500),
                           fontSize = 16.sp
                       )
                       Text(
                           text = "Menu",
                           color = colorResource(id = R.color.green_41),
                           fontWeight = FontWeight(500),
                           fontSize = 13.sp,
                           modifier = Modifier
                               .clickable { navController.navigate("menu_screen") }
                       )


                   }
               }

               Spacer(
                   modifier = Modifier
                       .height(10.dp)
               )

               Row(
                   modifier = Modifier
                       .height(1.dp)
                       .fillMaxWidth()
                       .background(
                           colorResource(id = R.color.gray),
                           shape = RoundedCornerShape(100)
                       )
               ) {

               }
           }

            Column {
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    TextoComTodosAtributos(
                        value = "Entregar em",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                    TextoComTodosAtributos(
                        value = "Endereço - CEP",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    TextoComTodosAtributos(
                        value = "Total",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                    TextoComTodosAtributos(
                        value = "R$ 36,99",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    TextoComTodosAtributos(
                        value = "Pagamento na Entrega",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                    TextoComTodosAtributos(
                        value = "Forma de Pagamento",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(500),
                        fontSize = 12.sp
                    )

                }
            }

            LazyColumn{
                items(3){

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Image(
                                painter = painterResource(id = R.drawable.coxinha),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(30.dp)
                                    .clip(CircleShape)
                            )

                            Spacer(modifier = Modifier.width(10.dp))

                            Column {

                                TextoComTodosAtributos(
                                    value = "Coxinha de Frango C/ Catupiry",
                                    corTexto = colorResource(id = R.color.black),
                                    fontWeight = FontWeight(500),
                                    fontSize = 16.sp
                                )
                                TextoComTodosAtributos(
                                    value = "Unidade - R$ 3,99",
                                    corTexto = colorResource(id = R.color.black),
                                    fontWeight = FontWeight(400),
                                    fontSize = 13.sp
                                )
                            }
                        }

                        TextoComTodosAtributos(
                            value = "3x",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 13.sp
                        )
                    }

                }
            }
        }

        Card(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.card_finish_order)
            )

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Button(
                    onClick = { navController.navigate("avaliation_screen")},
                    modifier = Modifier
                        .height(50.dp)
                        .width(200.dp),
                    colors = ButtonDefaults.buttonColors(
                        colorResource(id = R.color.white)
                    )
                ) {
                    TextoComTodosAtributos(
                        value = "Confirmar Entrega",
                        corTexto = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(500),
                        fontSize = 15.sp
                    )
                    
                }
            }


        }

    }

}
