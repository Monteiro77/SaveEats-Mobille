package br.senai.sp.jandira.singupcomponent.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Botao
import br.senai.sp.jandira.componentes.CaixaDeTexto

@Composable
fun Form() {
    Column (
        modifier = Modifier.padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){



        Text(
            text = stringResource(id = R.string.signup),
            color = Color(41, 95, 27),
            fontWeight = FontWeight(700),
            fontSize = 25.sp
        )

        Text(
            text = stringResource(id = R.string.create_your_account),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)
        )

        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.name),
            aoMudar = {},
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_person_24),
            iconDescricao = "",
            modifier = null
        )

        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.ssn),
            aoMudar = {},
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_wallet_24),
            iconDescricao = "",
            modifier = null
        )
        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.zip_code),
            aoMudar = {},
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_place_24),
            iconDescricao = "",
            modifier = null
        )
        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.phone),
            aoMudar = {},
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_phone_24),
            iconDescricao = "",
            modifier = null
        )

        Spacer(modifier = Modifier.height(40.dp))


        Row (
            modifier = Modifier
            .padding(bottom = 10.dp)){
            Card(
                Modifier
                    .padding(1.dp)
                    .width(8.dp)
                    .height(8.dp),
                colors = CardDefaults.cardColors(
                    colorResource(id = R.color.green_41)
                )
            ) {

            }

            Spacer(
                modifier = Modifier
                    .width(10.dp)
            )

            Card(
                Modifier
                    .padding(1.dp)
                    .width(8.dp)
                    .height(8.dp)
            ) {

            }
        }

        Botao(
            aoClick = {},
            texto = stringResource(id = R.string.next),
            corBotao = colorResource(id = R.color.orangeButton),
            modifier = Modifier
                .height(45.dp)
                .width(200.dp),
            fontSize = 20.sp
        )

    }


}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}