package br.senai.sp.jandira.menucomponents.selecteditem.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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

    var observationState by remember{
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(420.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
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
                fontSize = 18.sp
            )
            TextoComTodosAtributos(
                value = "A partir de 3,99",
                corTexto = colorResource(id = R.color.green_41),
                fontWeight = FontWeight(600),
                fontSize = 18.sp
            )


        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            horizontalAlignment = Alignment
                .CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .width(350.dp)
                ){
                    TextoComTodosAtributos(
                        value = "Alguma Observação?",
                        corTexto = colorResource(id = R.color.black),
                        fontWeight = FontWeight(400),
                        fontSize = 15.sp
                    )
                }
                OutlinedTextField(
                    value = observationState,
                    onValueChange = {
                                    observationState = it
                    },
                    modifier = Modifier
                        .height(200.dp)
                        .width(350.dp),
                    label = {
                        Text(
                            text = "Digite aqui sua observação",
                            color = colorResource(id = R.color.black)
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = colorResource(id = R.color.green_31),
                        unfocusedBorderColor = Color.Black)

                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(250.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.green_31))
            ) {
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