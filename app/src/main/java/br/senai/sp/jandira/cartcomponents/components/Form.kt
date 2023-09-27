package br.senai.sp.jandira.cartcomponents.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.componentes.TextoComTodosAtributos
import br.senai.sp.jandira.componentes.TextoComTodosAtributosEModifier


@Composable
fun Form() {

    Column {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Imagem(
                    painter = painterResource(id = R.drawable.breadslogo),
                    descricao = "",
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)

                )
                Column(
                    modifier = Modifier
                        .absoluteOffset(x = -190.dp)

                ) {
                    TextoComTodosAtributos(
                        value = "Name Restaurant",
                        corTexto = Color(29, 34, 27),
                        fontWeight = FontWeight(600),
                        fontSize = 15.sp
                    )

                    TextoComTodosAtributosEModifier(
                        value = "Menu",
                        corTexto = colorResource(id = R.color.green_41),
                        fontWeight = FontWeight(300),
                        fontSize = 10.sp,
                        modifier = Modifier
                            .clickable { }
                    )


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    Form()
}