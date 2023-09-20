package br.senai.sp.jandira.menucomponents.selecteditem.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone
import br.senai.sp.jandira.componentes.Imagem


@Composable
fun Header(navController: NavController) {
    Box(
        modifier = Modifier
            .height(290.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp))
            .paint(
                painterResource(id = R.drawable.coxinha),
                contentScale = ContentScale.Crop
            )
    ){
        Icone(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            descricao = "",
            corIcone = colorResource(id = R.color.white),
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp)
                .size(30.dp)
                .clickable {
                    navController.navigate("menu_screen")
                }
        )
    }

}

@Preview
@Composable
fun HeaderPreview() {

}