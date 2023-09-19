package br.senai.sp.jandira.menucomponents.menu.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation
import br.senai.sp.jandira.BottomBarScreen
import br.senai.sp.jandira.R
import br.senai.sp.jandira.componentes.Icone

@Composable
fun NavigationRow(navController: NavController) {
    var iconeState by remember{
        mutableStateOf(false)
    }

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){


        Icone(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            descricao = "",
            corIcone = colorResource(id = R.color.icon_arrow),
            modifier = Modifier
                .size(30.dp)
                .clickable {
                    navController.navigate(BottomBarScreen.Home.route)
                }
        )

        Icone(
            painter =
            if(iconeState == false) {
                painterResource(id = R.drawable.baseline_favorite_border_24)
            }else{
                painterResource(id = R.drawable.baseline_favorite_24)
            },
            descricao = "",
            corIcone =
            if(iconeState == false) {
                colorResource(id = R.color.unselected_item)
            }else{
                colorResource(id = R.color.red)
            },
            modifier = Modifier
                .clickable {
                    iconeState = iconeState != true
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NavigatioRowPreview() {

}