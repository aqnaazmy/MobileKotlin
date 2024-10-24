package week3.generic

fun <T : Number> constrains(cons : T){
    println(cons)
}

fun main() {
    constrains(200)     // int
    constrains(2.00)    // double
    constrains(2000L)   // long

//    constrains("hallo")  error karna string not number
}