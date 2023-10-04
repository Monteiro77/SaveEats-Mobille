package br.senai.sp.jandira.ordercomponents.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun TrackOrderScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
                .padding(15.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.background_card_track_order)
            )
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
            ){

                Row (){
                    Column (verticalArrangement = Arrangement.Center){
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
                    Column {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){

                            Icone(
                                painter = painterResource(id = R.drawable.outline_watch_later_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.green_41),
                                modifier = Modifier.size(22.dp)
                            )

                            TextoComTodosAtributos(
                                value = "18:30 - 19:00",
                                corTexto = colorResource(id = R.color.gray),
                                fontWeight = FontWeight(400),
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
fun TrackOrderScreenPreview() {
    TrackOrderScreen()
}