package com.example.groceriesapp.ui.theme.screens.Cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShoppingCart(navController: NavHostController) {
    var newItem by remember { mutableStateOf("") }
    var cartItems by remember { mutableStateOf(mutableListOf<String>()) }

    Column(modifier = Modifier.padding(16.dp)) {
        // Text field to add new item
        OutlinedTextField(
            value = newItem,
            onValueChange = { newItem = it },
            label = { Text("Add new item") },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                if (newItem.isNotBlank()) {
                    cartItems.add(newItem)
                    newItem = ""
                }
            }),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Displaying added items
        LazyColumn {
            items(cartItems) { item ->
                ShoppingCartItem(
                    item = item,
                    onDeleteItem = { cartItems.remove(item) }
                )
            }
        }
    }
}

@Composable
fun ShoppingCartItem(item: String, onDeleteItem: () -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = item, modifier = Modifier.weight(1f))
            IconButton(onClick = onDeleteItem) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete"
                )
            }
        }
    }
}


