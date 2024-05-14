package com.example.groceriesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.groceriesapp.R

class FruitsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFruits()
        }
    }
}

@Composable
fun MyFruits() {
    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxSize()
    )
    {
        Text(text = "Fruits",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,

        )

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
                                painter = painterResource(id = R.drawable.img_8),
                                contentDescription = "img8",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Apples",
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
                        text = "Ksh.200",
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
                                painter = painterResource(id = R.drawable.img_9),
                                contentDescription = "img9",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Bananas",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1Bunch",
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
                                painter = painterResource(id = R.drawable.img_10),
                                contentDescription = "img10",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pineapple",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1Pineapple",
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
                                painter = painterResource(id = R.drawable.img_11),
                                contentDescription = "img11",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Mango",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1Mango",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.50",
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
                                painter = painterResource(id = R.drawable.img_12),
                                contentDescription = "img12",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Grapes",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1Bunch",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.100",
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
                                painter = painterResource(id = R.drawable.img_13),
                                contentDescription = "img13",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pears",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1 pears",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.50",
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
fun MyFruitsPreview(){
    MyFruits()
}