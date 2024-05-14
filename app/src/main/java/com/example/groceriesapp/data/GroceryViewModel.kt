package com.example.groceriesapp.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.groceriesapp.models.Grocery
import com.example.groceriesapp.models.Product
import com.example.groceriesapp.navigation.LOGIN_URL
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class GroceryViewModel(var navController:NavHostController, var context: Context) {
    var authViewModel:AuthViewModel
    var progress:ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(LOGIN_URL)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadGrocery(Groceryname:String, Groceryquantity:String, Groceryprice:String, filePath:Uri){
        val groceryId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("groceries/$groceryId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var grocery = Grocery(Groceryname,Groceryquantity,Groceryprice,imageUrl,groceryId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("groceries/$groceryId")
                    databaseRef.setValue(grocery).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allGroceries(
        grocery:MutableState<Grocery>,
        groceries:SnapshotStateList<Grocery>):SnapshotStateList<Grocery>{
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Groceries")
        ref.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                groceries.clear()
                for (snap in snapshot.children){
                    var retrievedGrocery = snap.getValue(Grocery::class.java)
                    grocery.value = retrievedGrocery!!
                    groceries.add(retrievedGrocery)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return groceries
    }

    fun deleteGrocery(groceryId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("groceries/$groceryId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}