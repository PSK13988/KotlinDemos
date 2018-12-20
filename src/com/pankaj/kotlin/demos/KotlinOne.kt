@file:JvmName("Kot")

package com.pankaj.kotlin.demos

import com.pankaj.kotlin.demos.com.myjava.MyJava

fun main(args: Array<String>) {

    val myJava = MyJava();
    //println(myJava.stringValue)

    var str1 = "Hello"
    var str2 = "Friends!"

    var str3 = "Heyya"
    println(str3.addWithSpace(str1, str2))

    var arr = arrayOf(1, 2, 3);

    var a = 15 getSum arr
    println("Sum is equal: $a")
}

fun String.addWithSpace(str1: String, str2: String): String {
    return this + " " + str1 + " " + str2;
}

infix fun Int.getSum(arr: Array<Int>): Int {
    var sum: Int = 0
    for (i in arr) {
        sum += i
    }
    return sum + this
}

@JvmOverloads
fun test(x: Int, y: Int, z: Int = 10): Int {
    return x + y + z;
}

fun getKotlinValue(): String {
    return "MyKotlin"
}
