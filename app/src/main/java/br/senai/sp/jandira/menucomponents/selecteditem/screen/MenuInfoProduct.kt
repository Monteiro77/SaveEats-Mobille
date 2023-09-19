package br.senai.sp.jandira.menucomponents.selecteditem.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.menucomponents.selecteditem.components.Header

@Composable
fun MenuInfoProduct() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){

        Header()

    }
}

@Preview(showBackground = true)
@Composable
fun MenuInfoProductPreview() {

    MenuInfoProduct()

}