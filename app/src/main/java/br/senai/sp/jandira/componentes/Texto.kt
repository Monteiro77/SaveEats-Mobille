package br.senai.sp.jandira.componentes

import android.util.Size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import br.senai.sp.jandira.R
import br.senai.sp.jandira.ui.theme.fontFamily

@Composable
fun TextoComTodosAtributos(
    value: String,
    corTexto: Color,
    fontWeight: FontWeight?,
    fontSize: TextUnit


): Unit {

    Text(
        text = value,
        fontFamily = fontFamily,
        color = corTexto,
        fontWeight = fontWeight,
        fontSize = fontSize
    )

}

@Composable
fun TextoComTodosAtributosEModifier(
    value: String,
    corTexto: Color,
    fontWeight: FontWeight?,
    fontSize: TextUnit,
    modifier: Modifier


): Unit {

    Text(
        text = value,
        fontFamily = fontFamily,
        color = corTexto,
        fontWeight = fontWeight,
        fontSize = fontSize,
        modifier = Modifier
    )

}

@Composable
fun TextoSemEdicao(
    value: String
): Unit {

    Text(
        text = value,
        fontFamily = fontFamily
    )
    
}

@Composable
fun TextoBranco(
    value: String
) {
    Text(
        text = value,
        fontFamily = fontFamily,
        color = colorResource(id = R.color.white)
    )
    
}


@Composable
fun TextoComLineHeight(
    value: String,
    corTexto: Color,
    fontWeight: FontWeight?,
    fontSize: TextUnit,
    lineHeight: TextUnit


): Unit {

    Text(
        text = value,
        fontFamily = fontFamily,
        color = corTexto,
        fontWeight = fontWeight,
        fontSize = fontSize,
        lineHeight = lineHeight
    )

}




@Preview(showBackground = true)
@Composable
fun TextoPreview() {
}