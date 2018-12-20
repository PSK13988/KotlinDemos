package com.pankaj.kotlin.demos.objectdemo

fun main(args: Array<String>): Unit {
    println("Data id: ${DataConnector.dataId}")
    DataConnector.test()
    DataConnector.parentFun()

    MyClass.testFunction()
}

class MyClass {
    companion object {
        var id: Int = 0
        fun testFunction() {
            println("Inside testFunciton")
        }
    }
}


open class Parent {
    fun parentFun() {
        println("Parent function")
    }
}

object DataConnector : Parent() {
    var dataId: String = "DataConnector"

    fun test() {
        println("Object method")
    }
}