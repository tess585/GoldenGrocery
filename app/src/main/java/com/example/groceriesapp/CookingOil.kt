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


class CookingOil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCookingOil()
        }
    }
}

@Composable
fun MyCookingOil(){
    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxSize()
    )
    {
        Text(text = "CookingOil",
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
                                painter = painterResource(id = R.drawable.img_20),
                                contentDescription = "img20",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Rina",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "20L",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.5899",
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
                                painter = painterResource(id = R.drawable.img_21),
                                contentDescription = "img21",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "GoldenFry",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "20L",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.5749",
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
                                painter = painterResource(id = R.drawable.img_22),
                                contentDescription = "img22",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Sun Gold",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "20l",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.6888",
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
                                painter = painterResource(id = R.drawable.img_26),
                                contentDescription = "img23",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "fresh fri",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "2l",
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
                                painter = painterResource(id = R.drawable.img_23),
                                contentDescription = "img23",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Eloanto",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "2l",
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
                                painter = painterResource(id = R.drawable.img_25),
                                contentDescription = "img25",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Avena",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "2l",
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
fun MyCookingOilPreview(){
    MyCookingOil()
}