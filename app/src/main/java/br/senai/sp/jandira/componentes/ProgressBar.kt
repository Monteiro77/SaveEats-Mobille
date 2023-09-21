package br.senai.sp.jandira.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.ui.theme.fontFamily


@Composable
fun ProgressBar(text1: String, text2: String, valor: Int) {

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
                text = text1,
                fontSize = 17.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight(400),
                color = colorResource(id = R.color.black),
                modifier = Modifier
                    .padding(start = 55.dp)
                    .clickable { progressState = true }

            )



            Text(
                text = text2,
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
                    .width(valor.dp)
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

}

@Preview
@Composable
fun BarraProgressoPreview() {
    ProgressBar(text1 = "Avaliações", text2 = "Informações", valor = 200)
}