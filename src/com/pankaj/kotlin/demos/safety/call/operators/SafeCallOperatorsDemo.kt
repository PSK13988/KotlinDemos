package com.pankaj.kotlin.demos.safety.call.operators

fun main(x: Array<String>): Unit {
    var myVal: String? = null

    println("The length of string is : ${myVal?.length}")

    myVal?.let { println("The length of string is : ${myVal.length}") }

    var length = myVal?.length ?: 0
    println("The length of string is : ${length}")

    val country = Country()
    country.name = "India"
    println(country.name)

    val pi: Float by lazy { 3.14f }
    val country1: Country by lazy { Country() }
}


class Country {
    lateinit var name: String

}