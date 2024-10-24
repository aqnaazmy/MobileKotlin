package week3.generic

fun <T> cetakIsi(isi:T){
    println(isi)
}

fun main() {
    cetakIsi("hello")
    cetakIsi(20)
    cetakIsi(true)
}