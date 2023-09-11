package br.senai.sp.jandira.splashcomponent

import android.os.Bundle
import android.view.animation.OvershootInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.MainScreen
import br.senai.sp.jandira.R
import br.senai.sp.jandira.logincomponent.screen.LoginScreen
import br.senai.sp.jandira.singupcomponent.screen.FirstSignUpScreen
import br.senai.sp.jandira.singupcomponent.screen.SecondSignUpScreen
import br.senai.sp.jandira.ui.theme.theme.SaveEatsTheme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SaveEatsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ) {
        composable("splash_screen") {
            SplashScreen(navController = navController)
        }

        composable("login_screen") {
            LoginScreen(navController = navController)
        }

        composable("singup_screen") {
            FirstSignUpScreen(navController = navController)
        }

        composable("signup2_screen") {
            SecondSignUpScreen(navController = navController)
        }

        composable("home_screen"){
            MainScreen(navController = navController)
        }
    }
}

@Composable
fun SplashScreen(navController: NavController) {

    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true) {

        scale.animateTo(
            targetValue = .5f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = {
                    OvershootInterpolator(8f)
                        .getInterpolation(it)
                }
            )
        )
        delay(1000L)
        navController.navigate("login_screen")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(20, 99, 0)
    ) {

        Image(
            modifier = Modifier
                .scale(scale.value),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
        )

    }

}