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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.groceriesapp.R

class EggsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEggs()
        }
    }
}

@Composable
fun MyEggs(){
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize()
    )
    {
        Text(text = "Eggs",
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
                                painter = painterResource(id = R.drawable.img_44),
                                contentDescription = "img44",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Quails",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "4 Eggs",
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
                                painter = painterResource(id = R.drawable.img_43),
                                contentDescription = "img43",
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
                        text = "1 tray",
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
                                painter = painterResource(id = R.drawable.img_45),
                                contentDescription = "img45",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Duck",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "6Eggs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.550",
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
                                painter = painterResource(id = R.drawable.img_46),
                                contentDescription = "img46",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Goose",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "4 Eggs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.550",
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
                                painter = painterResource(id = R.drawable.img_48),
                                contentDescription = "img48",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Turkey",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "4eggs",
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
                                painter = painterResource(id = R.drawable.img_49),
                                contentDescription = "img49",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Pheasant",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "1 tray",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Ksh.550",
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
fun MyEggsPreview(){
    MyEggs()
}