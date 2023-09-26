package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.ProgressBar
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        var progressState by remember {
            mutableStateOf(true)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.width(400.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Avaliações",
                    fontSize = 17.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight(400),
                    color = colorResource(id = R.color.black),
                    modifier = Modifier
                        .padding(start = 55.dp)
                        .clickable { progressState = true }

                )



                Text(
                    text = "Informações",
                    fontSize = 17.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight(400),
                    color = colorResource(id = R.color.black),
                    modifier = Modifier
                        .padding(end = 50.dp)
                        .clickable { progressState = false }
                )


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(
                        color =
                        if (progressState == true) {
                            colorResource(id = R.color.progressbar)
                        } else {
                            colorResource(id = R.color.green_41)
                        },
                        shape = RoundedCornerShape(size = 5.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .height(5.dp)
                        .background(
                            color =
                            if (progressState == false) {
                                colorResource(id = R.color.progressbar)
                            } else {
                                colorResource(id = R.color.green_41)
                            },
                            shape = RoundedCornerShape(size = 5.dp)
                        )
                ) {}
            }

        }
//
//        ProgressBar(text1 = "Avaliações", text2 = "Informações", valor = 200)
        if (progressState == true) {

            LazyColumn {


                items(5) {


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(5.dp)
                    ) {
                        Imagem(
                            painter = painterResource(id = R.drawable.mulher),
                            descricao = "",
                            modifier = Modifier
                                .clip(
                                    RoundedCornerShape(100)
                                )
                                .size(50.dp)
                        )

                        Column {
                            TextoComTodosAtributos(
                                value = "Monteiro",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(600),
                                fontSize = 15.sp
                            )

                            Row(verticalAlignment = Alignment.CenterVertically) {

                                TextoComTodosAtributos(
                                    value = "4,5",
                                    corTexto = colorResource(id = R.color.star_rate),
                                    fontWeight = FontWeight(500),
                                    fontSize = 15.sp
                                )

                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.star_rate),
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.star_rate),
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.star_rate),
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.star_rate),
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.star_rate),
                                    modifier = Modifier
                                        .size(25.dp)
                                )

                            }

                            TextoComTodosAtributos(
                                value = "Muito bom! Comida de qualidade, ótimo atendimento e a comida chegou antes do tempo previsto.",
                                corTexto = colorResource(id = R.color.gray),
                                fontWeight = FontWeight(400),
                                fontSize = 13.sp
                            )

                        }
                    }
                }
            }
        } else {
            Column (
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(20.dp)
                ){
               Column {
                   Row {
                       Icone(
                           painter = painterResource(id = R.drawable.baseline_place_24),
                           descricao = "",
                           corIcone = colorResource(id = R.color.green_41),
                           modifier = Modifier
                               .size(23.dp)
                       )
                       TextoComTodosAtributos(
                           value = "Endereço",
                           corTexto = colorResource(id = R.color.black),
                           fontWeight = FontWeight(600),
                           fontSize = 20.sp
                       )
                   }
                   Column() {
                       TextoComTodosAtributos(
                           value = "Rua Elton Silva 95,Jandira - São Paulo",
                           corTexto = colorResource(id = R.color.black),
                           fontWeight = FontWeight(500),
                           fontSize = 15.sp
                       )
                       TextoComTodosAtributos(
                           value = "CEP - 06260-170",
                           corTexto = colorResource(id = R.color.black),
                           fontWeight = FontWeight(500),
                           fontSize = 15.sp
                       )
                   }
               }

                Spacer(modifier = Modifier.height(30.dp))
                Column {
                        Row {
                            Icone(
                                painter = painterResource(id = R.drawable.outline_watch_later_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.green_41),
                                modifier = Modifier
                                    .size(23.dp)
                            )
                            TextoComTodosAtributos(
                                value = "Aberto Aberto",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp
                            )
                        }
                        Row {
                            TextoComTodosAtributos(
                                value = "Segunda Feira",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(500),
                                fontSize = 15.sp
                            )
                            TextoComTodosAtributos(
                                value = "10:00 as 22:00",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(500),
                                fontSize = 15.sp
                            )
                        }
                    }
                Spacer(modifier = Modifier.height(30.dp))
                    Column {
                        Row {
                            Icone(
                                painter = painterResource(id = R.drawable.baseline_attach_money_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.green_41),
                                modifier = Modifier
                                    .size(23.dp)
                            )
                            TextoComTodosAtributos(
                                value = "Forma De Pagamento",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(600),
                                fontSize = 20.sp
                            )
                        }
                        Row {
                            TextoComTodosAtributos(
                                value = "Formas de Pagamento Aceitas",
                                corTexto = colorResource(id = R.color.black),
                                fontWeight = FontWeight(500),
                                fontSize = 15.sp
                            )
                            Row{
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_credit_card_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.green_41),
                                    modifier = Modifier
                                        .size(23.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_credit_card_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.green_41),
                                    modifier = Modifier
                                        .size(23.dp)
                                )
                                Icone(
                                    painter = painterResource(id = R.drawable.baseline_credit_card_24),
                                    descricao = "",
                                    corIcone = colorResource(id = R.color.green_41),
                                    modifier = Modifier
                                        .size(23.dp)
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
    Form()
}