package br.senai.sp.jandira.menucomponents.menu.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.BottomBarScreen
import br.senai.sp.jandira.R
import br.senai.sp.jandira.menucomponents.menu.components.Form
import br.senai.sp.jandira.menucomponents.menu.components.Header
import br.senai.sp.jandira.componentes.NavigationRow

@Composable
fun MenuScreen(
    navController: NavHostController,
    navController2: NavHostController
) {

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
            NavigationRow(navController = navController, navigation = "home_screen")
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            ) {
                Column {
                    Header(navController, navController2)
                    Spacer(modifier = Modifier.height(20.dp))
                    Form(navController2)

                }


            }

        }

    }

}


