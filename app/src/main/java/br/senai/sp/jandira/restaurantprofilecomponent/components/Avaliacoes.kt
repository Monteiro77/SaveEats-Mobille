package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComLineHeight
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.bottomBorder

@Composable
fun Avaliacoes() {

    LazyColumn(
        modifier = Modifier
            .padding(15.dp)
    ) {


        items(5) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .shadow(
                        elevation = 4.dp,
                        ambientColor = colorResource(id = R.color.black),
                        spotColor = colorResource(id = R.color.black),
                        shape = RoundedCornerShape(30)
                    )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,


                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.mulher),
                        contentDescription = "Profile Photo",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(5.dp))

                    Column(modifier = Modifier.absoluteOffset(y = 20.dp)) {
                        TextoComTodosAtributos(
                            value = "Monteiro",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(600),
                            fontSize = 15.sp
                        )

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            TextoComTodosAtributos(
                                value = "4,0",
                                corTexto = colorResource(id = R.color.star_rate),
                                fontWeight = FontWeight(600),
                                fontSize = 12.sp
                            )

                            Icone(
                                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.star_rate),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                            Icone(
                                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.star_rate),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                            Icone(
                                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.star_rate),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                            Icone(
                                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.star_rate),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                            Icone(
                                painter = painterResource(id = R.drawable.baseline_star_border_24),
                                descricao = "",
                                corIcone = colorResource(id = R.color.gray),
                                modifier = Modifier
                                    .size(20.dp)
                            )

                        }


                        TextoComLineHeight(
                            value = "Muito bom! Comida de qualidade, ótimo atendimento e a comida chegou antes do tempo previsto.",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(400),
                            fontSize = 13.sp,
                            lineHeight = 14.sp
                        )

                    }
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(194, 194, 194, 255))


            ){

            }


        }
    }
}