package week3.generic

class Box <T> (private val item: T){
    fun getItem(): T{
        return item
    }
}

fun main() {
    val intBox = Box(2000)
    val stringBox = Box("Hello Plugin")

    println(intBox.getItem())
    println(stringBox.getItem())
}