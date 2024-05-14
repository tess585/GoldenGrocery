package com.example.groceriesapp.ui.theme.screens.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.groceriesapp.R
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceriesapp.data.AuthViewModel
import com.example.groceriesapp.navigation.HOME_URL
import com.example.groceriesapp.navigation.LOGIN_URL
import com.example.groceriesapp.navigation.SIGNUP_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {

    Column(modifier = Modifier.clickable {navController.navigate(HOME_URL)}
        .background(Color.Green)
        .fillMaxSize()
    ) {

//        val coroutine = rememberCoroutineScope()
//        coroutine.launch {
//            delay(8000)
//            navController.navigate(SIGNUP_URL)
//        }

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center)
        {
            Image(painter = painterResource(id = R.drawable.img_51),
                contentDescription ="img_51",
                modifier = Modifier.size
                    (200.dp)
                    .clip(shape = CircleShape)
                    .fillMaxSize(),
                contentScale = ContentScale.Crop)

        }

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text(text = "email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person" ) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = {password = it},
            placeholder = { Text(text = "password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock" ) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        Box(modifier = Modifier
            .clickable {navController.navigate(LOGIN_URL)}
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(onClick = {  },
            ) {
                Text(text = "login")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(modifier = Modifier
            .clickable {navController.navigate(SIGNUP_URL)}
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(onClick = {  },
            ) {
                Text(
                    text = "Do not have account? Signup",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Cursive,
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
        }


    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}