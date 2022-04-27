package com.example.kotlinintermedio

class MyNestedAndInnerClasses {

    private val one = 1
    private fun returnOne():Int {
        return  one
    }

    // clase anidada (nested classes)
    class MyNestedClasses{
        fun sum(first: Int, second: Int): Int{
            return first + second
        }
    }

    // clase Interna (Inner Class)
    inner class MyinnerClass {

        fun sumTwo(number: Int):Int{
            return number + one + returnOne()
        }
    }


}