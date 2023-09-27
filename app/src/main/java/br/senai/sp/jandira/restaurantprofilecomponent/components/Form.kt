package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.ProgressBar
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        var progressState by remember {
            mutableStateOf(true)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.width(400.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Avaliações",
                    fontSize = 17.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight(400),
                    color = colorResource(id = R.color.black),
                    modifier = Modifier
                        .padding(start = 55.dp)
                        .clickable { progressState = true }

                )



                Text(
                    text = "Informações",
                    fontSize = 17.sp,
                    fontFamily = fontFamily,
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
                    .height(3.dp)
                    .background(
                        color =
                        if (progressState == true) {
                            colorResource(id = R.color.progressbar)
                        } else {
                            colorResource(id = R.color.green_41)
                        },
                        shape = RoundedCornerShape(size = 5.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .width(200.dp)
                        .height(5.dp)
                        .background(
                            color =
                            if (progressState == false) {
                                colorResource(id = R.color.progressbar)
                            } else {
                                colorResource(id = R.color.green_41)
                            },
                            shape = RoundedCornerShape(size = 5.dp)
                        )
                ) {}
            }

        }
//
//        ProgressBar(text1 = "Avaliações", text2 = "Informações", valor = 200)
        if (progressState == true) {

            Avaliacoes()
        } else {
            InformacoesRestaurante()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}