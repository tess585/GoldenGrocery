package com.example.groceriesapp.models

class Grocery {
    var Groceryname:String = ""
    var Groceryquantity:String = ""
    var Groceryprice:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(Groceryname: String, Groceryquantity: String, Groceryprice: String, imageUrl: String, id: String) {
        this.Groceryname = Groceryname
        this.Groceryquantity = Groceryquantity
        this.Groceryprice = Groceryprice
        this.imageUrl = imageUrl
        this.id = id
    }
    constructor()
}