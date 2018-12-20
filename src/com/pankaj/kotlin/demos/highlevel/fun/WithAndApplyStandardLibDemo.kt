package com.pankaj.kotlin.demos.highlevel.`fun`

fun main(args: Array<String>): Unit {
    println("hello")
    val person = Person()



    with(person) {
        name = "Pankaj Kharche"
        age = 20
    }
    println("Name ${person.name} and age ${person.age}")

    person.apply {
        name = "Pankaj Kharche"
        age = 40
    }.startRun()
}

class Person {
    var name: String = ""
    var age: Int = 0

    fun startRun() {
        println("Person started running")
    }
}