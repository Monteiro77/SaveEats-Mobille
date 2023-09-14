package br.senai.sp.jandira.componentes

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.R

@Composable
fun Imagem(
    painter: Painter,
    descricao: String,
    modifier: Modifier
): Unit{

    Image(
        painter = painter,
        contentDescription = descricao,
        modifier = modifier
    )

}




@Preview
@Composable
fun ImagemPreview() {

}