package com.pankaj.kotlin.demos.all.any.count.find

fun main(args: Array<String>): Unit {
    val myNumbers = listOf<Int>(2, 3, 45, 5, 6, 89, 69)

    val myAll = myNumbers.all { it > 10 }
    println("All value: $myAll")

    val myAny = myNumbers.any { it > 10 }
    println("Any value: $myAny")

    val myCount = myNumbers.count { it > 10 }
    println("Count value: $myCount")

    val myFindFirst = myNumbers.find { it > 10 }
    println("First greater value from 10 is: $myFindFirst")

    val last = myNumbers.last { it > 10 }
    println("Last : $last")

}