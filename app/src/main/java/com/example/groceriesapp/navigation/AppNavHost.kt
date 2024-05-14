package com.example.groceriesappe.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.groceriesapp.navigation.ADD_GROCERYS_URL

import com.example.groceriesapp.navigation.HOME_URL
import com.example.groceriesapp.navigation.LOGIN_URL
import com.example.groceriesapp.navigation.MESSAGES_URL
import com.example.groceriesapp.navigation.PAYMENT_URL
import com.example.groceriesapp.navigation.SHOPPINGCART_URL
import com.example.groceriesapp.navigation.SIGNUP_URL
import com.example.groceriesapp.navigation.SPLASH_URL
import com.example.groceriesapp.navigation.VIEW_GROCERYS_URL

import com.example.groceriesapp.ui.theme.screens.login.LoginScreen
import com.example.groceriesapp.ui.theme.screens.signup.SignupScreen
import com.example.groceriesapp.ui.theme.screens.Cart.ShoppingCart
import com.example.groceriesapp.ui.theme.screens.Splash.SplashScreen
import com.example.groceriesapp.ui.theme.screens.home.HomeScreen
import com.example.groceriesapp.ui.theme.screens.messages.MessagesScreen
import com.example.groceriesapp.ui.theme.screens.payment.PaymentScreen
import com.example.groceriesapp.ui.theme.screens.products.AddgrocerysScreen
import com.example.groceriesapp.ui.theme.screens.products.AddgrocerysScreen
import com.example.groceriesapp.ui.theme.screens.products.ViewgrocerysScreen
import com.example.groceriesapp.ui.theme.screens.products.ViewgrocerysScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(SPLASH_URL){
            SplashScreen(navController = navController)
        }

        composable(MESSAGES_URL){
            MessagesScreen(navController = navController)
        }
        composable(SHOPPINGCART_URL){
            ShoppingCart(navController = navController)
        }
        composable(PAYMENT_URL){
            PaymentScreen(navController = navController)
        }
        composable(ADD_GROCERYS_URL){
            AddgrocerysScreen(navController = navController)
        }
        composable(VIEW_GROCERYS_URL){
            ViewgrocerysScreen(navController = navController)
        }

    }
}