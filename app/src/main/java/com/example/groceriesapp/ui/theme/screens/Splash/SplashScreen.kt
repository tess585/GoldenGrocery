package com.example.groceriesapp.ui.theme.screens.Splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceriesapp.navigation.HOME_URL
import com.example.groceriesapp.navigation.LOGIN_URL
import com.example.groceriesapp.navigation.SPLASH_URL
import com.example.groceriesapp.R
import com.example.groceriesapp.navigation.SIGNUP_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .paint(painterResource(id = R.drawable.img_47),
                contentScale = ContentScale.FillBounds)
            .fillMaxSize(),
    ) {
        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(5000)
            navController.navigate(HOME_URL)
        }


    }

}
@Preview(showBackground = true)
@Composable
fun SplashScreenPreView(){
    SplashScreen(rememberNavController())
}