package br.senai.sp.jandira.historicocomponents.screen

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R

@Composable
fun HistoricoScreen(
    navController: NavController,
    navController2: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {

        Text(
            text = "Histórico",
            fontSize = 25.sp,

            )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {


            items(4) {

                Spacer(modifier = Modifier.height(25.dp))


                Row() {
                    Text(
                        text = "Seg 31 julho 2023",
                        color = Color(104, 104, 104),
                    )

                }

                Spacer(modifier = Modifier.height(10.dp))



                Card(
                    modifier = Modifier
                        .width(350.dp)
                        .height(147.dp)
                        .shadow(
                            elevation = 8.dp,
                            spotColor = Color(0xFF000000),
                            ambientColor = Color(0xFF000000),
                            shape = RoundedCornerShape(30.dp)
                        ), colors = CardDefaults.cardColors(
                        Color(212, 227, 204)
                    ), shape = RoundedCornerShape(30.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.restaurante),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(50.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.width(15.dp))

                            Text(
                                text = "Pizzaria Dois Irmãos", fontSize = 20.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(2.dp))

                        Card(
                            modifier = Modifier
                                .width(270.dp)
                                .height(1.5.dp),
                            colors = CardDefaults.cardColors(
                                Color(255, 141, 6)
                            )
                        ) {

                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Row() {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_verified_24),
                                contentDescription = "",
                                tint = Color(72, 138, 39),
                                modifier = Modifier.size(15.dp)
                            )

                            Spacer(modifier = Modifier.width(4.dp))

                            Text(
                                text = "Pedido concluído Nº 7800",
                                color = Color(104, 104, 104),
                                fontSize = 10.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Button(
                            onClick = {
                                navController2.navigate("detalhes_pedido_screen")
                            },
                            colors = ButtonDefaults.buttonColors(
                                Color(72, 138, 39)
                            )
                        ) {
                            Text(
                                text = "Detalhes do Pedido"
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
fun HistoricoScreenPreview() {

}