package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2
        //tiposDeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
       // arrays()

        //Leccion 6
        //maps()

        //Leccion 7
        //loops()

        //Leccion 8
        //nullSafety()

        //Leccion 9
        //funciones()

        //Lección 10
        //clases()
    }

    /*variables y constantes*/
    private fun variablesYConstantes(){
        //variables
       var myFirstVariable = "Hello Hackermen"
        var myFirstNumber = 1
        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a MoureDev"
        println(myFirstVariable)
        //No podemos asignar un tipo Int a una variable tipo String
       // myFirstVariable = 1

        var mySecondVariable = "suscribete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "Gracias"
        println(myFirstVariable)

        //Constantes

        val myFirstConstant = "¿Te ha gustado kotlin?"
        println(myFirstConstant)

        //Una constante no puede modificar su valor
        //myFirstConstant = "dkkk"

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }

    //Tipos de datos
    private fun tiposDeDatos() {

        //string

        val myString = "Holas Hackermen!"
        val myString2 = "Bienvenidos a mouredev"
        val myString3 = myString +" " +myString2
        println(myString3)

        //Enteros (Byte,short,Int,Long)
        val myInt = 1
        val myint2 = 2
        val myInt3 = myInt + myint2
        println(myInt3)

        //Decimales (Float,Double)

        val myDouble = 1.5
        val myfloat = 1.5f
        val myDouble2 = 2.6
        val myDouble3 = 1 // in a number Int
        val myDouble4  =myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (Bool)
        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    //Sentencia If
    private fun sentenciaIf(){
        val myNumber = 5
        //Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // !=  desigualdad

        //Operadores Logicos
        // && "y"
        // || "o"
        // ! "no"

        if(!(myNumber < 10 && myNumber > 5) || myNumber == 53) {
            //Sentencia IF
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")

        }else if(myNumber == 60) {
            //Sentencia else If

            print("$myNumber es igual a 60")
        }else if(myNumber != 70){

                //Sentencia else If
                print("$myNumber es igual a 70")
        }else{
            //Sentencia Else
            println("$myNumber mayor que 10 o menor o igual que 5 y no es igual a 53")
        }
    }

    //Sentencia when
    fun  sentenciaWhen(){

        val country = "España"

        when (country) {
            "España" -> {
                println("El idioma es español")
            }"México" -> {
            println("El idioma es español")
            }"Perú" -> {
            println("El idioma es español")
            }"Colombia" -> {
            println("El idioma es español")
            }"Argentina" -> {
            println("El idioma es español")
            }"USA" -> {
            println("El idioma es ingles")
            }"Francia" -> {
            println("El idioma es frances")
            }else ->{
            println("No se conoce el Idioma")
            }
        }

        //o quedaria así
        when (country) {
            "España","México","Perú","Colombia","Argentina" -> {
                println("El idioma es español")
        }"USA" -> {
            println("El idioma es ingles")
        }"Francia" -> {
            println("El idioma es frances")
        }else ->{
            println("No se conoce el Idioma")
        }
        }

        //when con Int

        val age = 10

        when(age){
            0,1,2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11 .. 17 ->{
                println("Eres un adolecente")
            }in  18.. 69 ->{
                println("Eres un adulto")
            }in 70..99 -> {
                println("Eres un anciano")
            }else ->{
                println("=#)($(###")
            }

        }
    }

    //Arrays
    fun arrays(){

        val name = "Francisco"
        val surname = "Flores"
        val company = "MattEvan"
        val age = "34"

        //se crea un array
        val myArray = arrayListOf<String>()

        // añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        //Añadir  un conjunto de datos
        myArray.addAll(listOf("Hola","Bienvenidos al tutorial"))
        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]
        println(myCompany)

        //Modificación de datos
        myArray[5] = "Suscribete"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }

        //Otras operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()
        myArray.sort()
    }

    //Mapas o diccionarios
    fun maps(){
                        //valor-Id
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Añadir Valores
        myMap = mapOf("Matt" to 1,"Pedro" to 2,"Evan" to 3)
        println(myMap)

        //Añadir un solo valor
        myMap = mutableMapOf("Matt" to 1,"Pedro" to 2,"Evan" to 3)
        println(myMap)
        myMap["Ana"] = 7
        myMap.put("Adri",8)
        println(myMap)
        myMap.put("Matt",3)
        println(myMap)
        myMap.put("Javi",3)
        println(myMap)

        //Acceso a Datos
        println(myMap["Matt"])

        //Actualizacion de un dato
        myMap["Evan"] = 4
        println(myMap)

        //Eliminar un dato
        myMap.remove("Evan")

    }

    //Loops
    fun loops(){

        //Bucles
        val myArray:List<String> = listOf("Hola","Tutorial","Suscribete")
        val myMap = mutableMapOf("Matt" to 1,"Pedro" to 2,"Evan" to 3)

        //For
        for(myString:String in myArray){
            println(myString)
        }

        for (myElement : MutableMap.MutableEntry<String,Int> in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 0 until 10) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum:Int  in myNumericArray) {
            println(myNum)
        }

        //while

        var x = 0
         while(x < 10){
             println(x)
             //x++
             x+=2
         }
    }

    /*Seguridad contra nulos (Null Safety)*/
    fun nullSafety(){
        var myString = "MattEvan"
        //myString = null // da error de compilación
        println(myString)

        //Variable null safety
        var mySafetystring: String? = "Matt evan null safety"
        mySafetystring = null
        println(mySafetystring)

       mySafetystring = "Hola"
        println(mySafetystring)

        /*if (mySafetystring != null){
            println(mySafetystring!!)
        }else{
            println(mySafetystring)
        }*/

        //safe call
        println(mySafetystring!!.length)
        println(mySafetystring?.length)

        mySafetystring?.let {
            println(it)
        }?: run{
            println(mySafetystring)

        }

    }

    //funciones
    fun funciones(){
    sayHello()
        sayMyName()
        sayMyName2("Pako")
        sayMyNameAndAge("paco",34)
        sumTwoNumbers(10,5)
        val sumResult = sumTwoNumbers(10,5)
        println(sumResult)
        println(sumTwoNumbers(10,5))
        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))

    }

    //Funcion simple
    fun sayHello() {
        println("Hola")
    }

    //Funciones con un parámetro de entrada
    fun sayMyName() {
        println("Hola, mi nombre es Packo")
    }

    fun sayMyName2(name: String) {
        println("Hola, mi nombre es $name")
    }
    //Funciones con más de un parámetro de entrada
    fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    //Funciones con valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int{
        val sum =  firstNumber + secondNumber
        return  sum
    }

    //Clases
    fun clases() {

        //val paco = Programmer("Packo", 32, arrayOf("Kotlin", "swift"))
        val paco = Programmer("Packo", 32, arrayOf(Programmer.Language.KOTLIN,Programmer.Language.SWIFT),null)
        println(paco.name)
        paco.age =40
        paco.code()
        //val matt = Programmer("Matt", 12, arrayOf("Java"))
        val matt = Programmer("Matt", 12, arrayOf(Programmer.Language.JAVA), arrayOf(paco))//Programmer("Matt", 12, arrayOf(Programmer.Language.JAVA),null)
        matt.code()
        println("${matt.friends?.first()?.name} es amigo de ${matt.name}")

    }

}