package br.senai.sp.jandira.cartcomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.cartcomponents.component.Header
import br.senai.sp.jandira.componentes.LinearGradient
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun FinishOrder(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ){

        Header(
            navController = navController,
            navigation = "cart_screen"
        )

        Column(
            modifier = Modifier
                .height(450.dp)
                .padding(15.dp)
                .absoluteOffset(y = -20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {


            Column{
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Endereço de Entrega",
                        color = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(500),
                        fontSize = 18.sp
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "Trocar",
                            color = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(500),
                            fontSize = 18.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
                            contentDescription = "",
                            tint = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "Rua Elton Silva 95, Jandira - SP CEP: 00100 - 11",
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight(600),
                    fontSize = 15.sp
                )
                Text(
                    text = "Entrega padrão",
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight(400),
                    fontSize = 15.sp
                )
                Text(
                    text = "Hoje 40 - 50 min",
                    color = colorResource(id = R.color.black),
                    fontWeight = FontWeight(300),
                    fontSize = 13.sp
                )
            }



            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Endereço de Entrega",
                        color = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(500),
                        fontSize = 18.sp
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = "Trocar",
                            color = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(500),
                            fontSize = 18.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
                            contentDescription = "",
                            tint = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.credit_card),
                        contentDescription = "",
                        modifier = Modifier.size(35.dp)
                    )

                    Column {
                        TextoComTodosAtributos(
                            value = "Mastercard",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(600),
                            fontSize = 13.sp
                        )

                        TextoComTodosAtributos(
                            value = "Débito",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(300),
                            fontSize = 11.sp
                        )
                    }
                }
            }

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "CPF/CNPJ na nota",
                        color = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(500),
                        fontSize = 18.sp
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "Trocar",
                            color = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(500),
                            fontSize = 18.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_keyboard_arrow_down_24),
                            contentDescription = "",
                            tint = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(15.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))


                TextoComTodosAtributos(
                    value = "168.102.408-02",
                    corTexto = colorResource(id = R.color.black),
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp
                )
            }
            Column {
                TextoComTodosAtributos(
                    value = "Resumo de valores",
                    corTexto = colorResource(id = R.color.green_41),
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextoComTodosAtributos(
                        value = "SubTotal",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(300),
                        fontSize = 13.sp
                    )

                    TextoComTodosAtributos(
                        value = "R$ 30,00",
                        corTexto = colorResource(id = R.color.black),
                        fontWeight = FontWeight(600),
                        fontSize = 13.sp
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextoComTodosAtributos(
                        value = "Taxa de Entrega",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(300),
                        fontSize = 13.sp
                    )

                    TextoComTodosAtributos(
                        value = "Gratis",
                        corTexto = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(600),
                        fontSize = 13.sp
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextoComTodosAtributos(
                        value = "Total",
                        corTexto = colorResource(id = R.color.gray),
                        fontWeight = FontWeight(300),
                        fontSize = 13.sp
                    )

                    TextoComTodosAtributos(
                        value = "R$ 30,00",
                        corTexto = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(600),
                        fontSize = 13.sp
                    )

                }
            }
        }

        Card(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0xFF000000),
                    ambientColor = Color(0xFF000000)
                ),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults
                        .buttonColors(
                            colorResource(id = R.color.green_button)
                    ),
                    shape = RoundedCornerShape(36.dp),
                    modifier = Modifier
                        .height(45.dp)
                        .width(150.dp)


                ) {
                    TextoComTodosAtributos(
                        value = "Fazer Pedido",
                        corTexto = colorResource(id = R.color.white),
                        fontWeight = FontWeight(500),
                        fontSize = 15.sp
                    )
                }
            }

        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun FinishOrderPreview() {
//    FinishOrder()
//}