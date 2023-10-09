package br.senai.sp.jandira.cartcomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.cartcomponents.component.Header
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.LinearGradient
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun FinishOrder(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        var changeScreen by remember {
            mutableStateOf(true)
        }





        if (changeScreen == true) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
                            .clickable { navController.navigate("cart_screen") }
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {


                        TextoComTodosAtributos(
                            value = stringResource(id = R.string.cart),
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 20.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .height(2.dp)
                        .width(400.dp)
                        .background(colorResource(id = R.color.green_41))
                        .clip(RoundedCornerShape(100))
                ) {

                }
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Imagem(
                            painter = painterResource(id = R.drawable.breadslogo),
                            descricao = "",
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(60.dp)


                        )
                        Column(
                            modifier = Modifier
                                .absoluteOffset(x = -190.dp)

                        ) {
                            TextoComTodosAtributos(
                                value = "Name Restaurant",
                                corTexto = Color(29, 34, 27),
                                fontWeight = FontWeight(600),
                                fontSize = 15.sp
                            )

                            Text(
                                text = stringResource(id = R.string.menu),
                                fontSize = 12.sp,
                                color = colorResource(id = R.color.green_41),
                                fontWeight = FontWeight(400),
                                modifier = Modifier.clickable { navController.navigate("menu_screen") }

                            )

                        }
                    }
                }
            }
        } else {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
                            .clickable { navController.navigate("cart_screen") }
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {


                        TextoComTodosAtributos(
                            value = stringResource(id = R.string.cart),
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 20.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))

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






        Column(
            modifier = Modifier
                .height(450.dp)
                .padding(15.dp)
                .absoluteOffset(y = -20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {


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
                        text = "Forma de Pagamento",
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
                .height(
                    if (changeScreen == true) {
                        100.dp
                    } else {
                        250.dp
                    }
                )
                .fillMaxWidth()
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0xFF000000),
                    ambientColor = Color(0xFF000000)
                ),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp
            ),
            backgroundColor = colorResource(id = R.color.card_finish_order)
        ) {

            if (changeScreen == true) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            changeScreen = false
                        },
                        colors = ButtonDefaults
                            .buttonColors(
                                colorResource(id = R.color.white)
                            ),
                        shape = RoundedCornerShape(36.dp),
                        modifier = Modifier
                            .height(45.dp)
                            .width(250.dp)


                    ) {
                        Text(
                            text = stringResource(id = R.string.confirm),
                            textAlign = TextAlign.Center,
                            color = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(600),
                            fontSize = 15.sp,
                            fontFamily = fontFamily
                        )
//                        TextoComTodosAtributos(
//                            value = stringResource(id = R.string.cofirm_delivery),
//                            corTexto = colorResource(id = R.color.green_41),
//                            fontWeight = FontWeight(500),
//                            fontSize = 15.sp
//                        )
                    }
                }

            }else{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        TextoComTodosAtributos(
                            value = stringResource(id = R.string.cofirm_delivery),
                            corTexto = colorResource(id = R.color.white),
                            fontWeight = FontWeight(500),
                            fontSize = 15.sp
                        )
                    }


                    Column (Modifier.fillMaxWidth()){
                        Column() {
                            TextoComTodosAtributos(
                                value = stringResource(id = R.string.deliver_in ),
                                corTexto = colorResource(id = R.color.green_41),
                                fontWeight = FontWeight(600),
                                fontSize = 16.sp
                            )
                            TextoComTodosAtributos(
                                value = "Avenida João Ventura dos Santos 1308",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(500),
                                fontSize = 14.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Column() {
                            TextoComTodosAtributos(
                                value = stringResource(id = R.string.payment_method),
                                corTexto = colorResource(id = R.color.green_41),
                                fontWeight = FontWeight(600),
                                fontSize = 16.sp
                            )
                            Row (
                                modifier = Modifier
                                    .width(50.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_pix_24),
                                    descricao = "Pix",
                                    corIcone = colorResource(id = R.color.green_41),
                                    modifier = Modifier.size(20.dp)
                                )
                                TextoComTodosAtributos(
                                    value = "Pix",
                                    corTexto = colorResource(id = R.color.white),
                                    fontWeight = FontWeight(500),
                                    fontSize = 14.sp
                                )
                            }
                        }
                    }




                    Button(
                        onClick = { navController.navigate("loading_screen") },
                        colors =    ButtonDefaults
                            .buttonColors(
                                colorResource(id = R.color.white)
                            ),
                        shape = RoundedCornerShape(36.dp),
                        modifier = Modifier
                            .height(45.dp)
                            .width(250.dp)
                    ) {

                        TextoComTodosAtributos(
                            value = stringResource(id = R.string.cofirm_delivery),
                            corTexto = colorResource(id = R.color.green_41),
                            fontWeight = FontWeight(500),
                            fontSize = 15.sp
                        )
                        
                    }






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