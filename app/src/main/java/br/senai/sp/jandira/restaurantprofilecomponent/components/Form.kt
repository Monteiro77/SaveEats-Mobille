package br.senai.sp.jandira.restaurantprofilecomponent.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.componentes.ProgressBar

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        ProgressBar(text1 = "Avaliações", text2 = "Informações", valor = 200)

    }
}


@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}