package com.example.groceriesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.groceriesapp.R
import com.example.groceriesapp.ui.theme.screens.home.HomeScreen
import com.example.groceriesapp.ui.theme.screens.home.HomeScreenPreview


class BackeryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBackery()
        }
    }
}

@Composable
fun MyBackery(){

    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxSize()

    )
    {
        Text(text = "Backery",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold, )

        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            //Row1

            Row(
                modifier = Modifier.padding(start = 25.dp)
            ) {
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_14),
                                contentDescription = "img14",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "QueenCakes",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "6in packet",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.180",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_15),
                                contentDescription = "img15",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Cookies",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "12pieces",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }
                //End of column2

            }
            //End of row1

            Spacer(modifier = Modifier.height(20.dp))

            //Row2

            Row(
                modifier = Modifier.padding(start = 25.dp)
            ) {
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_16),
                                contentDescription = "img16",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Donuts",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "10Donuts",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.250",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_17),
                                contentDescription = "img17",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Birthday Cake",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1kg",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }

                //End of column

            }
            //End of row2

            Spacer(modifier = Modifier.height(20.dp))

            //Row3

            Row(
                modifier = Modifier.padding(start = 25.dp)
            ) {
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_18),
                                contentDescription = "img18",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Biscuits",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1kg",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.581",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }
                //End of column

                Spacer(modifier = Modifier.width(20.dp))

                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(1600.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_19),
                                contentDescription = "img19",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pastry",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1 piece",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.200",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )

                }

                //End of column

            }
            //End of row3

            Spacer(modifier = Modifier.height(20.dp))


        }

    }
}

@Preview(showBackground = true)
@Composable
fun MyBackeryPreview(){
    MyBackery()
}