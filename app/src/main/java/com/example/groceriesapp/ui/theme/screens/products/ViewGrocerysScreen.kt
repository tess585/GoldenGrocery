package com.example.groceriesapp.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.groceriesapp.data.GroceryViewModel
import com.example.groceriesapp.data.ProductViewModel
import com.example.groceriesapp.models.Grocery
import com.example.groceriesapp.models.Product


@Composable
fun ViewgrocerysScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var groceryRepository = GroceryViewModel(navController, context)


        val emptyGroceryState = remember { mutableStateOf(Grocery("","","","","")) }
        var emptyGroceryListState = remember { mutableStateListOf<Grocery>() }

        var groceries = groceryRepository.allGroceries(emptyGroceryState, emptyGroceryListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(groceries){
                    GroceryItem(
                        Groceryname = it.Groceryname,
                        Groceryquantity = it.Groceryquantity,
                        Groceryprice = it.Groceryprice,
                        id = it.id,
                        navController = navController,
                        groceryRepository = groceryRepository,
                        groceryImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun GroceryItem(Groceryname:String, Groceryquantity:String, Groceryprice:String, id:String,
                navController:NavHostController,
                groceryRepository:GroceryViewModel, groceryImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = Groceryname)
        Text(text = Groceryquantity)
        Text(text = Groceryprice)
        Image(
            painter = rememberAsyncImagePainter(groceryImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            groceryRepository.deleteGrocery(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PRODUCTS+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewgrocerysScreenPreview(){
        ViewgrocerysScreen(navController = rememberNavController())

}