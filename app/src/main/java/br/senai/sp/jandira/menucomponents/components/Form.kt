package br.senai.sp.jandira.menucomponents.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun Form() {
    Column (Modifier.fillMaxWidth()){
        TextoComTodosAtributos(
            value = "Menu",
            corTexto = colorResource(id = R.color.green_41),
            fontWeight = FontWeight(500),
            fontSize = 15.sp
        )

        LazyColumn(){
            items(10){
                Card {
                    Row {
                        Imagem(
                            painter = painterResource(id = R.drawable.food),
                            descricao = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(50.dp))
                                .size(50.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}