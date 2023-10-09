package br.senai.sp.jandira.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

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

@Composable
fun ImagemRedonda(
    painter: Painter,
    descricao: String,
    size: Dp
):Unit {

    Image(
        painter = painter,
        contentDescription = descricao,
        modifier = Modifier
            .clip(CircleShape)
            .size(size)
        ,
        contentScale = ContentScale.Crop
    )


    
}




@Preview
@Composable
fun ImagemPreview() {

}