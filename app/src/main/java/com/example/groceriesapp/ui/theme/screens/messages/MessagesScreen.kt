package com.example.groceriesapp.ui.theme.screens.messages

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun MessagesScreen(navController: NavHostController){
    Column(modifier =Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //Mpesa
        OutlinedButton(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 150.dp),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(3.dp, Color.Gray)
        ) {
            Text(text = "Mpesa", color = Color.Black)

        }
        Spacer(modifier = Modifier.height(15.dp))
        //Sms
        OutlinedButton(
            onClick = {
                val smsIntent= Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0745787905".toUri()
                smsIntent.putExtra("sms_body","Hello,Contact us")
                mContext.startActivity(smsIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 150.dp),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(3.dp, Color.Gray)
        ) {
            Text(text = "Sms", color = Color.Black)

        }
        Spacer(modifier = Modifier.height(15.dp))

        //Call
        OutlinedButton(
            onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0745787905".toUri()
                mContext.startActivity(callIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 150.dp),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(3.dp, Color.Gray)
        )
        {
            Text(text = "Call", color = Color.Black)

        }
        Spacer(modifier = Modifier.height(15.dp))

        //email
        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("stacywanguigichobi@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, contact us")
                mContext.startActivity(shareIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 150.dp),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(3.dp, Color.Gray)
        ) {
            Text(text = "email", color = Color.Black)

        }
        Spacer(modifier = Modifier.height(15.dp))


        //Share
        OutlinedButton(
            onClick = {
                val shareIntent= Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, end = 150.dp),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(3.dp, Color.Gray)
        ) {
            Text(text = "Share", color = Color.Black)

        }

    }
}
@Preview(showBackground = true)
@Composable
fun MessagesScreenPreview(){
    MessagesScreen(rememberNavController())
}