package br.senai.sp.jandira.componentes

import android.util.Size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun Botao(
    aoClick: (String) -> Unit,
    texto:String,
    corBotao: Color,
    modifier: Modifier,
    fontSize: TextUnit

): Unit {

    Button(
        modifier = modifier,
        onClick = { aoClick },
        colors = ButtonDefaults.buttonColors(containerColor = corBotao),

    ) {

        Text(
            text = texto,
            fontSize = fontSize
        )
    }
}

@Preview
@Composable
fun BotaoPreview() {

}