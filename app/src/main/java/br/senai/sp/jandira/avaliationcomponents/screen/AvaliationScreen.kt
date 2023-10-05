package br.senai.sp.jandira.avaliationcomponents.screen

import android.widget.Button
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.CaixaDeTexto
import br.senai.sp.jandira.componentes.CaixaDeTextoSemIcon
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ordercomponents.component.Header

@Composable
fun AvaliationScreen(navController: NavController) {

    var oneStar by remember {
        mutableStateOf(false)
    }

    var twoStar by remember {
        mutableStateOf(false)
    }
    var threeStar by remember {
        mutableStateOf(false)
    }
    var fourStar by remember {
        mutableStateOf(false)
    }
    var fiveStar by remember {
        mutableStateOf(false)
    }

    var selectedItemState by remember{
        mutableStateOf(false)
    }
    var avaliationState by remember{
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header(
            titulo = "Avaliações",
            navController = navController,
            navigation =  "track_order_screen"
        )

        Column {
            TextoComTodosAtributos(
                value = "Oque você achou do pedido",
                corTexto = colorResource(id = R.color.green_41),
                fontWeight = FontWeight(500),
                fontSize = 18.sp
            )

            TextoComTodosAtributos(
                value = "Escolha de 1 a 5 estrelas",
                corTexto = colorResource(id = R.color.green_41),
                fontWeight = FontWeight(400),
                fontSize = 15.sp
            )
        }

        Row(Modifier.fillMaxWidth()) {
            Icone(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "1 Estrela",
                corIcone =
                if (oneStar == false) {
                    colorResource(id = R.color.gray)
                } else {
                    colorResource(id = R.color.star_rate)
                },
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        oneStar = oneStar != true
                        twoStar = false
                        threeStar = false
                        fourStar = false
                        fiveStar = false

                    }
            )
            Icone(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "1 Estrela",
                corIcone =
                if (twoStar == false) {
                    colorResource(id = R.color.gray)
                } else {
                    colorResource(id = R.color.star_rate)
                },
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        oneStar = true
                        twoStar = twoStar != true
                        threeStar = false
                        fourStar = false
                        fiveStar = false

                    }
            )
            Icone(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "1 Estrela",
                corIcone =
                if (threeStar == false) {
                    colorResource(id = R.color.gray)
                } else {
                    colorResource(id = R.color.star_rate)
                },
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        oneStar = true
                        twoStar = true
                        threeStar = threeStar != true
                        fourStar = false
                        fiveStar = false

                    }
            )
            Icone(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "1 Estrela",
                corIcone =
                if (fourStar == false) {
                    colorResource(id = R.color.gray)
                } else {
                    colorResource(id = R.color.star_rate)
                },
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        oneStar = true
                        twoStar = true
                        threeStar = true
                        fourStar = fourStar != true
                        fiveStar = false
                    }
            )
            Icone(
                painter = painterResource(id = R.drawable.baseline_star_rate_24),
                descricao = "1 Estrela",
                corIcone =
                if (fiveStar == false) {
                    colorResource(id = R.color.gray)
                } else {
                    colorResource(id = R.color.star_rate)
                },
                modifier = Modifier
                    .size(25.dp)
                    .clickable {
                        oneStar = true
                        twoStar = true
                        threeStar = true
                        fourStar = true
                        fiveStar = fiveStar != true

                    }
            )

        }

        TextoComTodosAtributos(
            value = "Oque poderia melhorar ?",
            corTexto = colorResource(id = R.color.black),
            fontWeight = FontWeight(550),
            fontSize = 18.sp
        )

        Box(
            modifier = Modifier
                .height(200.dp)
                .width(400.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column (
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp)
                            .clickable { selectedItemState = true },
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }

                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }

                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }


                }
                Column (
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }
                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }
                    Card(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        colors = CardDefaults.cardColors(
                            if (selectedItemState == false) {
                                colorResource(id = R.color.background)
                            } else {
                                colorResource(id = R.color.green_41)
                            }
                        )
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            TextoComTodosAtributos(
                                value = "Bons Ingredientes",
                                corTexto = colorResource(id = R.color.white),
                                fontWeight = FontWeight(550),
                                fontSize = 15.sp
                            )

                        }

                    }

                }
            }

        }

        CaixaDeTextoSemIcon(
            value = avaliationState,
            aoMudar = {
                      avaliationState = it
            },
            corBorda = colorResource(id = R.color.black),
            shape = RoundedCornerShape(10),
            label = "Digite aqui sua avaliação",
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.green_41)
                ),
                modifier = Modifier
                    .height(60.dp)
                    .width(200.dp)
            ) {

                TextoComTodosAtributos(
                    value = "Enivar Avaliação",
                    corTexto = colorResource(id = R.color.white),
                    fontWeight = FontWeight(500),
                    fontSize = 15.sp
                )

            }
        }


    }
}

//@Preview(showBackground = true)
//@Composable
//fun AvaliationScreenPreview() {
//    AvaliationScreen()
//}