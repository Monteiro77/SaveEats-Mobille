package br.senai.sp.jandira.splashcomponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun WelcomeScreen() {

   val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.cooking_animation))
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LottieAnimation(
                composition = composition,
                modifier = Modifier.size(250.dp),
                iterations = LottieConstants.IterateForever
            )


            TextoComTodosAtributosEModifier(
                value = "Participe deste movimento sustentável que combate o desperdício de alimentos ao resgatar produtos frescos de restaurantes, padarias e hortifrutis com descontos de até 70%.",
                corTexto = colorResource(id = R.color.black),
                fontWeight = FontWeight(600),
                fontSize = 12.sp,
                modifier = Modifier

            )

            Row {
                Row (){

                }

            }


        }

    }

}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}