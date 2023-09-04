package br.senai.sp.jandira

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.logincomponent.screen.LoginScreen
import br.senai.sp.jandira.singupcomponent.components.SecondForm
import br.senai.sp.jandira.singupcomponent.screen.SecondSignUpScreen
import br.senai.sp.jandira.singupcomponent.screen.SingUpScreen
import br.senai.sp.jandira.singupcomponent.screen.SingUpScreenPreview
import br.senai.sp.jandira.ui.theme.SaveEatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaveEatsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    SecondSignUpScreen()
                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SaveEatsPreview() {

    SingUpScreenPreview()

}



