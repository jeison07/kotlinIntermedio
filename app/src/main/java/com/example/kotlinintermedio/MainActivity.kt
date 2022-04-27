package com.example.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes
        //enumClasses()

        //Nested and Inner Classes
        nestedAndInnerClasses()
    }
    // leccion 1 kotlin intermedio: Enum classes
    enum class Direction (val dir: Int){
        NORTH( 1), SOUTH(-1), EAST(1), WEST(-1);

        fun description() : String{

            return when (this){
                NORTH -> "la Direccion es NORTE"
                SOUTH -> "La Direccion es SUR"
                EAST -> "La Direccion es ESTE"
                WEST -> "La Direccion ES OESTE"
            }
        }
    }
    private fun  enumClasses(){

        //asignacion de valores
        var userDirection: Direction? = null
        println("Direction: $userDirection")

        userDirection = Direction.NORTH
        println("Direction: $userDirection")

        userDirection = Direction.EAST
        println("Direction: $userDirection")

        // propiedades por defecto
        println("propiedad name: ${userDirection.name}")
        println("propiedad ordinal: ${userDirection.ordinal}")

        // funciones
        println(userDirection.description())

        // inicializacion
        println(userDirection.dir)

    }
    // leccion 2 kotlin intermedio: Nested and Inner Classes
    private fun nestedAndInnerClasses(){
        //clases anidada (Nested)
        val myNestedClasses = MyNestedAndInnerClasses.MyNestedClasses()
        val sum: Int = myNestedClasses.sum(10,5)
        println(" El resultado de ls suma es $sum")

        //clase interna (inner classes)
        val myInnerClass = MyNestedAndInnerClasses().MyinnerClass()
        val sumTwo: Int = myInnerClass.sumTwo(10)
        println(" El resultado de sumar dos es $sumTwo")

    }
}