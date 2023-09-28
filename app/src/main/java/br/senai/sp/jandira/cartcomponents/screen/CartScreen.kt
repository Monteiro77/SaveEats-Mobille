package br.senai.sp.jandira.cartcomponents.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.cartcomponents.components.Form
import br.senai.sp.jandira.cartcomponents.components.Header

@Composable
fun CartScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column {
            Header()
            Form()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {

}