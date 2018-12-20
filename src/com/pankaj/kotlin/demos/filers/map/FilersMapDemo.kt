package com.pankaj.kotlin.demos.filers.map

fun main(x: Array<String>): Unit {

    // Filtering and Map on Integers
    val myNumbers: List<Int> = listOf<Int>(2, 3, 55, 67, 8, 8, 9, 20, 3, 4, 39)

    val lessThanTen: List<Int> = myNumbers.filter { it < 10 }
    for (element in lessThanTen) {
        println(element)
    }
    println("----------------above Numbers filter output---------------------------")

    val squreOfGreaterThanTen: List<Int> = myNumbers.filter { it > 10 }.map { it * it }
    for (element in squreOfGreaterThanTen) {
        println(element)
    }

    // End
    println("-----------------above number map output--------------------------")

    // Fitering and map on Strings

    val myString = listOf<String>("Shiva", "Mahesh", "Ramesh", "Suresh", "Mohan", "Indra")

    val myFilteredString = myString.filter { it.endsWith("esh") }

    for (element in myFilteredString) {
        println(element)
    }

    println("-----------------above String filer output endswith 'esh' --------------------------")

    val personList = listOf<Person>(Person("Pankaj", 30), Person("Ashish", 31), Person("Suresh", 33))
    val personFilterList = personList.filter { it.age > 30 }

    for (element in personFilterList) {
        println(element.name)
    }

    println("------------------above class Person filtered above age of 30 -------------------------")
}

class Person(var name: String, var age: Int)
