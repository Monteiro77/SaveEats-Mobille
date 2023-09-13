@file:OptIn(ExperimentalFoundationApi::class)

package br.senai.sp.jandira.homecomponents.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Form() {

    
    Column {
        Column {

            Text(
                text = stringResource(id = R.string.categories)
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            LazyRow(
                contentPadding = PaddingValues(horizontal = 15.dp)
            ){
                items(5){
                    Card(
                        modifier = Modifier
                            .height(45.dp)
                            .width(120.dp)
                            .padding(2.dp),
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        )

                    ) {
                        Row (
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Imagem(
                                painter = painterResource(id = R.drawable.fruit_cart),
                                descricao = "",
                                modifier = Modifier
                                    .size(40.dp)
                            )

                            Text(
                                text = "Mercado",
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            val imagens = remember{
                mutableStateListOf(
                    R.drawable.prato_carrossel,
                    R.drawable.panela_carrossel,
                    R.drawable.mulher_carrossel
                )
            }

            val textosCarrosel = remember {
                mutableStateListOf(
                    R.string.text1_slider,
                    R.string.text2_slider,
                    R.string.text3_slider
                )
            }

            val pagerState = rememberPagerState(
                pageCount = {
                    3
                }
            )

            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(350.dp)
            ) {
                HorizontalPager(
                    modifier = Modifier
                        .padding(5.dp),
                    state = pagerState,
                    pageSpacing = 0.dp,
                    pageContent = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxSize()

                        ){
                            Column (
                                modifier = Modifier
                                    .height(300.dp)
                                    .width(200.dp),
                                verticalArrangement = Arrangement.Center,


                            ){
                                Text(
                                    text = stringResource(id = textosCarrosel[it]),
                                    fontSize = 18.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                            Imagem(
                                painter = painterResource(id = imagens[it]),
                                descricao = "",
                                modifier = Modifier
                                    .size(120.dp)
                            )
                        }



                    }
                )
            }

            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )

            Row (
                modifier = Modifier
                    .width(40.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Card(
                    modifier = Modifier
                        .width(7.dp)
                        .height(7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.green_splash)
                    )
                ) {

                }
                Card (
                    modifier = Modifier
                        .width(7.dp)
                        .height(7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.background)
                    )

                ){

                }
                Card (
                    modifier = Modifier
                        .width(7.dp)
                        .height(7.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.background)
                    )
                ){

                }
            }

        }

        Text(
            text = stringResource(id = R.string.restaurant)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(6){
                Card (
                    modifier = Modifier
                        .height(70.dp)
                        .width(370.dp)
                        .padding(5.dp)
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color.Black,
                            ambientColor = Color.Black,
                            shape = RoundedCornerShape(5.dp)

                        ),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.background)
                    )
                ){



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