package br.senai.sp.jandira.menucomponents.selecteditem.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.CaixaDeTexto
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import java.text.Normalizer.Form

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Column() {
            TextoComTodosAtributos(
                value = "Coxinha de Frango Com Catupiry",
                corTexto = colorResource(id = R.color.black),
                fontWeight = FontWeight(400),
                fontSize = 25.sp
            )
            TextoComTodosAtributos(
                value = "Coxinha tradicional sabor frango com catupiry",
                corTexto = colorResource(id = R.color.black),
                fontWeight = FontWeight(200),
                fontSize = 15.sp
            )
            TextoComTodosAtributos(
                value = "A partir de 3,99",
                corTexto = colorResource(id = R.color.green_41),
                fontWeight = FontWeight(600),
                fontSize = 15.sp
            )


        }
        Column {
            TextoComTodosAtributos(
                value = "Alguma Observação?",
                corTexto = colorResource(id = R.color.black),
                fontWeight = FontWeight(400),
                fontSize = 15.sp
            )
            OutlinedTextField(
                value = "Digire aqui sua observacao",
                onValueChange = { },
                modifier = Modifier
                    .height(120.dp)
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Adcionar ao Carrinho")
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}