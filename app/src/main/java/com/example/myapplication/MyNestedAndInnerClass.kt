package com.example.myapplication

class MyNestedAndInnerClass {
    private  val one = 1

    private fun returnOne() : Int{
        return one
    }
    //Clase anidad.
    class  MyNestedClass{
        fun sum(first: Int,second: Int) : Int{
            return  first+second
        }
    }

    //Clase Interna
    inner class MyInnerClass{
        fun sumOne(number:Int) : Int{
            return  number + one
        }
        fun sumTwo(number:Int) : Int{
            return  number + one + returnOne()
        }
    }
}