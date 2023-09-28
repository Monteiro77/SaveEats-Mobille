package br.senai.sp.jandira.cartcomponents.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material3.AlertDialogDefaults.shape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier


@Composable
fun Form() {

    var unidadeState by remember {
        mutableStateOf(5)
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

                TextoComTodosAtributosEModifier(
                    value = stringResource(id = R.string.menu),
                    corTexto = colorResource(id = R.color.green_41),
                    fontWeight = FontWeight(300),
                    fontSize = 10.sp,
                    modifier = Modifier
                        .clickable { }
                )
            }
        }

        Card(
            modifier = Modifier
                .height(130.dp)
                .fillMaxWidth()
                .padding(10.dp),
            colors = CardDefaults.cardColors(
                colorResource(id = R.color.card_cart_background)
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Imagem(
                        painter = painterResource(id = R.drawable.coxinha),
                        descricao = "",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(100))
                    )
                    Column (modifier = Modifier.absoluteOffset(x = -90.dp)){
                        TextoComTodosAtributos(
                            value = "Coxinha",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(400),
                            fontSize = 15.sp
                        )
                        TextoComTodosAtributos(
                            value = "3 unidades - R$4,50",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(300),
                            fontSize = 10.sp
                        )
                    }
                    Icone(
                        painter = painterResource(id = R.drawable.outline_delete_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.black),
                        modifier = Modifier
                    )



                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(3.dp)
                    ,
                    horizontalArrangement = Arrangement.End
                ){
                    Row (
                        modifier = Modifier
                            .height(40.dp)
                            .width(75.dp)
                            .background(
                                colorResource(id = R.color.greenTextField),
                                shape = RoundedCornerShape(100)
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center

                    ){
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_add_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.white),
                            modifier = Modifier
                                .clickable { unidadeState++ }
                                .size(17.dp)
                        )
                        Text(
                            text = "${unidadeState}",
                            color = colorResource(id = R.color.white)
                        )
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_remove_24),
                            descricao = "",
                            corIcone = colorResource(R.color.white),
                            modifier = Modifier
                                .clickable {
                                    unidadeState--
                                }
                        )
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun FormPreview() {
//    Form()
//}