package action

data class Rectangle(val width:Int, val height: Int){
    val isSquare: Boolean
        get() = height == width
}

fun main(args: Array<String>){
    val r = Rectangle(3, 4)
    val s = Rectangle(3, 3)
    println(r.isSquare)
    println(s.isSquare)
}