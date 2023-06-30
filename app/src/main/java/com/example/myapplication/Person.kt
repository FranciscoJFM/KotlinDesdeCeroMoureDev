package com.example.myapplication

 open class Person (name:String,age:Int):Work(),Game{
    //Cualquier clase tiene una super clase comun llamado "any"
    open fun work(){
        println("Esta  persona esta trabajando")
    }

     override fun goToWork() {
         TODO("Not yet implemented")
         println("Esta persona va al trabajo")
     }
     //Game Interface

    /* override val game: String
         get() = "Among Us"*/

     override val game: String = "Among Us"

     override fun play() {
         TODO("Not yet implemented")
         println("Esta persona esta jugando $game")
     }
}