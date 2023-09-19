package br.senai.sp.jandira.menucomponents.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Imagem
import br.senai.sp.jandira.menucomponents.components.Form
import br.senai.sp.jandira.menucomponents.components.Header
import br.senai.sp.jandira.menucomponents.components.NavigationRow

@Composable
fun MenuScreen(navController: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()


    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.menu_background))
//                    .paint(
//                        painterResource(id = R.drawable.background),
//                        contentScale = ContentScale.Crop
//                    )

        ) {
            NavigationRow(navController = navController)
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            ) {
                Column {
                    Header()
                    Spacer(modifier = Modifier.height(20.dp))
                    Form()

                }


            }

        }

    }

}


@Preview(showSystemUi = true)
@Composable
fun MenuScreenPreview() {

}