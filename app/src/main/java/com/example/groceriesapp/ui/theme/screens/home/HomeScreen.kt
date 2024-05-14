package com.example.groceriesapp.ui.theme.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.groceriesapp.BackeryActivity
import com.example.groceriesapp.CookingOil
import com.example.groceriesapp.EggsActivity
import com.example.groceriesapp.FruitsActivity
import com.example.groceriesapp.MeatActivity
import com.example.groceriesapp.R
import com.example.groceriesapp.VegetablesActivity
import com.example.groceriesapp.navigation.HOME_URL

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier.background(Color.Green)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //SearchBar

        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "Search Products") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        //End of searchBar

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))


        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    val mContext = LocalContext.current

                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

                        //Row1

                        Row(
                            modifier = Modifier.padding(start = 25.dp)
                        ) {
                            //Column1
                            Column {
                                Card(modifier = Modifier
                                    .clickable {
                                        mContext.startActivity(
                                            Intent(
                                                mContext,
                                                FruitsActivity::class.java
                                            )
                                        )
                                    }
                                    .height(200.dp)
                                    .width(210.dp)) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_2),
                                            contentDescription = "img2",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Fruits",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                )

                            }
                            //End of column

                            Spacer(modifier = Modifier.width(20.dp))

                            //Column2
                            Column {
                                Card(
                                    modifier = Modifier
                                        .clickable { mContext.startActivity(Intent(mContext, VegetablesActivity::class.java)) }
                                        .height(200.dp)
                                        .width(210.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_3),
                                            contentDescription = "img3",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Vegetables",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
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
                                        .clickable {
                                            mContext.startActivity(
                                                Intent(
                                                    mContext,
                                                    BackeryActivity::class.java
                                                )
                                            )
                                        }
                                        .height(200.dp)
                                        .width(210.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_4),
                                            contentDescription = "img4",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Backery",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                )

                            }
                            //End of column

                            Spacer(modifier = Modifier.width(20.dp))

                            //Column2
                            Column {
                                Card(
                                    modifier = Modifier
                                        .clickable {
                                            mContext.startActivity(
                                                Intent(mContext, EggsActivity::class.java)
                                            ) }
                                        .height(200.dp)
                                        .width(210.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_42),
                                            contentDescription = "img5",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Eggs",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
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
                                        .clickable {
                                            mContext.startActivity(
                                                Intent(
                                                    mContext,
                                                    MeatActivity::class.java
                                                )
                                            )
                                        }
                                        .height(200.dp)
                                        .width(210.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_6),
                                            contentDescription = "img6",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Meat $ Fish",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                )

                            }
                            //End of column

                            Spacer(modifier = Modifier.width(20.dp))

                            //Column2
                            Column {
                                Card(
                                    modifier = Modifier
                                        .clickable {
                                            mContext.startActivity(
                                                Intent(mContext, CookingOil::class.java)
                                            ) }
                                        .height(200.dp)
                                        .width(210.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.img_7),
                                            contentDescription = "img7",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )

                                    }
                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Cooking Oil",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.ExtraBold,
                                )

                            }

                            //End of column

                        }
                        //End of row3

                        Spacer(modifier = Modifier.height(20.dp))


                    }


                }

            }

        )

    }
}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Signup",
        route="signup",
        selectedIcon=Icons.Filled.Face,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = false,
        badges=0
    ),
    BottomNavItem(
        title = "Messages",
        route="Messages",
        selectedIcon=Icons.Filled.MailOutline,
        unselectedIcon=Icons.Outlined.MailOutline,
        hasNews = false,
        badges=0
    ),
    BottomNavItem(
        title = "Cart",
        route="Cart",
        selectedIcon=Icons.Filled.ShoppingCart,
        unselectedIcon=Icons.Outlined.ShoppingCart,
        hasNews = false,
        badges=0
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

        HomeScreen(navController = rememberNavController())

}