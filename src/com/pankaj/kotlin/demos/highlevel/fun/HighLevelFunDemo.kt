package com.pankaj.kotlin.demos.highlevel.`fun`

fun main(args: Array<String>): Unit {
    val add = Add()
    add.addition(10, 20)
    add.addition(10, 30, object : MyInterface {
        override fun printSum(sum: Int) {
            println("Sum is $sum")
        }

    })


    add.addition(10, 40, { sum: Int -> println("Sum from Lambda is $sum") })

    var myFullNameVar: (String, String) -> String = { fisrtName: String, lastName: String -> fisrtName + " " + lastName }
    val concatination = add.concatination("Pankaj", "Kharche", myFullNameVar)
    println("Full name --> is: $concatination")

    var result = 0
    var lamdaExp: (Int, Int) -> Unit = { x: Int, y: Int -> result = x + y }
    val addtion = add.addtion(10, 50, lamdaExp)
    println("Addition is: $result")

    val reversedString = add.reverseString("Pankaj Kharche", { it.reversed() })
    println("Reversed string is: $reversedString")
}

interface MyInterface {
    fun printSum(sum: Int)
}

class Add {

    fun addition(a: Int, b: Int) {
        println(a + b)
    }

    fun addition(a: Int, b: Int, action: MyInterface) {
        action.printSum(a + b)//println(a + b)
    }

    fun addition(a: Int, b: Int, action: (Int) -> Unit) {
        action(a + b)
    }


    fun concatination(firstName: String, lastName: String, action: (String, String) -> String): String {
        return action(firstName, lastName)
    }

    fun addtion(a: Int, b: Int, myLambda: (Int, Int) -> Unit): Int {
        myLambda(a, b)
        return 0
    }

    fun reverseString(string: String, myStirngLambda: (String) -> String): String {
        return myStirngLambda(string)
    }
}