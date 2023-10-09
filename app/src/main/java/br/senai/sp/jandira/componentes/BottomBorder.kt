package br.senai.sp.jandira.componentes

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

@Composable
fun Modifier.bottomBorder(strokeHeight: Dp, color: Color) = composed(
    factory = {
        val density = LocalDensity.current
        val strokeHeightPx = density.run { strokeHeight.toPx() }

        Modifier.drawBehind {
            val width = size.width
            val height = size.height - strokeHeightPx/2

            drawLine(
                color = color,
                start = Offset(x = 0f, y = height),
                end = Offset(x = width , y = height),
                strokeWidth = strokeHeightPx
            )
        }
    }
)