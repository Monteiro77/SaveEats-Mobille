@file:OptIn(ExperimentalFoundationApi::class)

package br.senai.sp.jandira.homecomponents.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.ui.theme.fontFamily


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Form(
    navController: NavHostController,
    navController2: NavHostController
    ) {

    var iconState by remember{
        mutableStateOf(false)
    }



    
    Column {
        Column {

            Text(
                text = stringResource(id = R.string.categories),
                color = colorResource(id = R.color.categories),
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 20.dp)
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

            val coresCarrosel = remember {
                mutableListOf(
                    R.color.carrossel_1,
                    R.color.carrossel_2,
                    R.color.carrossel_3

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
                    modifier = Modifier,
                    state = pagerState,
                    pageSpacing = 0.dp,
                    pageContent = {
                        Row (
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                                .background(colorResource(id = coresCarrosel[it]))

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
                    colors = if(pagerState.currentPage == 0){
                        CardDefaults.cardColors(
                       containerColor = colorResource(id = R.color.green_splash)
                        )
                    }else{
                        CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.background)
                        )
                    }
//                    colors =
//                    )
                ) {

                }
                Card (
                    modifier = Modifier
                        .width(7.dp)
                        .height(7.dp),
                    colors = if(pagerState.currentPage == 1){
                        CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.green_splash)
                        )
                    }else{
                        CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.background)
                        )
                    }

                ){

                }
                Card (
                    modifier = Modifier
                        .width(7.dp)
                        .height(7.dp),
                    colors = if(pagerState.currentPage == 2){
                        CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.green_splash)
                        )
                    }else{
                        CardDefaults.cardColors(
                            containerColor = colorResource(id = R.color.background)
                        )
                    }
                ){

                }
            }

        }

        Text(
            text = stringResource(id = R.string.restaurant),
            color = colorResource(id = R.color.categories),
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(6){
                Card (
                    modifier = Modifier
                        .height(75.dp)
                        .width(370.dp)
                        .padding(5.dp)
                        .shadow(
                            elevation = 4.dp,
                            spotColor = Color.Black,
                            ambientColor = Color.Black,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .clickable {
                                   navController2.navigate("menu_screen")
                        },
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.background)
                    )
                ){

                    Row (
                        modifier = Modifier
                            .padding(5.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Row {
                            Imagem(
                                painter = painterResource(id = R.drawable.restaurante),
                                descricao = "Image Description",
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape))
                            Column (Modifier.padding(5.dp)){

                                Text(
                                    text = "Restaurante Dois Irmãos",
                                    color = colorResource(id = R.color.name_restaurant),

                                )
                                Row (

                                    verticalAlignment = Alignment.CenterVertically
                                    ){
                                    Row (
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .width(50.dp)
                                    ){
                                        Icon(
                                            painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                            contentDescription = "",
                                            tint = colorResource(id = R.color.star_rate),
                                            modifier = Modifier
                                                .size(15.dp)
                                        )
                                        Text(
                                            text = "4,4",
                                            color = colorResource(id = R.color.star_rate)
                                        )
                                    }
                                    Text(
                                        text = "Padaria",
                                        fontFamily = fontFamily,
                                        color = colorResource(id = R.color.gray),
                                        fontSize = 12.sp
                                    )
                                }
                            }
                        }
                        Icon(
                            painter =
                            if(iconState == false)
                                painterResource(id = R.drawable.baseline_favorite_border_24)
                            else
                                painterResource(id = R.drawable.baseline_favorite_24),
                            contentDescription = "",
                            modifier = Modifier
                                .clickable {
                                    iconState = iconState != true
                                },
                            tint =
                            if(iconState == false)
                                colorResource(id = R.color.unselected_item)
                            else
                                colorResource(id = R.color.red)

                        )
                    }
                }
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun FormPreview() {

}