package br.senai.sp.jandira.logincomponent.components

import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Botao
import br.senai.sp.jandira.componentes.CaixaDeTexto

@Composable
fun Form(navController: NavController) {

    var emailState by rememberSaveable {
        mutableStateOf("")
    }

    var senhaState by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .padding(5.dp)
            .height(450.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = stringResource(id = R.string.welcome),
            color = Color(41, 95, 27),
            fontWeight = FontWeight(700),
            fontSize = 36.sp

        )
        Text(
            text = stringResource(id = R.string.enter_account),
            fontSize = 14.sp,
            fontWeight = FontWeight(400)

        )

        Spacer(modifier = Modifier.height(30.dp))


        CaixaDeTexto(
            value = stringResource(id = R.string.email),
            aoMudar = {
                emailState = it
            },
            corBorda = Color(72, 138, 39),
            shape = ShapeDefaults.Small,
            icon = painterResource(id = R.drawable.baseline_email_24),
            iconDescricao = "",
            modifier = null
        )

        Spacer(modifier = Modifier.height(10.dp))

        CaixaDeTexto(
            value = stringResource(id = R.string.password),
            aoMudar = {
                senhaState = it
            },
            corBorda = Color(72, 138, 39),
            shape = ShapeDefaults.Small,
            icon = painterResource(id = R.drawable.baseline_lock_24),
            iconDescricao = "",
            modifier = null
        )

        Text(
            text = stringResource(id = R.string.forget_password), modifier = Modifier.padding(
                start = 135.dp, top = 20.dp
            ), color = Color(29, 34, 27), fontWeight = FontWeight(500)
        )

        Spacer(
            modifier = Modifier.height(30.dp)
        )

//        Botao(
//            aoClick = {navController.navigate("home_screen")},
//            texto = stringResource(id = R.string.login),
//            corBotao = Color(255, 141, 6),
//            modifier = Modifier
//                .height(60.dp)
//                .width(200.dp),
//            fontSize = 20.sp
//        )

        Button(
            onClick = {navController.navigate("home_screen")},
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.orangeButton)),
            modifier = Modifier
                .height(60.dp)
                .width(200.dp)
            ) {
            Text(
                text = "Login",
                fontSize = 20.sp
            )
        }

        Spacer(
            modifier = Modifier.height(30.dp)
        )

        Row {
            Text(
                text = stringResource(id = R.string.dont_have_an_account),
                color = Color(29, 34, 27),
                fontWeight = FontWeight(500)
            )

            Spacer(
                modifier = Modifier.width(5.dp)
            )

            Text(
                modifier = Modifier.clickable { navController.navigate("home_screen") },
                text = stringResource(id = R.string.signup),
                color = Color(20, 58, 11),
                fontWeight = FontWeight(700),
            )
        }
    }
}