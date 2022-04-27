package com.example.kotlinintermedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enum Classes
        enumClasses()
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
}