package com.teja

fun sum(a: Int, b: Int) = a + b

fun main(args: Array<String>){
    var a = Integer.parseInt(args[0])
    var b = Integer.parseInt(args[1])

    println("Sum of ${a}  and ${b} is ${a+b}")
}