package com.pankaj.kotlin.demos

fun main(args: Array<String>) {
    // if as expression
    val a = 10
    val b = 11
    val maxValue: Int = if (a > b) a else b
    println("Max value from $a and $b is $maxValue")

    var value: Int = 10
    var stValue: String = when (value) {
        in 1..5 -> "between 1 to 5"
        in 5..10 -> "between 5 to 10"
        else -> "Not avalibale in the given range"
    }
    println(stValue)



    outerLoop@ for (i in 1..5) {
        for (j in 1..5) {
            println("$i, $j")
            if (i == 3 && j == 3)
                break@outerLoop
        }
    }
}


