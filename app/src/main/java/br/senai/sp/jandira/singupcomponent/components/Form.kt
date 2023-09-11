package br.senai.sp.jandira.singupcomponent.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.CaixaDeTexto

@Composable
fun Form(navController: NavController) {

    var nameState by remember {
        mutableStateOf("")
    }
    var cpfState by remember {
        mutableStateOf("")
    }
    var cepState by remember {
        mutableStateOf("")
    }
    var phoneState by remember {
        mutableStateOf("")
    }

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
            value = nameState,
            aoMudar = {
                      nameState = it
            },
            label = stringResource(id = R.string.name),
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_person_24),
            iconDescricao = "",
            modifier = null
        )

        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = cpfState,
            aoMudar = {
                      cpfState = it
            },
            label = stringResource(id = R.string.ssn),
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_wallet_24),
            iconDescricao = "",
            modifier = null
        )
        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = cepState,
            aoMudar = {
                      cepState = it
            },
            label = stringResource(id = R.string.zip_code),
            corBorda = colorResource(id = R.color.greenTextField),
            shape = RoundedCornerShape(12.dp),
            icon = painterResource(id = R.drawable.baseline_place_24),
            iconDescricao = "",
            modifier = null
        )
        Spacer(modifier = Modifier.height(20.dp))

        CaixaDeTexto(
            value = phoneState,
            aoMudar = {
                      phoneState = it
            },
            label = stringResource(id = R.string.phone),
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

//        Botao(
//            aoClick = {
//                      navController.navigate("signup2_screen")
//            },
//            texto = stringResource(id = R.string.next),
//            corBotao = colorResource(id = R.color.orangeButton),
//            modifier = Modifier
//                .height(45.dp)
//                .width(200.dp),
//            fontSize = 20.sp
//        )

        Button(
            onClick = {navController.navigate("signup2_screen")},
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.orangeButton)),
            modifier = Modifier
                .height(60.dp)
                .width(200.dp)
        ) {
            Text(
                text = "NEXT",
                fontSize = 20.sp
            )
        }

    }


}

