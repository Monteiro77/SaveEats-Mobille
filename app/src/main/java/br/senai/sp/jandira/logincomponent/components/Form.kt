package br.senai.sp.jandira.logincomponent.components

import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.componentes.CaixaDeTexto

@Composable
fun Form() {

    var emailState by remember{
        mutableStateOf("")
    }

    var senhaState by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        
        Text(
            text = "BEM VINDO",
            color = Color(41,95,27),
            fontWeight = FontWeight(700),
            fontSize = 25.sp

        )
        Text(
            text = "Entre na sua conta",
            fontSize = 14.sp,
            fontWeight = FontWeight(400)

        )

        Spacer(modifier = Modifier.height(30.dp))


        CaixaDeTexto(
            value = "Email",
            aoMudar = {
                emailState = it
            },
            corBorda = Color(72, 138, 39),
            shape = ShapeDefaults.Small
        )
        Spacer(modifier = Modifier.height(10.dp))

        CaixaDeTexto(
            value = "Senha",
            aoMudar = {
                senhaState = it
            },
            corBorda = Color(72, 138, 39),
            shape = ShapeDefaults.Small
        )

        Text(
            text = "Esqueceu a senha?",
            modifier = Modifier.padding(start = 160.dp, top = 20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}