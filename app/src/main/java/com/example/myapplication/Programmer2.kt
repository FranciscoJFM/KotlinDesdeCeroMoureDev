package com.example.myapplication

class Programmer2 (name:String, age:Int,val language: String): Person(name, age),Vehicle{
    override fun work(){
        //super.work()
        println("Esta persona esta programando")
    }

    fun sayLanguage(){
        println("Este programador usa el lenguaje $language")
    }

    override fun goToWork() {
        //super.goToWork()
        println("Esta persona va a google")
    }

    override fun drive() {
        //super.drive()
        println("Esta persona conduce un coche")
    }
}
