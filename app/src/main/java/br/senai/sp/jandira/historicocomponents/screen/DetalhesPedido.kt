package br.senai.sp.jandira.historicocomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun DetalhesPedidoScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)
                    .clickable {
                        navController.popBackStack()
                    }
                    .scale(scaleX = -1f, scaleY = 1f),
                tint = colorResource(id = R.color.green_41)

            )

            Spacer(modifier = Modifier.width(50.dp))

            Text(
                text = "Detalhes do Pedido",
                fontSize = 25.sp
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row() {

            Image(
                painter = painterResource(id = R.drawable.restaurante),
                contentDescription = "",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(

            ) {
                TextoComTodosAtributos(
                    value = "Padaria Dois Irmãos",
                    fontSize = 20.sp,
                    corTexto = colorResource(id = R.color.black),
                    fontWeight = FontWeight(500)
                )

                Spacer(modifier = Modifier.height(5.dp))

                TextoComTodosAtributos(
                    value = "Pedido Nº1234 ",
                    corTexto = Color(104, 104, 104),
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400)
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Ver Cardápio",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(41, 95, 27),
                    modifier = Modifier
                        .clickable {
                            navController.navigate("menu_screen")
                        },
                    fontFamily = fontFamily

                )
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Row(

            ) {
                Card(
                    modifier = Modifier
                        .width(330.dp)
                        .height(42.dp),
                    colors = CardDefaults.cardColors(
                        Color(239, 239, 239)
                    ),
                    shape = RoundedCornerShape(12.dp)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.baseline_verified_24),
                                contentDescription = "",
                                tint = Color(72, 138, 39),
                                modifier = Modifier.size(22.dp)
                            )

                            Spacer(modifier = Modifier.width(6.dp))

                            Text(
                                text = "Pedido concluído ás 03:20",
                                fontSize = 17.sp
                            )

                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            Card(
                modifier = Modifier
                    .width(380.dp)
                    .height(1.5.dp),
                colors = CardDefaults.cardColors(
                    Color(255, 141, 6)
                )
            ) {}

            Spacer(modifier = Modifier.height(25.dp))

        }
        Row {
            Image(
                painter = painterResource(id =  R.drawable.coxinha),
                contentDescription = "",
                modifier = Modifier
                    .size(55.dp)
            )

            Spacer(modifier = Modifier.width(6.dp))

            Column() {

                Text(
                    text = "10 Pães",
                    fontSize = 18.sp
                )

                Row {

                    Text(
                        text = "Não possui observacões",
                        color = Color(104, 104, 104),
                        fontSize = 12.sp
                    )

                    Spacer(modifier = Modifier.width(105.dp))

                    Text(text = "R$ 5,00")
                }


            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Column(

        ) {

            Text(
                text = "Resumo de valores",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row() {

                Text(
                    text = "SubTotal",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(248.dp))

                Text(text = "R$ 5,00")

            }

            Spacer(modifier = Modifier.height(5.dp))

            Row() {

                Text(
                    text = "Taxa de entrega",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(220.dp))

                Text(
                    text = "Grátis",
                    color = Color(41, 95, 27)
                )

            }



            Spacer(modifier = Modifier.height(5.dp))

            Row() {

                Text(
                    text = "Total",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(270.dp))

                Text(text = "R$ 5,00")

            }

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Pagamento",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row {

                Text(
                    text = "Pago pelo app",
                    color = Color(104, 104, 104),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.width(135.dp))

                Icon(
                    painter = painterResource(id = R.drawable.credit_card),
                    contentDescription = "",
                    tint = Color(206, 159, 104),
                    modifier = Modifier.size(20.dp)
                )

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = "Mastercard 1864",
                )

            }


            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Endereço de entrega",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Rua Elton Silva 45",
                color = Color(104, 104, 104),
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Jandira, São Paulo",
                color = Color(104, 104, 104),
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Avaliações",
                fontSize = 20.sp,
                color = Color(41, 95, 27)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Row {

                Icon(
                    painter = painterResource(id =  R.drawable.baseline_star_rate_24),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(
                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(
                    painter = painterResource(id =  R.drawable.baseline_star_rate_24),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.width(3.dp))

                Icon(
                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(3.dp))

                Icon(
                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.width(200.dp))

                Text(
                    text = "Enviar",
                    fontSize = 15.sp,
                    color = Color(41, 95, 27)
                )
            }


        }


    }
}

@Preview(showBackground = true)
@Composable
fun DetalhesPedidoPreview() {

}