package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Date
import kotlin.concurrent.thread

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
typealias MyNestedClass = MyNestedAndInnerClass.MyNestedClass

class EnumClases : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //Enum Classes
        enumClase()

        //nested Inner classes
        nestedAndInnerClasses()

        //Herencia de clases
        classInherintance()

        //interfaces
        interfaces()

        //Modificadores de visivilidad
        visibilityModifiers()

        //Data clases
        dataClasses()

        //Type aliases
        typeAliases()

        //Destructuring declarations
        destructuringDeclarations()

        //Extensions
        extensions()

        //Lambas
        lambdas()
    }

    //Lección 1 kotlin intermedio : fun Enum class
    enum class Direction(val dir: Int) {
        NORTE(1), SUR(0), ESTE(1), OESTE(-1);

        fun description(): String {

            /*if (this ==  NORTE){
                return "La dirección es NORTE"
            }*/
            return when (this) {
                NORTE -> "La dirección es NORTE"
                SUR -> "La dirección es SUR"
                ESTE -> "La dirección es ESTE"
                OESTE -> "La dirección es OESTE"
                // else -> " No esta la dirección"
            }
        }
    }

    private fun enumClase() {

        //Asignación de valores
        var userdirection: Direction? = null
        println("Dirección: $userdirection")
        userdirection = Direction.NORTE
        println("Dirección: $userdirection")
        userdirection = Direction.OESTE
        println("Dirección: $userdirection")

        println("Propiedad name : ${userdirection.name}")
        println("Propiedad ordina : ${userdirection.ordinal}")
        println("Dirección: ${userdirection.dir}")
        println("Dirección: ${userdirection.description()}")

    }

    //Clases anidadas
    private fun nestedAndInnerClasses() {

        val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
        val sum: Int = myNestedClass.sum(10, 5)
        println("La suma es: $sum")
        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sumTwo = myInnerClass.sumTwo(10)
        println("el resutado de sumar dos es $sumTwo")

    }

    //Herencia de clases
    private fun classInherintance() {

        val person = Person("Evan", 3)
        println(person)

        val programmer1 = Programmer2("Packo", 34, "Kotlin")
        programmer1.work()
        programmer1.sayLanguage()
        programmer1.goToWork()
        programmer1.drive()

        val designer = Designer("Matt", 6)
        designer.work()
        designer.goToWork()
    }

    //Interfaces

    private fun interfaces() {
        val gamer = Person("Paco", 34)
        gamer.play()
        gamer.stream()

    }

    //Modificadores de visibilidad
    private fun visibilityModifiers() {
        val visibility = Visibility()
        visibility.name = "Paco"
        visibility.sayName()
    }

    private fun dataClasses() {

        val brais = Worker("Paco", 33, "Developer")
        brais.lastWorks = "Musico"
        val developer = Worker("Paco", 33, "Developer")

        val matt = Worker()

        //Equals & hashcode
        if (brais.equals(developer)) {
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        //toString
        println(brais.toString())

        // copy
        val matt2 = brais.copy(age = 90)
        println(brais.toString())
        println(matt2.toString())

        //ComponenteN funciones de destructuración de clases
        val (name, age) = developer
        println(name)
        println(age)
    }

    //Type aliases

    private var myMap: MyMapList = mutableMapOf()
    private fun typeAliases() {
        var myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Matt", "Flores")
        myNewMap[2] = arrayListOf("MattEvan", "Paco")

        myMap = myNewMap

    }

    //Destructuración declarations
    private fun destructuringDeclarations() {
        val (name, age, work) = Worker("Paco", 33, "Developer")
        println("$name,$age,$work")

        /*val (name,_,work) = Worker("Paco",33,"Developer")

        println("$name,$work")*/

        val easyAndroid = Worker("easyAndroid", 34, "dev")
        println(easyAndroid.component1())

        val (mattName, mattAge, mattWork) = myWorker()
        println("$mattName,$mattAge,$mattWork")

        val myMap = mapOf(1 to "Matt", 2 to "Paco", 3 to "Evan")
        for (element in myMap) {
            println("${element.key},${element.value}")
            println("${element.component1()},${element.component2()}")
        }

        for ((id, name) in myMap) {
            println("${id},${name}")
        }
    }

    private fun myWorker(): Worker {
        return Worker("Matt", 6, "dev")
    }

    //Extensions
    private fun extensions() {
        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSizer)

        val myDateNullable: Date? = null
        println(myDateNullable.customFormat())
        println(myDateNullable.formatSizer)
    }

    private fun lambdas() {
        val myIntList = arrayListOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val myFilterIntList = myIntList.filter { myInt ->
            println(myInt)
            if (myInt == 1){
                return@filter true
            }
            myInt > 5
        }
        println(myFilterIntList)

        val mySumFun = fun(x:Int, y:Int) :Int{
            return x+y
        }

        val mySumFun2 = fun(x:Int, y:Int) :Int = x+y
        val myMultFun = fun(x:Int, y:Int) :Int = x+y

        myAsyncFun("Matt"){
            println(it)
        }

        println(myOperateFun(5,10,mySumFun2))
        println(myOperateFun(5,10,myMultFun))

        myOperateFun(5,10){x,y -> x-y}
    }

    private fun myOperateFun(x:Int, y:Int, myFun:(Int,Int)->Int):Int{
       return  myFun(x,y)
    }

    private fun myAsyncFun(name:String, hello:(String)->Unit){
        val myNewString = "Hello $name"
        hello(myNewString)
        thread {  Thread.sleep(5000)
        hello(myNewString)
        }
    }
}