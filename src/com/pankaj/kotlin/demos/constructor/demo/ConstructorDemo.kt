package com.pankaj.kotlin.demos.constructor.demo

fun main(args: Array<String>) {

    val sgchild = SuperGrandChild("Parent", "child");
    sgchild.tested()
    println(sgchild.c);

}

open class Parent(var name: String) {
    init {
        println("From Parent Class $name")
    }

    private val a: String = "a is private"
    protected val b: String = "b is protected"
    internal val c: String = "c is internal"
    val d: String = "d is public"
}

open class Child(name: String, var name1: String) : Parent(name) {
    init {
        //println("From Child class name: $name and name1: $name1")
    }

    fun test() {
        println(b)
    }
}


open class GrandChild(name: String, name1: String) : Child(name, name1) {
    fun testing(): Unit {
        println(b)
    }
}

class SuperGrandChild(name: String, name1: String) : GrandChild(name, name1) {
    fun tested(): Unit {
        println(b)
    }
}