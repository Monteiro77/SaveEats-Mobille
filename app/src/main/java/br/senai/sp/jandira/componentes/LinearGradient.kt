package br.senai.sp.jandira.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.R

@Composable
fun LinearGradient(): Brush {
 val gradient = Brush.linearGradient(
  0.01f to colorResource(id = R.color.black),
  .8f to Color.White,
  start = Offset(.1f, .1f),
  end = Offset.Infinite,
 )


 return gradient

}

@Preview(showSystemUi = true)
@Composable
fun LinearGradientPreview() {
 LinearGradient()
}