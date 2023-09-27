package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun InformacoesRestaurante() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(20.dp)
    ) {
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
        Column(
            modifier = Modifier
                .fillMaxWidth()

        ) {
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                TextoComTodosAtributos(
                    value = "Formas de Pagamento Aceitas",
                    corTexto = colorResource(id = R.color.black),
                    fontWeight = FontWeight(500),
                    fontSize = 15.sp
                )
                Row {
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