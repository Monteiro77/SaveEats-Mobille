package br.senai.sp.jandira.componentes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    value: String,
    aoMudar: (String) -> Unit,
    corBorda: Color,
    shape: Shape,
    icon: Painter,
    iconDescricao: String,
    modifier: Modifier?

): Unit {

    OutlinedTextField(

        value = value,
        onValueChange = {
            aoMudar(it)
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = corBorda,
            unfocusedBorderColor = corBorda),
        shape = shape,
        leadingIcon = { Icon(painter = icon, contentDescription = iconDescricao)}
    )


}



@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview() {

    CaixaDeTexto(
        value = stringResource(id = R.string.zip_code),
        aoMudar = {},
        corBorda = colorResource(id = R.color.greenTextField),
        shape = RoundedCornerShape(12.dp),
        icon = painterResource(id = R.drawable.baseline_place_24),
        iconDescricao = "",
        modifier = null
    )
}