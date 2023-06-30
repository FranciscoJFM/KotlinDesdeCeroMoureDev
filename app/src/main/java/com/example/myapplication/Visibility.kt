package com.example.myapplication

class Visibility {
    var name: String? = null
    fun sayName(){
        name?.let { println("My nombre es $it")
        }?: run {
            println("No tengo nombre")
        }
    }
}