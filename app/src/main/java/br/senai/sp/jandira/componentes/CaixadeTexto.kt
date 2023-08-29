package br.senai.sp.jandira.componentes

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    value: String,
    aoMudar: (String) -> Unit,
    corBorda: Color,
    shape: Shape

) {

    OutlinedTextField(

        value = value,
        onValueChange = {
            aoMudar(it)
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = corBorda,
            unfocusedBorderColor = corBorda),
        shape = shape
    )


}

@Preview(showBackground = true)
@Composable
fun CaixaDeTextoPreview() {


}