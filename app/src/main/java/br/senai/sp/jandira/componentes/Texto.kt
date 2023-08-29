package br.senai.sp.jandira.componentes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Texto(
    value: String
) {

    Text(
        text = value
    )

}

@Preview(showBackground = true)
@Composable
fun TextoPreview() {
    Texto(value = "Monteiro")
}