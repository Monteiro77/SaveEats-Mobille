package br.senai.sp.jandira.logincomponent.screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.R
import br.senai.sp.jandira.logincomponent.components.Footer
import br.senai.sp.jandira.logincomponent.components.Form

@Composable
fun LoginScreen() {
    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.prato),
                contentDescription = "",
                modifier = Modifier
                    .size(150.dp)
                    .absoluteOffset(x = -120.dp, y = -32.dp)
                    .graphicsLayer {
                        rotationY = 550f
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(250.dp)
            )

            Form()

            Image(
                painter = painterResource(id = R.drawable.pao),
                contentDescription = "",
                modifier = Modifier
                    .size(300.dp)
                    .absoluteOffset(x = 135.dp, y = -300.dp)
            )

            Footer()



            




        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}