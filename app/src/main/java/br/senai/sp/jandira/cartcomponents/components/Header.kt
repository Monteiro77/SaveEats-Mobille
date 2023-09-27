package br.senai.sp.jandira.cartcomponents.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.TextoComTodosAtributos

@Composable
fun Header() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){

            Icone(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    descricao = "",
                    corIcone = colorResource(id = R.color.green_41),
                    modifier = Modifier
                        .size(25.dp)
                        .clickable { }
                )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {


                TextoComTodosAtributos(
                    value = stringResource(id = R.string.cart),
                    corTexto = colorResource(id = R.color.green_41),
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row (
            modifier = Modifier
                .height(2.dp)
                .width(400.dp)
                .background(colorResource(id = R.color.green_41))
                .clip(RoundedCornerShape(100))
        ){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}