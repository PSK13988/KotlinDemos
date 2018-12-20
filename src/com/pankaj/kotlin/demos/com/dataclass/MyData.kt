package com.pankaj.kotlin.demos.com.dataclass

data class Person(var name: String, var id: Int, var age: Int) //this is data class

fun main(args: Array<String>) {
    var person1 = Person("Pankaj", 1, 30)
    var person2 = Person("Pankaj", 1, 30)

    var variable:Any;

    if(person1.equals(person2)) println(true) else println(false)  // This obj is of data class thats why it is true
    if(person1 == person2) {
        println(true)
        println(person1)
        print(person1.hashCode())
    }else println(false)
}