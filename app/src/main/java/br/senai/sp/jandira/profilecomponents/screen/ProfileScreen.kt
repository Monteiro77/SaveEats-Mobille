package br.senai.sp.jandira.profilecomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column {

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    contentDescription = "",
                    tint = colorResource(id = R.color.green_41)
                )
            }
            Spacer(
                modifier = Modifier
                    .height(40.dp)
            )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.mulher),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .border(
                                width = 1.5.dp,
                                color = Color(0xFF143A0B),
                                shape = RoundedCornerShape(size = 70.dp)
                            )
                    )
                    Column(
                        modifier = Modifier
                            .padding(5.dp)
                    ) {
                        TextoComTodosAtributos(
                            value = "Amanda Santos",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 22.sp
                        )
                        TextoComTodosAtributos(
                            value = "amandinha@gmail.com",
                            corTexto = colorResource(id = R.color.gray),
                            fontWeight = FontWeight(500),
                            fontSize = 10.sp
                        )
                    }
                }
            }

        Spacer(
            modifier = Modifier
                .height(40.dp)
        )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_edit_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Editar meu dados",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_star_rate_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Avalições",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_credit_card_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.green_41),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Formas de Pagamento",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_phone_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.gray),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Fale Conosco",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icone(
                            painter = painterResource(id = R.drawable.ticket_icon),
                            descricao = "",
                            corIcone = colorResource(id = R.color.red),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Cupons",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row() {
                        Icone(
                            painter = painterResource(id = R.drawable.baseline_logout_24),
                            descricao = "",
                            corIcone = colorResource(id = R.color.red),
                            modifier = Modifier
                                .size(35.dp)
                        )

                        TextoComTodosAtributos(
                            value = "Logout",
                            corTexto = colorResource(id = R.color.black),
                            fontWeight = FontWeight(500),
                            fontSize = 20.sp
                        )
                    }

                    Icone(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        descricao = "",
                        corIcone = colorResource(id = R.color.gray),
                        modifier = Modifier.size(20.dp)
                    )

                }
            }


        }
    }


@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}