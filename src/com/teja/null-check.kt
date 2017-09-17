package com.teja


/**
 * Created by tejakantamneni on 9/17/17.
 */

fun parseInt(str: String): Int? {//? is mandatory as we may return null in function call.
    try {
        return java.lang.Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        return null
    }
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun main(args: Array<String>) {
    printProduct("3", "b")
}