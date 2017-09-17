package com.teja

/**
 * Created by tejakantamneni on 2/28/16.
 */

data class Person(val name: String, val age: Int);


fun main(args: Array<String>) {
    println("hello...")
    val k = Person("Keya", 6);
    val c = Person("Chaitu", 30);
    val t = Person("Teja", 36);
    val people = listOf(k, c, t)

    val adults = people.filter { it -> it.age > 20 }

    print("Adults are: ${adults.map { it.name }.reduce { s, s1 -> s + ", "+ s1 }}")

}
