package br.senai.sp.jandira.receitascomponents.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceitasScreen() {

    var progressState by remember {
        mutableStateOf(true)
    }
    var searchState by remember{
        mutableStateOf(TextFieldValue(""))
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(
            text = "Receitas e Dicas",
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(25.dp))


        Row(
            modifier = Modifier.width(400.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = "Receitas",
                fontSize = 17.sp,
                fontWeight = FontWeight(400),
                color = colorResource(id = R.color.black),
                modifier = Modifier
                    .padding(start = 55.dp)
                    .clickable { progressState = true }

            )



            Text(
                text = "Dicas",
                fontSize = 17.sp,
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
                .height(2.dp)
                .background(
                    if (progressState == false) {
                        Color(133, 165, 98, 255)
                    } else {
                        Color(191, 193, 198, 255)
                    },
                    shape = RoundedCornerShape(size = 5.dp)
                )

        ) {
            Row(
                modifier = Modifier
                    .height(2.dp)
                    .width(190.dp)
                    .background(
                        color = if (progressState == true) {
                            Color(133, 165, 98, 255)
                        } else {
                            Color(191, 193, 198, 255)
                        },
                        shape = RoundedCornerShape(size = 5.dp)
                    )
            ) {

            }
        }

        Spacer(modifier = Modifier.height(12.dp))


        OutlinedTextField(
            value = searchState,
            onValueChange = {
                searchState = it
            },
            modifier = Modifier.fillMaxWidth(),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_search_24),
                    contentDescription = "Seaerch",
                    tint = Color.Gray
                )
            },
            label = {
                Text(
                    text = "Pesquisar",
                )
            },
            shape = RoundedCornerShape(100)

        )

        Spacer(modifier = Modifier.height(25.dp))

        Row() {

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(30.dp)
                    .width(88.dp),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(113, 165, 98, 255)
                )
            ){

                Text(text = "Populares",
                    color = Color.White,
                    fontSize = 10.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(30.dp)
                    .width(84.dp),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(214, 215, 216)
                )
            ){

                Text(text = "Salgados",
                    color = Color.White,
                    fontSize = 10.sp)
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(30.dp)
                    .width(80.dp),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(214, 215, 216)
                )
            ){

                Text(text = "Doces",
                    color = Color.White,
                    fontSize = 10.sp)

            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(30.dp)
                    .width(80.dp),
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(214, 215, 216)
                )
            ){

                Text(text = "Frutas",
                    color = Color.White,
                    fontSize = 10.sp)



            }


        }

        Spacer(modifier = Modifier.height(5.dp))

        if(progressState == true){

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {


                items(5) {

                    Spacer(modifier = Modifier.height(25.dp))

                    Row() {

                        Card(
                            modifier = Modifier
                                .width(115.dp)
                                .height(120.dp)
                                .shadow(
                                    elevation = 8.dp,
                                    spotColor = Color(0xFF000000),
                                    ambientColor = Color(0xFF000000),
                                    shape = RoundedCornerShape(30.dp)
                                ),
                            colors = CardDefaults.cardColors(Color(244, 244, 244)),
                            shape = RoundedCornerShape(30.dp)

                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.food),
                                    contentDescription = "",
                                    modifier = Modifier.size(80.dp)

                                )
                            }



                        }

                        Spacer(modifier = Modifier.width(15.dp))


                        Column() {

                            Text(text = "Frango grelhado com legumes ",
                                fontSize = 16.sp)

                            Spacer(modifier = Modifier.height(10.dp))

                            Row() {

                                Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "",
                                    tint = Color(255, 193, 7, 255))

                                Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "" ,
                                    tint = Color(255, 193, 7, 255))

                                Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "",
                                    tint = Color(255, 193, 7, 255))

                                Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "",
                                    tint = Color(255, 193, 7, 255))

                                Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                    contentDescription = "",
                                    tint = Color(255, 193, 7, 255))

                            }


                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "55 min",
                                fontSize = 16.sp)

                        }



                    }

                }
            }
        }else{

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {


                items(5) {

                    Spacer(modifier = Modifier.height(25.dp))

                    Row() {

                        Spacer(modifier = Modifier.height(10.dp))

                        Card(
                            modifier = Modifier
                                .width(415.dp)
                                .height(120.dp)
                                .shadow(
                                    elevation = 8.dp,
                                    spotColor = Color(0xFF000000),
                                    ambientColor = Color(0xFF000000),
                                    shape = RoundedCornerShape(30.dp)
                                ),
                            colors = CardDefaults.cardColors(
                                Color(244, 244, 244)
                            ),
                            shape = RoundedCornerShape(10.dp)

                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(15.dp),
                            ) {

                                Row() {

                                    Image(
                                        painter = painterResource(id = R.drawable.vegetais),
                                        contentDescription = "",
                                        modifier = Modifier.size(110.dp),

                                        )

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column {

                                        Text(text = "Qual a duração dos alimentos no congelador?",
                                            fontSize = 15.sp
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row() {

                                            Text(text = "4,0",
                                                color = Color(252, 184, 7),
                                                fontSize = 15.sp
                                            )

                                            Spacer(modifier = Modifier.width(10.dp))

                                            Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                                contentDescription = "",
                                                tint = Color(255, 193, 7, 255),
                                                modifier = Modifier
                                                    .width(17.dp))

                                            Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                                contentDescription = "" ,
                                                tint = Color(255, 193, 7, 255),
                                                modifier = Modifier
                                                    .width(17.dp))


                                            Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                                contentDescription = "",
                                                tint = Color(255, 193, 7, 255),
                                                modifier = Modifier
                                                    .width(17.dp))


                                            Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                                contentDescription = "",
                                                tint = Color(255, 193, 7, 255),
                                                modifier = Modifier
                                                    .width(17.dp))

                                            Icon(painter = painterResource(id = R.drawable.baseline_star_rate_24),
                                                contentDescription = "",
                                                tint = Color(255, 193, 7, 255),
                                                modifier = Modifier
                                                    .width(17.dp))




                                        }



                                    }



                                }

                            }



                        }



                    }

                }
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ReceitasScreenPreview() {

}