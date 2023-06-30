package com.example.myapplication

class Designer(name:String, age:Int): Person(name, age) {
    override fun work(){
        //super.work()
        println("Esta persona esta diseñando")
    }
}