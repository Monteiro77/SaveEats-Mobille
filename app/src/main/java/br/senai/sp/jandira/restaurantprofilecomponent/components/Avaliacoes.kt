package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun Avaliacoes() {

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
}