package com.example.groceriesapp

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
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
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
import com.example.groceriesapp.R


class MeatActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMeat()
        }
    }
}

@Composable
fun MyMeat(){
    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxSize()
    )
    {
        Text(text = "Meat",
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
                                painter = painterResource(id = R.drawable.img_36),
                                contentDescription = "img36",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Mutton",
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
                        text = "Ksh.300",
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
                                painter = painterResource(id = R.drawable.img_37),
                                contentDescription = "img37",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Beaf",
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
                        text = "Ksh.350",
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
                                painter = painterResource(id = R.drawable.img_39),
                                contentDescription = "img39",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Chicken",
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
                        text = "Ksh.660",
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
                                painter = painterResource(id = R.drawable.img_40),
                                contentDescription = "img40",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pork",
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
                        text = "Ksh.450",
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
                                painter = painterResource(id = R.drawable.img_41),
                                contentDescription = "img41",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Fish",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "500g",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.400",
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
                                painter = painterResource(id = R.drawable.img_38),
                                contentDescription = "img38",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Rabbit",
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
                        text = "Ksh.350",
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
fun MyMeatPreview(){
    MyMeat()
}