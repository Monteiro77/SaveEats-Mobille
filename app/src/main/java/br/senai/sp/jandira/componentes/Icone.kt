package br.senai.sp.jandira.componentes

import android.graphics.drawable.Icon
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Icone(
    painter: Painter,
    descricao: String,
    corIcone: Color,
    modifier: Modifier
) {

    Icon(
        painter = painter,
        contentDescription = descricao,
        tint = corIcone,
        modifier = modifier
    )

}

