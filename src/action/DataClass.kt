package action

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("Teja", 39), Person("Keya", 9))
    val older = persons.maxBy { it.age ?: 0 }
    print(older)
}